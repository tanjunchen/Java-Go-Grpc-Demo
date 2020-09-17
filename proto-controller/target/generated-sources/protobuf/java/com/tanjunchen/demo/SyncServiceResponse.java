// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package com.tanjunchen.demo;

/**
 * Protobuf type {@code k8s.SyncServiceResponse}
 */
public  final class SyncServiceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:k8s.SyncServiceResponse)
    SyncServiceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SyncServiceResponse.newBuilder() to construct.
  private SyncServiceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SyncServiceResponse() {
    namespace_ = "";
    syncServiceInfo_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SyncServiceResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            namespace_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              syncServiceInfo_ = new java.util.ArrayList<com.tanjunchen.demo.SyncServiceInfo>();
              mutable_bitField0_ |= 0x00000002;
            }
            syncServiceInfo_.add(
                input.readMessage(com.tanjunchen.demo.SyncServiceInfo.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        syncServiceInfo_ = java.util.Collections.unmodifiableList(syncServiceInfo_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tanjunchen.demo.k8sServiceProto.internal_static_k8s_SyncServiceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tanjunchen.demo.k8sServiceProto.internal_static_k8s_SyncServiceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tanjunchen.demo.SyncServiceResponse.class, com.tanjunchen.demo.SyncServiceResponse.Builder.class);
  }

  private int bitField0_;
  public static final int NAMESPACE_FIELD_NUMBER = 1;
  private volatile java.lang.Object namespace_;
  /**
   * <pre>
   * 命名空间
   * </pre>
   *
   * <code>string namespace = 1;</code>
   */
  public java.lang.String getNamespace() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namespace_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 命名空间
   * </pre>
   *
   * <code>string namespace = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNamespaceBytes() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      namespace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SYNCSERVICEINFO_FIELD_NUMBER = 2;
  private java.util.List<com.tanjunchen.demo.SyncServiceInfo> syncServiceInfo_;
  /**
   * <pre>
   * service 的事件数据
   * </pre>
   *
   * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
   */
  public java.util.List<com.tanjunchen.demo.SyncServiceInfo> getSyncServiceInfoList() {
    return syncServiceInfo_;
  }
  /**
   * <pre>
   * service 的事件数据
   * </pre>
   *
   * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
   */
  public java.util.List<? extends com.tanjunchen.demo.SyncServiceInfoOrBuilder> 
      getSyncServiceInfoOrBuilderList() {
    return syncServiceInfo_;
  }
  /**
   * <pre>
   * service 的事件数据
   * </pre>
   *
   * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
   */
  public int getSyncServiceInfoCount() {
    return syncServiceInfo_.size();
  }
  /**
   * <pre>
   * service 的事件数据
   * </pre>
   *
   * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
   */
  public com.tanjunchen.demo.SyncServiceInfo getSyncServiceInfo(int index) {
    return syncServiceInfo_.get(index);
  }
  /**
   * <pre>
   * service 的事件数据
   * </pre>
   *
   * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
   */
  public com.tanjunchen.demo.SyncServiceInfoOrBuilder getSyncServiceInfoOrBuilder(
      int index) {
    return syncServiceInfo_.get(index);
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
    if (!getNamespaceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, namespace_);
    }
    for (int i = 0; i < syncServiceInfo_.size(); i++) {
      output.writeMessage(2, syncServiceInfo_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNamespaceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, namespace_);
    }
    for (int i = 0; i < syncServiceInfo_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, syncServiceInfo_.get(i));
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
    if (!(obj instanceof com.tanjunchen.demo.SyncServiceResponse)) {
      return super.equals(obj);
    }
    com.tanjunchen.demo.SyncServiceResponse other = (com.tanjunchen.demo.SyncServiceResponse) obj;

    if (!getNamespace()
        .equals(other.getNamespace())) return false;
    if (!getSyncServiceInfoList()
        .equals(other.getSyncServiceInfoList())) return false;
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
    hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
    hash = (53 * hash) + getNamespace().hashCode();
    if (getSyncServiceInfoCount() > 0) {
      hash = (37 * hash) + SYNCSERVICEINFO_FIELD_NUMBER;
      hash = (53 * hash) + getSyncServiceInfoList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tanjunchen.demo.SyncServiceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tanjunchen.demo.SyncServiceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tanjunchen.demo.SyncServiceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tanjunchen.demo.SyncServiceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tanjunchen.demo.SyncServiceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tanjunchen.demo.SyncServiceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tanjunchen.demo.SyncServiceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tanjunchen.demo.SyncServiceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tanjunchen.demo.SyncServiceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tanjunchen.demo.SyncServiceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tanjunchen.demo.SyncServiceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tanjunchen.demo.SyncServiceResponse parseFrom(
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
  public static Builder newBuilder(com.tanjunchen.demo.SyncServiceResponse prototype) {
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
   * Protobuf type {@code k8s.SyncServiceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:k8s.SyncServiceResponse)
      com.tanjunchen.demo.SyncServiceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tanjunchen.demo.k8sServiceProto.internal_static_k8s_SyncServiceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tanjunchen.demo.k8sServiceProto.internal_static_k8s_SyncServiceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tanjunchen.demo.SyncServiceResponse.class, com.tanjunchen.demo.SyncServiceResponse.Builder.class);
    }

    // Construct using com.tanjunchen.demo.SyncServiceResponse.newBuilder()
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
        getSyncServiceInfoFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      namespace_ = "";

      if (syncServiceInfoBuilder_ == null) {
        syncServiceInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        syncServiceInfoBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tanjunchen.demo.k8sServiceProto.internal_static_k8s_SyncServiceResponse_descriptor;
    }

    @java.lang.Override
    public com.tanjunchen.demo.SyncServiceResponse getDefaultInstanceForType() {
      return com.tanjunchen.demo.SyncServiceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tanjunchen.demo.SyncServiceResponse build() {
      com.tanjunchen.demo.SyncServiceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tanjunchen.demo.SyncServiceResponse buildPartial() {
      com.tanjunchen.demo.SyncServiceResponse result = new com.tanjunchen.demo.SyncServiceResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.namespace_ = namespace_;
      if (syncServiceInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          syncServiceInfo_ = java.util.Collections.unmodifiableList(syncServiceInfo_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.syncServiceInfo_ = syncServiceInfo_;
      } else {
        result.syncServiceInfo_ = syncServiceInfoBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.tanjunchen.demo.SyncServiceResponse) {
        return mergeFrom((com.tanjunchen.demo.SyncServiceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tanjunchen.demo.SyncServiceResponse other) {
      if (other == com.tanjunchen.demo.SyncServiceResponse.getDefaultInstance()) return this;
      if (!other.getNamespace().isEmpty()) {
        namespace_ = other.namespace_;
        onChanged();
      }
      if (syncServiceInfoBuilder_ == null) {
        if (!other.syncServiceInfo_.isEmpty()) {
          if (syncServiceInfo_.isEmpty()) {
            syncServiceInfo_ = other.syncServiceInfo_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSyncServiceInfoIsMutable();
            syncServiceInfo_.addAll(other.syncServiceInfo_);
          }
          onChanged();
        }
      } else {
        if (!other.syncServiceInfo_.isEmpty()) {
          if (syncServiceInfoBuilder_.isEmpty()) {
            syncServiceInfoBuilder_.dispose();
            syncServiceInfoBuilder_ = null;
            syncServiceInfo_ = other.syncServiceInfo_;
            bitField0_ = (bitField0_ & ~0x00000002);
            syncServiceInfoBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSyncServiceInfoFieldBuilder() : null;
          } else {
            syncServiceInfoBuilder_.addAllMessages(other.syncServiceInfo_);
          }
        }
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
      com.tanjunchen.demo.SyncServiceResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tanjunchen.demo.SyncServiceResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object namespace_ = "";
    /**
     * <pre>
     * 命名空间
     * </pre>
     *
     * <code>string namespace = 1;</code>
     */
    public java.lang.String getNamespace() {
      java.lang.Object ref = namespace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namespace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 命名空间
     * </pre>
     *
     * <code>string namespace = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNamespaceBytes() {
      java.lang.Object ref = namespace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        namespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 命名空间
     * </pre>
     *
     * <code>string namespace = 1;</code>
     */
    public Builder setNamespace(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      namespace_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 命名空间
     * </pre>
     *
     * <code>string namespace = 1;</code>
     */
    public Builder clearNamespace() {
      
      namespace_ = getDefaultInstance().getNamespace();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 命名空间
     * </pre>
     *
     * <code>string namespace = 1;</code>
     */
    public Builder setNamespaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      namespace_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.tanjunchen.demo.SyncServiceInfo> syncServiceInfo_ =
      java.util.Collections.emptyList();
    private void ensureSyncServiceInfoIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        syncServiceInfo_ = new java.util.ArrayList<com.tanjunchen.demo.SyncServiceInfo>(syncServiceInfo_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tanjunchen.demo.SyncServiceInfo, com.tanjunchen.demo.SyncServiceInfo.Builder, com.tanjunchen.demo.SyncServiceInfoOrBuilder> syncServiceInfoBuilder_;

    /**
     * <pre>
     * service 的事件数据
     * </pre>
     *
     * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
     */
    public java.util.List<com.tanjunchen.demo.SyncServiceInfo> getSyncServiceInfoList() {
      if (syncServiceInfoBuilder_ == null) {
        return java.util.Collections.unmodifiableList(syncServiceInfo_);
      } else {
        return syncServiceInfoBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * service 的事件数据
     * </pre>
     *
     * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
     */
    public int getSyncServiceInfoCount() {
      if (syncServiceInfoBuilder_ == null) {
        return syncServiceInfo_.size();
      } else {
        return syncServiceInfoBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * service 的事件数据
     * </pre>
     *
     * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
     */
    public com.tanjunchen.demo.SyncServiceInfo getSyncServiceInfo(int index) {
      if (syncServiceInfoBuilder_ == null) {
        return syncServiceInfo_.get(index);
      } else {
        return syncServiceInfoBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * service 的事件数据
     * </pre>
     *
     * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
     */
    public Builder setSyncServiceInfo(
        int index, com.tanjunchen.demo.SyncServiceInfo value) {
      if (syncServiceInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSyncServiceInfoIsMutable();
        syncServiceInfo_.set(index, value);
        onChanged();
      } else {
        syncServiceInfoBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * service 的事件数据
     * </pre>
     *
     * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
     */
    public Builder setSyncServiceInfo(
        int index, com.tanjunchen.demo.SyncServiceInfo.Builder builderForValue) {
      if (syncServiceInfoBuilder_ == null) {
        ensureSyncServiceInfoIsMutable();
        syncServiceInfo_.set(index, builderForValue.build());
        onChanged();
      } else {
        syncServiceInfoBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * service 的事件数据
     * </pre>
     *
     * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
     */
    public Builder addSyncServiceInfo(com.tanjunchen.demo.SyncServiceInfo value) {
      if (syncServiceInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSyncServiceInfoIsMutable();
        syncServiceInfo_.add(value);
        onChanged();
      } else {
        syncServiceInfoBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * service 的事件数据
     * </pre>
     *
     * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
     */
    public Builder addSyncServiceInfo(
        int index, com.tanjunchen.demo.SyncServiceInfo value) {
      if (syncServiceInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSyncServiceInfoIsMutable();
        syncServiceInfo_.add(index, value);
        onChanged();
      } else {
        syncServiceInfoBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * service 的事件数据
     * </pre>
     *
     * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
     */
    public Builder addSyncServiceInfo(
        com.tanjunchen.demo.SyncServiceInfo.Builder builderForValue) {
      if (syncServiceInfoBuilder_ == null) {
        ensureSyncServiceInfoIsMutable();
        syncServiceInfo_.add(builderForValue.build());
        onChanged();
      } else {
        syncServiceInfoBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * service 的事件数据
     * </pre>
     *
     * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
     */
    public Builder addSyncServiceInfo(
        int index, com.tanjunchen.demo.SyncServiceInfo.Builder builderForValue) {
      if (syncServiceInfoBuilder_ == null) {
        ensureSyncServiceInfoIsMutable();
        syncServiceInfo_.add(index, builderForValue.build());
        onChanged();
      } else {
        syncServiceInfoBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * service 的事件数据
     * </pre>
     *
     * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
     */
    public Builder addAllSyncServiceInfo(
        java.lang.Iterable<? extends com.tanjunchen.demo.SyncServiceInfo> values) {
      if (syncServiceInfoBuilder_ == null) {
        ensureSyncServiceInfoIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, syncServiceInfo_);
        onChanged();
      } else {
        syncServiceInfoBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * service 的事件数据
     * </pre>
     *
     * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
     */
    public Builder clearSyncServiceInfo() {
      if (syncServiceInfoBuilder_ == null) {
        syncServiceInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        syncServiceInfoBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * service 的事件数据
     * </pre>
     *
     * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
     */
    public Builder removeSyncServiceInfo(int index) {
      if (syncServiceInfoBuilder_ == null) {
        ensureSyncServiceInfoIsMutable();
        syncServiceInfo_.remove(index);
        onChanged();
      } else {
        syncServiceInfoBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * service 的事件数据
     * </pre>
     *
     * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
     */
    public com.tanjunchen.demo.SyncServiceInfo.Builder getSyncServiceInfoBuilder(
        int index) {
      return getSyncServiceInfoFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * service 的事件数据
     * </pre>
     *
     * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
     */
    public com.tanjunchen.demo.SyncServiceInfoOrBuilder getSyncServiceInfoOrBuilder(
        int index) {
      if (syncServiceInfoBuilder_ == null) {
        return syncServiceInfo_.get(index);  } else {
        return syncServiceInfoBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * service 的事件数据
     * </pre>
     *
     * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
     */
    public java.util.List<? extends com.tanjunchen.demo.SyncServiceInfoOrBuilder> 
         getSyncServiceInfoOrBuilderList() {
      if (syncServiceInfoBuilder_ != null) {
        return syncServiceInfoBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(syncServiceInfo_);
      }
    }
    /**
     * <pre>
     * service 的事件数据
     * </pre>
     *
     * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
     */
    public com.tanjunchen.demo.SyncServiceInfo.Builder addSyncServiceInfoBuilder() {
      return getSyncServiceInfoFieldBuilder().addBuilder(
          com.tanjunchen.demo.SyncServiceInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * service 的事件数据
     * </pre>
     *
     * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
     */
    public com.tanjunchen.demo.SyncServiceInfo.Builder addSyncServiceInfoBuilder(
        int index) {
      return getSyncServiceInfoFieldBuilder().addBuilder(
          index, com.tanjunchen.demo.SyncServiceInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * service 的事件数据
     * </pre>
     *
     * <code>repeated .k8s.SyncServiceInfo syncServiceInfo = 2;</code>
     */
    public java.util.List<com.tanjunchen.demo.SyncServiceInfo.Builder> 
         getSyncServiceInfoBuilderList() {
      return getSyncServiceInfoFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tanjunchen.demo.SyncServiceInfo, com.tanjunchen.demo.SyncServiceInfo.Builder, com.tanjunchen.demo.SyncServiceInfoOrBuilder> 
        getSyncServiceInfoFieldBuilder() {
      if (syncServiceInfoBuilder_ == null) {
        syncServiceInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tanjunchen.demo.SyncServiceInfo, com.tanjunchen.demo.SyncServiceInfo.Builder, com.tanjunchen.demo.SyncServiceInfoOrBuilder>(
                syncServiceInfo_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        syncServiceInfo_ = null;
      }
      return syncServiceInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:k8s.SyncServiceResponse)
  }

  // @@protoc_insertion_point(class_scope:k8s.SyncServiceResponse)
  private static final com.tanjunchen.demo.SyncServiceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tanjunchen.demo.SyncServiceResponse();
  }

  public static com.tanjunchen.demo.SyncServiceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SyncServiceResponse>
      PARSER = new com.google.protobuf.AbstractParser<SyncServiceResponse>() {
    @java.lang.Override
    public SyncServiceResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SyncServiceResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SyncServiceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SyncServiceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tanjunchen.demo.SyncServiceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

