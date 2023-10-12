/*
 * Copyright 2013-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf_test.proto

package org.springframework.cloud.openfeign.encoding.proto;

/**
 * Protobuf type {@code Request}
 */
public final class Request extends com.google.protobuf.GeneratedMessageV3 implements
		// @@protoc_insertion_point(message_implements:Request)
		org.springframework.cloud.openfeign.encoding.proto.RequestOrBuilder {

	public static final int ID_FIELD_NUMBER = 1;

	public static final int MSG_FIELD_NUMBER = 2;

	private static final long serialVersionUID = 0L;

	// @@protoc_insertion_point(class_scope:Request)
	private static final Request DEFAULT_INSTANCE;

	private static final com.google.protobuf.Parser<Request> PARSER = new com.google.protobuf.AbstractParser<>() {
		public Request parsePartialFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return new Request(input, extensionRegistry);
		}
	};

	static {
		DEFAULT_INSTANCE = new Request();
	}

	private int id_;

	private volatile Object msg_;

	private byte memoizedIsInitialized = -1;

	// Use Request.newBuilder() to construct.
	private Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	private Request() {
		this.id_ = 0;
		this.msg_ = "";
	}

	private Request(com.google.protobuf.CodedInputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		this();
		int mutableBitField0 = 0;
		com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet.newBuilder();
		try {
			boolean done = false;
			while (!done) {
				int tag = input.readTag();
				switch (tag) {
					case 0:
						done = true;
						break;
					case 8:
						this.id_ = input.readInt32();
						break;
					case 18:
						String s = input.readStringRequireUtf8();
						this.msg_ = s;
						break;
					default:
						if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
				}
			}
		}
		catch (com.google.protobuf.InvalidProtocolBufferException e) {
			throw e.setUnfinishedMessage(this);
		}
		catch (java.io.IOException e) {
			throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
		}
		finally {
			this.unknownFields = unknownFields.build();
			makeExtensionsImmutable();
		}
	}

	public static com.google.protobuf.Descriptors.Descriptor getDescriptor() {
		return org.springframework.cloud.openfeign.encoding.proto.ProtobufTest.internal_static_Request_descriptor;
	}

	public static Request parseFrom(java.nio.ByteBuffer data)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static Request parseFrom(java.nio.ByteBuffer data,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static Request parseFrom(com.google.protobuf.ByteString data)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static Request parseFrom(com.google.protobuf.ByteString data,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static Request parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static Request parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static Request parseFrom(java.io.InputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static Request parseFrom(java.io.InputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static Request parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}

	public static Request parseDelimitedFrom(java.io.InputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static Request parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static Request parseFrom(com.google.protobuf.CodedInputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(Request prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	public static Request getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	public static com.google.protobuf.Parser<Request> parser() {
		return PARSER;
	}

	@Override
	public com.google.protobuf.UnknownFieldSet getUnknownFields() {
		return this.unknownFields;
	}

	protected FieldAccessorTable internalGetFieldAccessorTable() {
		return org.springframework.cloud.openfeign.encoding.proto.ProtobufTest.internal_static_Request_fieldAccessorTable
				.ensureFieldAccessorsInitialized(Request.class, Request.Builder.class);
	}

	/**
	 * <code>int32 id = 1;</code>
	 */
	public int getId() {
		return this.id_;
	}

	/**
	 * <code>string msg = 2;</code>
	 */
	public String getMsg() {
		Object ref = this.msg_;
		if (ref instanceof String) {
			return (String) ref;
		}
		else {
			com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
			String s = bs.toStringUtf8();
			this.msg_ = s;
			return s;
		}
	}

	/**
	 * <code>string msg = 2;</code>
	 */
	public com.google.protobuf.ByteString getMsgBytes() {
		Object ref = this.msg_;
		if (ref instanceof String) {
			com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
			this.msg_ = b;
			return b;
		}
		else {
			return (com.google.protobuf.ByteString) ref;
		}
	}

	public boolean isInitialized() {
		byte isInitialized = this.memoizedIsInitialized;
		if (isInitialized == 1) {
			return true;
		}
		if (isInitialized == 0) {
			return false;
		}
		this.memoizedIsInitialized = 1;
		return true;
	}

	public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
		if (this.id_ != 0) {
			output.writeInt32(1, this.id_);
		}
		if (!getMsgBytes().isEmpty()) {
			com.google.protobuf.GeneratedMessageV3.writeString(output, 2, this.msg_);
		}
		this.unknownFields.writeTo(output);
	}

	public int getSerializedSize() {
		int size = this.memoizedSize;
		if (size != -1) {
			return size;
		}

		size = 0;
		if (this.id_ != 0) {
			size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, this.id_);
		}
		if (!getMsgBytes().isEmpty()) {
			size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, this.msg_);
		}
		size += this.unknownFields.getSerializedSize();
		this.memoizedSize = size;
		return size;
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Request other)) {
			return super.equals(obj);
		}

		boolean result = true;
		result = result && (getId() == other.getId());
		result = result && getMsg().equals(other.getMsg());
		result = result && this.unknownFields.equals(other.unknownFields);
		return result;
	}

	@Override
	public int hashCode() {
		if (this.memoizedHashCode != 0) {
			return this.memoizedHashCode;
		}
		int hash = 41;
		hash = (19 * hash) + getDescriptor().hashCode();
		hash = (37 * hash) + ID_FIELD_NUMBER;
		hash = (53 * hash) + getId();
		hash = (37 * hash) + MSG_FIELD_NUMBER;
		hash = (53 * hash) + getMsg().hashCode();
		hash = (29 * hash) + this.unknownFields.hashCode();
		this.memoizedHashCode = hash;
		return hash;
	}

	public Builder newBuilderForType() {
		return newBuilder();
	}

	public Builder toBuilder() {
		return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
	}

	@Override
	protected Builder newBuilderForType(BuilderParent parent) {
		return new Builder(parent);
	}

	@Override
	public com.google.protobuf.Parser<Request> getParserForType() {
		return PARSER;
	}

	public Request getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}

	/**
	 * Protobuf type {@code Request}
	 */
	public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
			// @@protoc_insertion_point(builder_implements:Request)
			org.springframework.cloud.openfeign.encoding.proto.RequestOrBuilder {

		private int id_;

		private Object msg_ = "";

		// Construct using
		// org.springframework.cloud.openfeign.encoding.proto.Request.newBuilder()
		private Builder() {
			maybeForceBuilderInitialization();
		}

		private Builder(BuilderParent parent) {
			super(parent);
			maybeForceBuilderInitialization();
		}

		public static com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return org.springframework.cloud.openfeign.encoding.proto.ProtobufTest.internal_static_Request_descriptor;
		}

		protected FieldAccessorTable internalGetFieldAccessorTable() {
			return org.springframework.cloud.openfeign.encoding.proto.ProtobufTest.internal_static_Request_fieldAccessorTable
					.ensureFieldAccessorsInitialized(Request.class, Request.Builder.class);
		}

		private void maybeForceBuilderInitialization() {
			if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
				// TODO: Remove this?
			}
		}

		public Builder clear() {
			super.clear();
			this.id_ = 0;
			this.msg_ = "";
			return this;
		}

		public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
			return org.springframework.cloud.openfeign.encoding.proto.ProtobufTest.internal_static_Request_descriptor;
		}

		public Request getDefaultInstanceForType() {
			return Request.getDefaultInstance();
		}

		public Request build() {
			Request result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		public Request buildPartial() {
			Request result = new Request(this);
			result.id_ = this.id_;
			result.msg_ = this.msg_;
			onBuilt();
			return result;
		}

		public Builder clone() {
			return (Builder) super.clone();
		}

		public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
			return (Builder) super.setField(field, value);
		}

		public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
			return (Builder) super.clearField(field);
		}

		public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
			return (Builder) super.clearOneof(oneof);
		}

		public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
				Object value) {
			return (Builder) super.setRepeatedField(field, index, value);
		}

		public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
			return (Builder) super.addRepeatedField(field, value);
		}

		public Builder mergeFrom(com.google.protobuf.Message other) {
			if (other instanceof Request) {
				return mergeFrom((Request) other);
			}
			else {
				super.mergeFrom(other);
				return this;
			}
		}

		public Builder mergeFrom(Request other) {
			if (other == Request.getDefaultInstance()) {
				return this;
			}
			if (other.getId() != 0) {
				setId(other.getId());
			}
			if (!other.getMsg().isEmpty()) {
				this.msg_ = other.msg_;
				onChanged();
			}
			this.mergeUnknownFields(other.unknownFields);
			onChanged();
			return this;
		}

		public boolean isInitialized() {
			return true;
		}

		public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			Request parsedMessage = null;
			try {
				parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
			}
			catch (com.google.protobuf.InvalidProtocolBufferException e) {
				parsedMessage = (Request) e.getUnfinishedMessage();
				throw e.unwrapIOException();
			}
			finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
			return this;
		}

		/**
		 * <code>int32 id = 1;</code>
		 */
		public int getId() {
			return this.id_;
		}

		/**
		 * <code>int32 id = 1;</code>
		 */
		public Builder setId(int value) {

			this.id_ = value;
			onChanged();
			return this;
		}

		/**
		 * <code>int32 id = 1;</code>
		 */
		public Builder clearId() {

			this.id_ = 0;
			onChanged();
			return this;
		}

		/**
		 * <code>string msg = 2;</code>
		 */
		public String getMsg() {
			Object ref = this.msg_;
			if (!(ref instanceof String)) {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				String s = bs.toStringUtf8();
				this.msg_ = s;
				return s;
			}
			else {
				return (String) ref;
			}
		}

		/**
		 * <code>string msg = 2;</code>
		 */
		public Builder setMsg(String value) {
			if (value == null) {
				throw new NullPointerException();
			}

			this.msg_ = value;
			onChanged();
			return this;
		}

		/**
		 * <code>string msg = 2;</code>
		 */
		public com.google.protobuf.ByteString getMsgBytes() {
			Object ref = this.msg_;
			if (ref instanceof String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
				this.msg_ = b;
				return b;
			}
			else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		/**
		 * <code>string msg = 2;</code>
		 */
		public Builder setMsgBytes(com.google.protobuf.ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			checkByteStringIsUtf8(value);

			this.msg_ = value;
			onChanged();
			return this;
		}

		/**
		 * <code>string msg = 2;</code>
		 */
		public Builder clearMsg() {

			this.msg_ = getDefaultInstance().getMsg();
			onChanged();
			return this;
		}

		public Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
			return super.setUnknownFieldsProto3(unknownFields);
		}

		public Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
			return super.mergeUnknownFields(unknownFields);
		}

		// @@protoc_insertion_point(builder_scope:Request)

	}

}
