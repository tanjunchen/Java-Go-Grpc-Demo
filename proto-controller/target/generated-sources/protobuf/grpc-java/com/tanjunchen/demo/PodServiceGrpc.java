package com.tanjunchen.demo;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Pod 的 rpc 接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: k8s/pod.proto")
public final class PodServiceGrpc {

  private PodServiceGrpc() {}

  public static final String SERVICE_NAME = "k8s.PodService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tanjunchen.demo.PodProto.PodRequest,
      com.tanjunchen.demo.PodProto.PodResponse> getGetAllPodInNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllPodInNamespace",
      requestType = com.tanjunchen.demo.PodProto.PodRequest.class,
      responseType = com.tanjunchen.demo.PodProto.PodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tanjunchen.demo.PodProto.PodRequest,
      com.tanjunchen.demo.PodProto.PodResponse> getGetAllPodInNamespaceMethod() {
    io.grpc.MethodDescriptor<com.tanjunchen.demo.PodProto.PodRequest, com.tanjunchen.demo.PodProto.PodResponse> getGetAllPodInNamespaceMethod;
    if ((getGetAllPodInNamespaceMethod = PodServiceGrpc.getGetAllPodInNamespaceMethod) == null) {
      synchronized (PodServiceGrpc.class) {
        if ((getGetAllPodInNamespaceMethod = PodServiceGrpc.getGetAllPodInNamespaceMethod) == null) {
          PodServiceGrpc.getGetAllPodInNamespaceMethod = getGetAllPodInNamespaceMethod = 
              io.grpc.MethodDescriptor.<com.tanjunchen.demo.PodProto.PodRequest, com.tanjunchen.demo.PodProto.PodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "k8s.PodService", "GetAllPodInNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanjunchen.demo.PodProto.PodRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanjunchen.demo.PodProto.PodResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PodServiceMethodDescriptorSupplier("GetAllPodInNamespace"))
                  .build();
          }
        }
     }
     return getGetAllPodInNamespaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tanjunchen.demo.PodProto.PodLogRequest,
      com.tanjunchen.demo.PodProto.PodLogResponse> getGetPodLogInNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPodLogInNamespace",
      requestType = com.tanjunchen.demo.PodProto.PodLogRequest.class,
      responseType = com.tanjunchen.demo.PodProto.PodLogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.tanjunchen.demo.PodProto.PodLogRequest,
      com.tanjunchen.demo.PodProto.PodLogResponse> getGetPodLogInNamespaceMethod() {
    io.grpc.MethodDescriptor<com.tanjunchen.demo.PodProto.PodLogRequest, com.tanjunchen.demo.PodProto.PodLogResponse> getGetPodLogInNamespaceMethod;
    if ((getGetPodLogInNamespaceMethod = PodServiceGrpc.getGetPodLogInNamespaceMethod) == null) {
      synchronized (PodServiceGrpc.class) {
        if ((getGetPodLogInNamespaceMethod = PodServiceGrpc.getGetPodLogInNamespaceMethod) == null) {
          PodServiceGrpc.getGetPodLogInNamespaceMethod = getGetPodLogInNamespaceMethod = 
              io.grpc.MethodDescriptor.<com.tanjunchen.demo.PodProto.PodLogRequest, com.tanjunchen.demo.PodProto.PodLogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "k8s.PodService", "GetPodLogInNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanjunchen.demo.PodProto.PodLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanjunchen.demo.PodProto.PodLogResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PodServiceMethodDescriptorSupplier("GetPodLogInNamespace"))
                  .build();
          }
        }
     }
     return getGetPodLogInNamespaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tanjunchen.demo.PodProto.HostIpPortRequest,
      com.tanjunchen.demo.PodProto.HostNetworkPodResponse> getGetHostNetworkInfoInNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHostNetworkInfoInNamespace",
      requestType = com.tanjunchen.demo.PodProto.HostIpPortRequest.class,
      responseType = com.tanjunchen.demo.PodProto.HostNetworkPodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tanjunchen.demo.PodProto.HostIpPortRequest,
      com.tanjunchen.demo.PodProto.HostNetworkPodResponse> getGetHostNetworkInfoInNamespaceMethod() {
    io.grpc.MethodDescriptor<com.tanjunchen.demo.PodProto.HostIpPortRequest, com.tanjunchen.demo.PodProto.HostNetworkPodResponse> getGetHostNetworkInfoInNamespaceMethod;
    if ((getGetHostNetworkInfoInNamespaceMethod = PodServiceGrpc.getGetHostNetworkInfoInNamespaceMethod) == null) {
      synchronized (PodServiceGrpc.class) {
        if ((getGetHostNetworkInfoInNamespaceMethod = PodServiceGrpc.getGetHostNetworkInfoInNamespaceMethod) == null) {
          PodServiceGrpc.getGetHostNetworkInfoInNamespaceMethod = getGetHostNetworkInfoInNamespaceMethod = 
              io.grpc.MethodDescriptor.<com.tanjunchen.demo.PodProto.HostIpPortRequest, com.tanjunchen.demo.PodProto.HostNetworkPodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "k8s.PodService", "GetHostNetworkInfoInNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanjunchen.demo.PodProto.HostIpPortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanjunchen.demo.PodProto.HostNetworkPodResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PodServiceMethodDescriptorSupplier("GetHostNetworkInfoInNamespace"))
                  .build();
          }
        }
     }
     return getGetHostNetworkInfoInNamespaceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PodServiceStub newStub(io.grpc.Channel channel) {
    return new PodServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PodServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PodServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PodServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PodServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Pod 的 rpc 接口
   * </pre>
   */
  public static abstract class PodServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取某个命名空间下的所有的 Pod 信息
     * </pre>
     */
    public void getAllPodInNamespace(com.tanjunchen.demo.PodProto.PodRequest request,
        io.grpc.stub.StreamObserver<com.tanjunchen.demo.PodProto.PodResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllPodInNamespaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取某个命名空间下的某个 pod 的日志信息  服务端流
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.tanjunchen.demo.PodProto.PodLogRequest> getPodLogInNamespace(
        io.grpc.stub.StreamObserver<com.tanjunchen.demo.PodProto.PodLogResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetPodLogInNamespaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取 deploy 的 hostNetwork 信息
     * </pre>
     */
    public void getHostNetworkInfoInNamespace(com.tanjunchen.demo.PodProto.HostIpPortRequest request,
        io.grpc.stub.StreamObserver<com.tanjunchen.demo.PodProto.HostNetworkPodResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHostNetworkInfoInNamespaceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllPodInNamespaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tanjunchen.demo.PodProto.PodRequest,
                com.tanjunchen.demo.PodProto.PodResponse>(
                  this, METHODID_GET_ALL_POD_IN_NAMESPACE)))
          .addMethod(
            getGetPodLogInNamespaceMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.tanjunchen.demo.PodProto.PodLogRequest,
                com.tanjunchen.demo.PodProto.PodLogResponse>(
                  this, METHODID_GET_POD_LOG_IN_NAMESPACE)))
          .addMethod(
            getGetHostNetworkInfoInNamespaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tanjunchen.demo.PodProto.HostIpPortRequest,
                com.tanjunchen.demo.PodProto.HostNetworkPodResponse>(
                  this, METHODID_GET_HOST_NETWORK_INFO_IN_NAMESPACE)))
          .build();
    }
  }

  /**
   * <pre>
   * Pod 的 rpc 接口
   * </pre>
   */
  public static final class PodServiceStub extends io.grpc.stub.AbstractStub<PodServiceStub> {
    private PodServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PodServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PodServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PodServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取某个命名空间下的所有的 Pod 信息
     * </pre>
     */
    public void getAllPodInNamespace(com.tanjunchen.demo.PodProto.PodRequest request,
        io.grpc.stub.StreamObserver<com.tanjunchen.demo.PodProto.PodResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllPodInNamespaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取某个命名空间下的某个 pod 的日志信息  服务端流
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.tanjunchen.demo.PodProto.PodLogRequest> getPodLogInNamespace(
        io.grpc.stub.StreamObserver<com.tanjunchen.demo.PodProto.PodLogResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetPodLogInNamespaceMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * 获取 deploy 的 hostNetwork 信息
     * </pre>
     */
    public void getHostNetworkInfoInNamespace(com.tanjunchen.demo.PodProto.HostIpPortRequest request,
        io.grpc.stub.StreamObserver<com.tanjunchen.demo.PodProto.HostNetworkPodResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHostNetworkInfoInNamespaceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Pod 的 rpc 接口
   * </pre>
   */
  public static final class PodServiceBlockingStub extends io.grpc.stub.AbstractStub<PodServiceBlockingStub> {
    private PodServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PodServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PodServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PodServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取某个命名空间下的所有的 Pod 信息
     * </pre>
     */
    public com.tanjunchen.demo.PodProto.PodResponse getAllPodInNamespace(com.tanjunchen.demo.PodProto.PodRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllPodInNamespaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取 deploy 的 hostNetwork 信息
     * </pre>
     */
    public com.tanjunchen.demo.PodProto.HostNetworkPodResponse getHostNetworkInfoInNamespace(com.tanjunchen.demo.PodProto.HostIpPortRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetHostNetworkInfoInNamespaceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Pod 的 rpc 接口
   * </pre>
   */
  public static final class PodServiceFutureStub extends io.grpc.stub.AbstractStub<PodServiceFutureStub> {
    private PodServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PodServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PodServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PodServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取某个命名空间下的所有的 Pod 信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tanjunchen.demo.PodProto.PodResponse> getAllPodInNamespace(
        com.tanjunchen.demo.PodProto.PodRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllPodInNamespaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取 deploy 的 hostNetwork 信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tanjunchen.demo.PodProto.HostNetworkPodResponse> getHostNetworkInfoInNamespace(
        com.tanjunchen.demo.PodProto.HostIpPortRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHostNetworkInfoInNamespaceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_POD_IN_NAMESPACE = 0;
  private static final int METHODID_GET_HOST_NETWORK_INFO_IN_NAMESPACE = 1;
  private static final int METHODID_GET_POD_LOG_IN_NAMESPACE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PodServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PodServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_POD_IN_NAMESPACE:
          serviceImpl.getAllPodInNamespace((com.tanjunchen.demo.PodProto.PodRequest) request,
              (io.grpc.stub.StreamObserver<com.tanjunchen.demo.PodProto.PodResponse>) responseObserver);
          break;
        case METHODID_GET_HOST_NETWORK_INFO_IN_NAMESPACE:
          serviceImpl.getHostNetworkInfoInNamespace((com.tanjunchen.demo.PodProto.HostIpPortRequest) request,
              (io.grpc.stub.StreamObserver<com.tanjunchen.demo.PodProto.HostNetworkPodResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_POD_LOG_IN_NAMESPACE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getPodLogInNamespace(
              (io.grpc.stub.StreamObserver<com.tanjunchen.demo.PodProto.PodLogResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PodServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PodServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tanjunchen.demo.PodProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PodService");
    }
  }

  private static final class PodServiceFileDescriptorSupplier
      extends PodServiceBaseDescriptorSupplier {
    PodServiceFileDescriptorSupplier() {}
  }

  private static final class PodServiceMethodDescriptorSupplier
      extends PodServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PodServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PodServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PodServiceFileDescriptorSupplier())
              .addMethod(getGetAllPodInNamespaceMethod())
              .addMethod(getGetPodLogInNamespaceMethod())
              .addMethod(getGetHostNetworkInfoInNamespaceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
