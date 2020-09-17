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
 * Service 的 rpc 接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: service.proto")
public final class ServiceServiceGrpc {

  private ServiceServiceGrpc() {}

  public static final String SERVICE_NAME = "k8s.ServiceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tanjunchen.demo.SyncServiceRequest,
      com.tanjunchen.demo.SyncServiceResponse> getSyncServiceWatchListServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyncServiceWatchListService",
      requestType = com.tanjunchen.demo.SyncServiceRequest.class,
      responseType = com.tanjunchen.demo.SyncServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.tanjunchen.demo.SyncServiceRequest,
      com.tanjunchen.demo.SyncServiceResponse> getSyncServiceWatchListServiceMethod() {
    io.grpc.MethodDescriptor<com.tanjunchen.demo.SyncServiceRequest, com.tanjunchen.demo.SyncServiceResponse> getSyncServiceWatchListServiceMethod;
    if ((getSyncServiceWatchListServiceMethod = ServiceServiceGrpc.getSyncServiceWatchListServiceMethod) == null) {
      synchronized (ServiceServiceGrpc.class) {
        if ((getSyncServiceWatchListServiceMethod = ServiceServiceGrpc.getSyncServiceWatchListServiceMethod) == null) {
          ServiceServiceGrpc.getSyncServiceWatchListServiceMethod = getSyncServiceWatchListServiceMethod = 
              io.grpc.MethodDescriptor.<com.tanjunchen.demo.SyncServiceRequest, com.tanjunchen.demo.SyncServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "k8s.ServiceService", "SyncServiceWatchListService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanjunchen.demo.SyncServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanjunchen.demo.SyncServiceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceServiceMethodDescriptorSupplier("SyncServiceWatchListService"))
                  .build();
          }
        }
     }
     return getSyncServiceWatchListServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceServiceStub newStub(io.grpc.Channel channel) {
    return new ServiceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServiceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServiceServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service 的 rpc 接口
   * </pre>
   */
  public static abstract class ServiceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * service 服务的 list watch 事件数据接口
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.tanjunchen.demo.SyncServiceRequest> syncServiceWatchListService(
        io.grpc.stub.StreamObserver<com.tanjunchen.demo.SyncServiceResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSyncServiceWatchListServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSyncServiceWatchListServiceMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.tanjunchen.demo.SyncServiceRequest,
                com.tanjunchen.demo.SyncServiceResponse>(
                  this, METHODID_SYNC_SERVICE_WATCH_LIST_SERVICE)))
          .build();
    }
  }

  /**
   * <pre>
   * Service 的 rpc 接口
   * </pre>
   */
  public static final class ServiceServiceStub extends io.grpc.stub.AbstractStub<ServiceServiceStub> {
    private ServiceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * service 服务的 list watch 事件数据接口
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.tanjunchen.demo.SyncServiceRequest> syncServiceWatchListService(
        io.grpc.stub.StreamObserver<com.tanjunchen.demo.SyncServiceResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSyncServiceWatchListServiceMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Service 的 rpc 接口
   * </pre>
   */
  public static final class ServiceServiceBlockingStub extends io.grpc.stub.AbstractStub<ServiceServiceBlockingStub> {
    private ServiceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Service 的 rpc 接口
   * </pre>
   */
  public static final class ServiceServiceFutureStub extends io.grpc.stub.AbstractStub<ServiceServiceFutureStub> {
    private ServiceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SYNC_SERVICE_WATCH_LIST_SERVICE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SYNC_SERVICE_WATCH_LIST_SERVICE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.syncServiceWatchListService(
              (io.grpc.stub.StreamObserver<com.tanjunchen.demo.SyncServiceResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ServiceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tanjunchen.demo.k8sServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceService");
    }
  }

  private static final class ServiceServiceFileDescriptorSupplier
      extends ServiceServiceBaseDescriptorSupplier {
    ServiceServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceServiceMethodDescriptorSupplier
      extends ServiceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceServiceFileDescriptorSupplier())
              .addMethod(getSyncServiceWatchListServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
