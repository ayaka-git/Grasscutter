// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtSetAttackTargetNotify.proto

package emu.grasscutter.net.proto;

public final class EvtSetAttackTargetNotifyOuterClass {
  private EvtSetAttackTargetNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtSetAttackTargetNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtSetAttackTargetNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.EvtSetAttackTargetInfo evt_set_attack_target_info = 2;</code>
     * @return Whether the evtSetAttackTargetInfo field is set.
     */
    boolean hasEvtSetAttackTargetInfo();
    /**
     * <code>.EvtSetAttackTargetInfo evt_set_attack_target_info = 2;</code>
     * @return The evtSetAttackTargetInfo.
     */
    emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo getEvtSetAttackTargetInfo();
    /**
     * <code>.EvtSetAttackTargetInfo evt_set_attack_target_info = 2;</code>
     */
    emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfoOrBuilder getEvtSetAttackTargetInfoOrBuilder();

    /**
     * <code>.ForwardType forward_type = 9;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 9;</code>
     * @return The forwardType.
     */
    emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType();
  }
  /**
   * <pre>
   * CmdId: 330
   * Obf: FPMNNPLLLEO
   * </pre>
   *
   * Protobuf type {@code EvtSetAttackTargetNotify}
   */
  public static final class EvtSetAttackTargetNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtSetAttackTargetNotify)
      EvtSetAttackTargetNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtSetAttackTargetNotify.newBuilder() to construct.
    private EvtSetAttackTargetNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtSetAttackTargetNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtSetAttackTargetNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtSetAttackTargetNotify(
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
            case 18: {
              emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.Builder subBuilder = null;
              if (evtSetAttackTargetInfo_ != null) {
                subBuilder = evtSetAttackTargetInfo_.toBuilder();
              }
              evtSetAttackTargetInfo_ = input.readMessage(emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(evtSetAttackTargetInfo_);
                evtSetAttackTargetInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 72: {
              int rawValue = input.readEnum();

              forwardType_ = rawValue;
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
      return emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.internal_static_EvtSetAttackTargetNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.internal_static_EvtSetAttackTargetNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify.class, emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify.Builder.class);
    }

    public static final int EVT_SET_ATTACK_TARGET_INFO_FIELD_NUMBER = 2;
    private emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo evtSetAttackTargetInfo_;
    /**
     * <code>.EvtSetAttackTargetInfo evt_set_attack_target_info = 2;</code>
     * @return Whether the evtSetAttackTargetInfo field is set.
     */
    @java.lang.Override
    public boolean hasEvtSetAttackTargetInfo() {
      return evtSetAttackTargetInfo_ != null;
    }
    /**
     * <code>.EvtSetAttackTargetInfo evt_set_attack_target_info = 2;</code>
     * @return The evtSetAttackTargetInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo getEvtSetAttackTargetInfo() {
      return evtSetAttackTargetInfo_ == null ? emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.getDefaultInstance() : evtSetAttackTargetInfo_;
    }
    /**
     * <code>.EvtSetAttackTargetInfo evt_set_attack_target_info = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfoOrBuilder getEvtSetAttackTargetInfoOrBuilder() {
      return getEvtSetAttackTargetInfo();
    }

    public static final int FORWARD_TYPE_FIELD_NUMBER = 9;
    private int forwardType_;
    /**
     * <code>.ForwardType forward_type = 9;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 9;</code>
     * @return The forwardType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
      return result == null ? emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
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
      if (evtSetAttackTargetInfo_ != null) {
        output.writeMessage(2, getEvtSetAttackTargetInfo());
      }
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(9, forwardType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (evtSetAttackTargetInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getEvtSetAttackTargetInfo());
      }
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, forwardType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify other = (emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify) obj;

      if (hasEvtSetAttackTargetInfo() != other.hasEvtSetAttackTargetInfo()) return false;
      if (hasEvtSetAttackTargetInfo()) {
        if (!getEvtSetAttackTargetInfo()
            .equals(other.getEvtSetAttackTargetInfo())) return false;
      }
      if (forwardType_ != other.forwardType_) return false;
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
      if (hasEvtSetAttackTargetInfo()) {
        hash = (37 * hash) + EVT_SET_ATTACK_TARGET_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getEvtSetAttackTargetInfo().hashCode();
      }
      hash = (37 * hash) + FORWARD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify prototype) {
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
     * CmdId: 330
     * Obf: FPMNNPLLLEO
     * </pre>
     *
     * Protobuf type {@code EvtSetAttackTargetNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtSetAttackTargetNotify)
        emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.internal_static_EvtSetAttackTargetNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.internal_static_EvtSetAttackTargetNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify.class, emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify.newBuilder()
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
        if (evtSetAttackTargetInfoBuilder_ == null) {
          evtSetAttackTargetInfo_ = null;
        } else {
          evtSetAttackTargetInfo_ = null;
          evtSetAttackTargetInfoBuilder_ = null;
        }
        forwardType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.internal_static_EvtSetAttackTargetNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify build() {
        emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify buildPartial() {
        emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify result = new emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify(this);
        if (evtSetAttackTargetInfoBuilder_ == null) {
          result.evtSetAttackTargetInfo_ = evtSetAttackTargetInfo_;
        } else {
          result.evtSetAttackTargetInfo_ = evtSetAttackTargetInfoBuilder_.build();
        }
        result.forwardType_ = forwardType_;
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
        if (other instanceof emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify other) {
        if (other == emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify.getDefaultInstance()) return this;
        if (other.hasEvtSetAttackTargetInfo()) {
          mergeEvtSetAttackTargetInfo(other.getEvtSetAttackTargetInfo());
        }
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
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
        emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo evtSetAttackTargetInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo, emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.Builder, emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfoOrBuilder> evtSetAttackTargetInfoBuilder_;
      /**
       * <code>.EvtSetAttackTargetInfo evt_set_attack_target_info = 2;</code>
       * @return Whether the evtSetAttackTargetInfo field is set.
       */
      public boolean hasEvtSetAttackTargetInfo() {
        return evtSetAttackTargetInfoBuilder_ != null || evtSetAttackTargetInfo_ != null;
      }
      /**
       * <code>.EvtSetAttackTargetInfo evt_set_attack_target_info = 2;</code>
       * @return The evtSetAttackTargetInfo.
       */
      public emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo getEvtSetAttackTargetInfo() {
        if (evtSetAttackTargetInfoBuilder_ == null) {
          return evtSetAttackTargetInfo_ == null ? emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.getDefaultInstance() : evtSetAttackTargetInfo_;
        } else {
          return evtSetAttackTargetInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.EvtSetAttackTargetInfo evt_set_attack_target_info = 2;</code>
       */
      public Builder setEvtSetAttackTargetInfo(emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo value) {
        if (evtSetAttackTargetInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          evtSetAttackTargetInfo_ = value;
          onChanged();
        } else {
          evtSetAttackTargetInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.EvtSetAttackTargetInfo evt_set_attack_target_info = 2;</code>
       */
      public Builder setEvtSetAttackTargetInfo(
          emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.Builder builderForValue) {
        if (evtSetAttackTargetInfoBuilder_ == null) {
          evtSetAttackTargetInfo_ = builderForValue.build();
          onChanged();
        } else {
          evtSetAttackTargetInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.EvtSetAttackTargetInfo evt_set_attack_target_info = 2;</code>
       */
      public Builder mergeEvtSetAttackTargetInfo(emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo value) {
        if (evtSetAttackTargetInfoBuilder_ == null) {
          if (evtSetAttackTargetInfo_ != null) {
            evtSetAttackTargetInfo_ =
              emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.newBuilder(evtSetAttackTargetInfo_).mergeFrom(value).buildPartial();
          } else {
            evtSetAttackTargetInfo_ = value;
          }
          onChanged();
        } else {
          evtSetAttackTargetInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.EvtSetAttackTargetInfo evt_set_attack_target_info = 2;</code>
       */
      public Builder clearEvtSetAttackTargetInfo() {
        if (evtSetAttackTargetInfoBuilder_ == null) {
          evtSetAttackTargetInfo_ = null;
          onChanged();
        } else {
          evtSetAttackTargetInfo_ = null;
          evtSetAttackTargetInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.EvtSetAttackTargetInfo evt_set_attack_target_info = 2;</code>
       */
      public emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.Builder getEvtSetAttackTargetInfoBuilder() {
        
        onChanged();
        return getEvtSetAttackTargetInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.EvtSetAttackTargetInfo evt_set_attack_target_info = 2;</code>
       */
      public emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfoOrBuilder getEvtSetAttackTargetInfoOrBuilder() {
        if (evtSetAttackTargetInfoBuilder_ != null) {
          return evtSetAttackTargetInfoBuilder_.getMessageOrBuilder();
        } else {
          return evtSetAttackTargetInfo_ == null ?
              emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.getDefaultInstance() : evtSetAttackTargetInfo_;
        }
      }
      /**
       * <code>.EvtSetAttackTargetInfo evt_set_attack_target_info = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo, emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.Builder, emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfoOrBuilder> 
          getEvtSetAttackTargetInfoFieldBuilder() {
        if (evtSetAttackTargetInfoBuilder_ == null) {
          evtSetAttackTargetInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo, emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.Builder, emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfoOrBuilder>(
                  getEvtSetAttackTargetInfo(),
                  getParentForChildren(),
                  isClean());
          evtSetAttackTargetInfo_ = null;
        }
        return evtSetAttackTargetInfoBuilder_;
      }

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @param value The forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardType(emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        forwardType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        
        forwardType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EvtSetAttackTargetNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtSetAttackTargetNotify)
    private static final emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify();
    }

    public static emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtSetAttackTargetNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtSetAttackTargetNotify>() {
      @java.lang.Override
      public EvtSetAttackTargetNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtSetAttackTargetNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtSetAttackTargetNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtSetAttackTargetNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EvtSetAttackTargetNotifyOuterClass.EvtSetAttackTargetNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtSetAttackTargetNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtSetAttackTargetNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036EvtSetAttackTargetNotify.proto\032\034EvtSet" +
      "AttackTargetInfo.proto\032\021ForwardType.prot" +
      "o\"{\n\030EvtSetAttackTargetNotify\022;\n\032evt_set" +
      "_attack_target_info\030\002 \001(\0132\027.EvtSetAttack" +
      "TargetInfo\022\"\n\014forward_type\030\t \001(\0162\014.Forwa" +
      "rdTypeB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor(),
        });
    internal_static_EvtSetAttackTargetNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtSetAttackTargetNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtSetAttackTargetNotify_descriptor,
        new java.lang.String[] { "EvtSetAttackTargetInfo", "ForwardType", });
    emu.grasscutter.net.proto.EvtSetAttackTargetInfoOuterClass.getDescriptor();
    emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
