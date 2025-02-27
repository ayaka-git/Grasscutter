// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarPromoteGetRewardRsp.proto

package emu.grasscutter.net.proto;

public final class AvatarPromoteGetRewardRspOuterClass {
  private AvatarPromoteGetRewardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarPromoteGetRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarPromoteGetRewardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint64 avatar_guid = 2;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>uint32 reward_id = 8;</code>
     * @return The rewardId.
     */
    int getRewardId();

    /**
     * <code>uint32 promote_level = 6;</code>
     * @return The promoteLevel.
     */
    int getPromoteLevel();
  }
  /**
   * <pre>
   * CmdId: 1785
   * Obf: FJLFCILPCAG
   * </pre>
   *
   * Protobuf type {@code AvatarPromoteGetRewardRsp}
   */
  public static final class AvatarPromoteGetRewardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarPromoteGetRewardRsp)
      AvatarPromoteGetRewardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarPromoteGetRewardRsp.newBuilder() to construct.
    private AvatarPromoteGetRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarPromoteGetRewardRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarPromoteGetRewardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarPromoteGetRewardRsp(
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
            case 16: {

              avatarGuid_ = input.readUInt64();
              break;
            }
            case 48: {

              promoteLevel_ = input.readUInt32();
              break;
            }
            case 64: {

              rewardId_ = input.readUInt32();
              break;
            }
            case 72: {

              retcode_ = input.readInt32();
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
      return emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.internal_static_AvatarPromoteGetRewardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.internal_static_AvatarPromoteGetRewardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp.class, emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 2;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 2;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int REWARD_ID_FIELD_NUMBER = 8;
    private int rewardId_;
    /**
     * <code>uint32 reward_id = 8;</code>
     * @return The rewardId.
     */
    @java.lang.Override
    public int getRewardId() {
      return rewardId_;
    }

    public static final int PROMOTE_LEVEL_FIELD_NUMBER = 6;
    private int promoteLevel_;
    /**
     * <code>uint32 promote_level = 6;</code>
     * @return The promoteLevel.
     */
    @java.lang.Override
    public int getPromoteLevel() {
      return promoteLevel_;
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
      if (avatarGuid_ != 0L) {
        output.writeUInt64(2, avatarGuid_);
      }
      if (promoteLevel_ != 0) {
        output.writeUInt32(6, promoteLevel_);
      }
      if (rewardId_ != 0) {
        output.writeUInt32(8, rewardId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, avatarGuid_);
      }
      if (promoteLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, promoteLevel_);
      }
      if (rewardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, rewardId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp other = (emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getRewardId()
          != other.getRewardId()) return false;
      if (getPromoteLevel()
          != other.getPromoteLevel()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + REWARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRewardId();
      hash = (37 * hash) + PROMOTE_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getPromoteLevel();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp prototype) {
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
     * CmdId: 1785
     * Obf: FJLFCILPCAG
     * </pre>
     *
     * Protobuf type {@code AvatarPromoteGetRewardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarPromoteGetRewardRsp)
        emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.internal_static_AvatarPromoteGetRewardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.internal_static_AvatarPromoteGetRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp.class, emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp.newBuilder()
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
        retcode_ = 0;

        avatarGuid_ = 0L;

        rewardId_ = 0;

        promoteLevel_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.internal_static_AvatarPromoteGetRewardRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp build() {
        emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp buildPartial() {
        emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp result = new emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp(this);
        result.retcode_ = retcode_;
        result.avatarGuid_ = avatarGuid_;
        result.rewardId_ = rewardId_;
        result.promoteLevel_ = promoteLevel_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp other) {
        if (other == emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getRewardId() != 0) {
          setRewardId(other.getRewardId());
        }
        if (other.getPromoteLevel() != 0) {
          setPromoteLevel(other.getPromoteLevel());
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
        emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 2;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 2;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int rewardId_ ;
      /**
       * <code>uint32 reward_id = 8;</code>
       * @return The rewardId.
       */
      @java.lang.Override
      public int getRewardId() {
        return rewardId_;
      }
      /**
       * <code>uint32 reward_id = 8;</code>
       * @param value The rewardId to set.
       * @return This builder for chaining.
       */
      public Builder setRewardId(int value) {
        
        rewardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardId() {
        
        rewardId_ = 0;
        onChanged();
        return this;
      }

      private int promoteLevel_ ;
      /**
       * <code>uint32 promote_level = 6;</code>
       * @return The promoteLevel.
       */
      @java.lang.Override
      public int getPromoteLevel() {
        return promoteLevel_;
      }
      /**
       * <code>uint32 promote_level = 6;</code>
       * @param value The promoteLevel to set.
       * @return This builder for chaining.
       */
      public Builder setPromoteLevel(int value) {
        
        promoteLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 promote_level = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearPromoteLevel() {
        
        promoteLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarPromoteGetRewardRsp)
    }

    // @@protoc_insertion_point(class_scope:AvatarPromoteGetRewardRsp)
    private static final emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp();
    }

    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarPromoteGetRewardRsp>
        PARSER = new com.google.protobuf.AbstractParser<AvatarPromoteGetRewardRsp>() {
      @java.lang.Override
      public AvatarPromoteGetRewardRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarPromoteGetRewardRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarPromoteGetRewardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarPromoteGetRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarPromoteGetRewardRspOuterClass.AvatarPromoteGetRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarPromoteGetRewardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarPromoteGetRewardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037AvatarPromoteGetRewardRsp.proto\"k\n\031Ava" +
      "tarPromoteGetRewardRsp\022\017\n\007retcode\030\t \001(\005\022" +
      "\023\n\013avatar_guid\030\002 \001(\004\022\021\n\treward_id\030\010 \001(\r\022" +
      "\025\n\rpromote_level\030\006 \001(\rB\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarPromoteGetRewardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarPromoteGetRewardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarPromoteGetRewardRsp_descriptor,
        new java.lang.String[] { "Retcode", "AvatarGuid", "RewardId", "PromoteLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
