// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: status/status.proto

package com.tanjunchen.demo;

public final class statusProto {
  private statusProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_status_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_status_Status_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023status/status.proto\022\006status\"#\n\006Status\022" +
      "\014\n\004code\030\001 \001(\t\022\013\n\003msg\030\002 \001(\tB?\n\023com.tanjun" +
      "chen.demoB\013statusProtoP\001Z\031grpc-test-demo" +
      "/src/statusb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_status_Status_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_status_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_status_Status_descriptor,
        new java.lang.String[] { "Code", "Msg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
