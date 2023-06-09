# 基于 Maven 和 Java 17 镜像构建 Docker 镜像
FROM gradle:jdk17 AS build
# 指定工作目录
WORKDIR /app
# 将项目文件复制到容器中
COPY . .

# 编译
RUN chmod +x gradlew
RUN ./gradlew jar --stacktrace

# 使用 Java 17 的镜像作为基础镜像 
FROM docker.io/library/openjdk:17-jdk-slim

# 将 JAR 文件复制到容器中 
COPY --from=build /app/*.jar grasscutter.jar

# 在容器中运行应用程序 
ENTRYPOINT ["java", "-jar", "/grasscutter.jar"]

# 要构建镜像，请执行下面的命令
# docker build -t <image_name> .
# docker build -t test .
