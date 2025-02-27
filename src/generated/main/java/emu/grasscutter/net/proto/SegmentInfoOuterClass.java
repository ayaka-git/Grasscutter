// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SegmentInfo.proto

package emu.grasscutter.net.proto;

public final class SegmentInfoOuterClass {
  private SegmentInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SegmentInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SegmentInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 module = 15;</code>
     * @return The module.
     */
    int getModule();

    /**
     * <code>uint32 size = 9;</code>
     * @return The size.
     */
    int getSize();

    /**
     * <code>uint32 offset = 3;</code>
     * @return The offset.
     */
    int getOffset();
  }
  /**
   * <pre>
   * Obf: HFJHDDHPCOB
   * </pre>
   *
   * Protobuf type {@code SegmentInfo}
   */
  public static final class SegmentInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SegmentInfo)
      SegmentInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SegmentInfo.newBuilder() to construct.
    private SegmentInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SegmentInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SegmentInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SegmentInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 24: {

              offset_ = input.readUInt32();
              break;
            }
            case 72: {

              size_ = input.readUInt32();
              break;
            }
            case 120: {

              module_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SegmentInfoOuterClass.internal_static_SegmentInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SegmentInfoOuterClass.internal_static_SegmentInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.class, emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.Builder.class);
    }

    public static final int MODULE_FIELD_NUMBER = 15;
    private int module_;
    /**
     * <code>uint32 module = 15;</code>
     * @return The module.
     */
    @java.lang.Override
    public int getModule() {
      return module_;
    }

    public static final int SIZE_FIELD_NUMBER = 9;
    private int size_;
    /**
     * <code>uint32 size = 9;</code>
     * @return The size.
     */
    @java.lang.Override
    public int getSize() {
      return size_;
    }

    public static final int OFFSET_FIELD_NUMBER = 3;
    private int offset_;
    /**
     * <code>uint32 offset = 3;</code>
     * @return The offset.
     */
    @java.lang.Override
    public int getOffset() {
      return offset_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (offset_ != 0) {
        output.writeUInt32(3, offset_);
      }
      if (size_ != 0) {
        output.writeUInt32(9, size_);
      }
      if (module_ != 0) {
        output.writeUInt32(15, module_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (offset_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, offset_);
      }
      if (size_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, size_);
      }
      if (module_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, module_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo other = (emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo) obj;

      if (getModule()
          != other.getModule()) return false;
      if (getSize()
          != other.getSize()) return false;
      if (getOffset()
          != other.getOffset()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MODULE_FIELD_NUMBER;
      hash = (53 * hash) + getModule();
      hash = (37 * hash) + SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getSize();
      hash = (37 * hash) + OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getOffset();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Obf: HFJHDDHPCOB
     * </pre>
     *
     * Protobuf type {@code SegmentInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SegmentInfo)
        emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SegmentInfoOuterClass.internal_static_SegmentInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SegmentInfoOuterClass.internal_static_SegmentInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.class, emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        module_ = 0;

        size_ = 0;

        offset_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SegmentInfoOuterClass.internal_static_SegmentInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo build() {
        emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo buildPartial() {
        emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo result = new emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo(this);
        result.module_ = module_;
        result.size_ = size_;
        result.offset_ = offset_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo other) {
        if (other == emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo.getDefaultInstance()) return this;
        if (other.getModule() != 0) {
          setModule(other.getModule());
        }
        if (other.getSize() != 0) {
          setSize(other.getSize());
        }
        if (other.getOffset() != 0) {
          setOffset(other.getOffset());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int module_ ;
      /**
       * <code>uint32 module = 15;</code>
       * @return The module.
       */
      @java.lang.Override
      public int getModule() {
        return module_;
      }
      /**
       * <code>uint32 module = 15;</code>
       * @param value The module to set.
       * @return This builder for chaining.
       */
      public Builder setModule(int value) {
        
        module_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 module = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearModule() {
        
        module_ = 0;
        onChanged();
        return this;
      }

      private int size_ ;
      /**
       * <code>uint32 size = 9;</code>
       * @return The size.
       */
      @java.lang.Override
      public int getSize() {
        return size_;
      }
      /**
       * <code>uint32 size = 9;</code>
       * @param value The size to set.
       * @return This builder for chaining.
       */
      public Builder setSize(int value) {
        
        size_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 size = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSize() {
        
        size_ = 0;
        onChanged();
        return this;
      }

      private int offset_ ;
      /**
       * <code>uint32 offset = 3;</code>
       * @return The offset.
       */
      @java.lang.Override
      public int getOffset() {
        return offset_;
      }
      /**
       * <code>uint32 offset = 3;</code>
       * @param value The offset to set.
       * @return This builder for chaining.
       */
      public Builder setOffset(int value) {
        
        offset_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 offset = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearOffset() {
        
        offset_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SegmentInfo)
    }

    // @@protoc_insertion_point(class_scope:SegmentInfo)
    private static final emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo();
    }

    public static emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SegmentInfo>
        PARSER = new com.google.protobuf.AbstractParser<SegmentInfo>() {
      @java.lang.Override
      public SegmentInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SegmentInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SegmentInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SegmentInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SegmentInfoOuterClass.SegmentInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SegmentInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SegmentInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021SegmentInfo.proto\";\n\013SegmentInfo\022\016\n\006mo" +
      "dule\030\017 \001(\r\022\014\n\004size\030\t \001(\r\022\016\n\006offset\030\003 \001(\r" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SegmentInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SegmentInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SegmentInfo_descriptor,
        new java.lang.String[] { "Module", "Size", "Offset", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
