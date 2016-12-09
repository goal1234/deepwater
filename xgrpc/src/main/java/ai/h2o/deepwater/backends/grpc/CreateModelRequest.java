// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc_service.proto

package ai.h2o.deepwater.backends.grpc;

/**
 * Protobuf type {@code deepwater.CreateModelRequest}
 */
public  final class CreateModelRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:deepwater.CreateModelRequest)
    CreateModelRequestOrBuilder {
  // Use CreateModelRequest.newBuilder() to construct.
  private CreateModelRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateModelRequest() {
    modelName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CreateModelRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            modelName_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              params_ = com.google.protobuf.MapField.newMapField(
                  ParamsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
            params__ = input.readMessage(
                ParamsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            params_.getMutableMap().put(
                params__.getKey(), params__.getValue());
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_CreateModelRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetParams();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_CreateModelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.h2o.deepwater.backends.grpc.CreateModelRequest.class, ai.h2o.deepwater.backends.grpc.CreateModelRequest.Builder.class);
  }

  private int bitField0_;
  public static final int MODELNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object modelName_;
  /**
   * <code>optional string modelName = 1;</code>
   */
  public java.lang.String getModelName() {
    java.lang.Object ref = modelName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      modelName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string modelName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getModelNameBytes() {
    java.lang.Object ref = modelName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      modelName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAMS_FIELD_NUMBER = 2;
  private static final class ParamsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>newDefaultInstance(
                ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_CreateModelRequest_ParamsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                ai.h2o.deepwater.backends.grpc.ParamValue.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> params_;
  private com.google.protobuf.MapField<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
  internalGetParams() {
    if (params_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ParamsDefaultEntryHolder.defaultEntry);
    }
    return params_;
  }

  public int getParamsCount() {
    return internalGetParams().getMap().size();
  }
  /**
   * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
   */

  public boolean containsParams(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetParams().getMap().containsKey(key);
  }
  /**
   * Use {@link #getParamsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> getParams() {
    return getParamsMap();
  }
  /**
   * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
   */

  public java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> getParamsMap() {
    return internalGetParams().getMap();
  }
  /**
   * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
   */

  public ai.h2o.deepwater.backends.grpc.ParamValue getParamsOrDefault(
      java.lang.String key,
      ai.h2o.deepwater.backends.grpc.ParamValue defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> map =
        internalGetParams().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
   */

  public ai.h2o.deepwater.backends.grpc.ParamValue getParamsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> map =
        internalGetParams().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getModelNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, modelName_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetParams(),
        ParamsDefaultEntryHolder.defaultEntry,
        2);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getModelNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, modelName_);
    }
    for (java.util.Map.Entry<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> entry
         : internalGetParams().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
      params__ = ParamsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, params__);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ai.h2o.deepwater.backends.grpc.CreateModelRequest)) {
      return super.equals(obj);
    }
    ai.h2o.deepwater.backends.grpc.CreateModelRequest other = (ai.h2o.deepwater.backends.grpc.CreateModelRequest) obj;

    boolean result = true;
    result = result && getModelName()
        .equals(other.getModelName());
    result = result && internalGetParams().equals(
        other.internalGetParams());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + MODELNAME_FIELD_NUMBER;
    hash = (53 * hash) + getModelName().hashCode();
    if (!internalGetParams().getMap().isEmpty()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetParams().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.h2o.deepwater.backends.grpc.CreateModelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.h2o.deepwater.backends.grpc.CreateModelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.h2o.deepwater.backends.grpc.CreateModelRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.h2o.deepwater.backends.grpc.CreateModelRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.h2o.deepwater.backends.grpc.CreateModelRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.h2o.deepwater.backends.grpc.CreateModelRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.h2o.deepwater.backends.grpc.CreateModelRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.h2o.deepwater.backends.grpc.CreateModelRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.h2o.deepwater.backends.grpc.CreateModelRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.h2o.deepwater.backends.grpc.CreateModelRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ai.h2o.deepwater.backends.grpc.CreateModelRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code deepwater.CreateModelRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:deepwater.CreateModelRequest)
      ai.h2o.deepwater.backends.grpc.CreateModelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_CreateModelRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetParams();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableParams();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_CreateModelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.h2o.deepwater.backends.grpc.CreateModelRequest.class, ai.h2o.deepwater.backends.grpc.CreateModelRequest.Builder.class);
    }

    // Construct using ai.h2o.deepwater.backends.grpc.CreateModelRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      modelName_ = "";

      internalGetMutableParams().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_CreateModelRequest_descriptor;
    }

    public ai.h2o.deepwater.backends.grpc.CreateModelRequest getDefaultInstanceForType() {
      return ai.h2o.deepwater.backends.grpc.CreateModelRequest.getDefaultInstance();
    }

    public ai.h2o.deepwater.backends.grpc.CreateModelRequest build() {
      ai.h2o.deepwater.backends.grpc.CreateModelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ai.h2o.deepwater.backends.grpc.CreateModelRequest buildPartial() {
      ai.h2o.deepwater.backends.grpc.CreateModelRequest result = new ai.h2o.deepwater.backends.grpc.CreateModelRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.modelName_ = modelName_;
      result.params_ = internalGetParams();
      result.params_.makeImmutable();
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.h2o.deepwater.backends.grpc.CreateModelRequest) {
        return mergeFrom((ai.h2o.deepwater.backends.grpc.CreateModelRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.h2o.deepwater.backends.grpc.CreateModelRequest other) {
      if (other == ai.h2o.deepwater.backends.grpc.CreateModelRequest.getDefaultInstance()) return this;
      if (!other.getModelName().isEmpty()) {
        modelName_ = other.modelName_;
        onChanged();
      }
      internalGetMutableParams().mergeFrom(
          other.internalGetParams());
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ai.h2o.deepwater.backends.grpc.CreateModelRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.h2o.deepwater.backends.grpc.CreateModelRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object modelName_ = "";
    /**
     * <code>optional string modelName = 1;</code>
     */
    public java.lang.String getModelName() {
      java.lang.Object ref = modelName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        modelName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string modelName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getModelNameBytes() {
      java.lang.Object ref = modelName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        modelName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string modelName = 1;</code>
     */
    public Builder setModelName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      modelName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string modelName = 1;</code>
     */
    public Builder clearModelName() {
      
      modelName_ = getDefaultInstance().getModelName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string modelName = 1;</code>
     */
    public Builder setModelNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      modelName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> params_;
    private com.google.protobuf.MapField<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
    internalGetParams() {
      if (params_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ParamsDefaultEntryHolder.defaultEntry);
      }
      return params_;
    }
    private com.google.protobuf.MapField<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
    internalGetMutableParams() {
      onChanged();;
      if (params_ == null) {
        params_ = com.google.protobuf.MapField.newMapField(
            ParamsDefaultEntryHolder.defaultEntry);
      }
      if (!params_.isMutable()) {
        params_ = params_.copy();
      }
      return params_;
    }

    public int getParamsCount() {
      return internalGetParams().getMap().size();
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
     */

    public boolean containsParams(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetParams().getMap().containsKey(key);
    }
    /**
     * Use {@link #getParamsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> getParams() {
      return getParamsMap();
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
     */

    public java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> getParamsMap() {
      return internalGetParams().getMap();
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
     */

    public ai.h2o.deepwater.backends.grpc.ParamValue getParamsOrDefault(
        java.lang.String key,
        ai.h2o.deepwater.backends.grpc.ParamValue defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> map =
          internalGetParams().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
     */

    public ai.h2o.deepwater.backends.grpc.ParamValue getParamsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> map =
          internalGetParams().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearParams() {
      getMutableParams().clear();
      return this;
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
     */

    public Builder removeParams(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      getMutableParams().remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
    getMutableParams() {
      return internalGetMutableParams().getMutableMap();
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
     */
    public Builder putParams(
        java.lang.String key,
        ai.h2o.deepwater.backends.grpc.ParamValue value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      getMutableParams().put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 2;</code>
     */

    public Builder putAllParams(
        java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> values) {
      getMutableParams().putAll(values);
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:deepwater.CreateModelRequest)
  }

  // @@protoc_insertion_point(class_scope:deepwater.CreateModelRequest)
  private static final ai.h2o.deepwater.backends.grpc.CreateModelRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.h2o.deepwater.backends.grpc.CreateModelRequest();
  }

  public static ai.h2o.deepwater.backends.grpc.CreateModelRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateModelRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateModelRequest>() {
    public CreateModelRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateModelRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateModelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateModelRequest> getParserForType() {
    return PARSER;
  }

  public ai.h2o.deepwater.backends.grpc.CreateModelRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
