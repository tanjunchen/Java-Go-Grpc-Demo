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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: k8s/Deployment.proto")
public final class WatchDeploymentGrpc {

  private WatchDeploymentGrpc() {}

  public static final String SERVICE_NAME = "proto.WatchDeployment";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse,
      com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse> getWatchDeploymentEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchDeploymentEvent",
      requestType = com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse.class,
      responseType = com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse,
      com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse> getWatchDeploymentEventMethod() {
    io.grpc.MethodDescriptor<com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse, com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse> getWatchDeploymentEventMethod;
    if ((getWatchDeploymentEventMethod = WatchDeploymentGrpc.getWatchDeploymentEventMethod) == null) {
      synchronized (WatchDeploymentGrpc.class) {
        if ((getWatchDeploymentEventMethod = WatchDeploymentGrpc.getWatchDeploymentEventMethod) == null) {
          WatchDeploymentGrpc.getWatchDeploymentEventMethod = getWatchDeploymentEventMethod = 
              io.grpc.MethodDescriptor.<com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse, com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "proto.WatchDeployment", "WatchDeploymentEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WatchDeploymentMethodDescriptorSupplier("WatchDeploymentEvent"))
                  .build();
          }
        }
     }
     return getWatchDeploymentEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WatchDeploymentStub newStub(io.grpc.Channel channel) {
    return new WatchDeploymentStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WatchDeploymentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WatchDeploymentBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WatchDeploymentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WatchDeploymentFutureStub(channel);
  }

  /**
   */
  public static abstract class WatchDeploymentImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse> watchDeploymentEvent(
        io.grpc.stub.StreamObserver<com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getWatchDeploymentEventMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWatchDeploymentEventMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse,
                com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse>(
                  this, METHODID_WATCH_DEPLOYMENT_EVENT)))
          .build();
    }
  }

  /**
   */
  public static final class WatchDeploymentStub extends io.grpc.stub.AbstractStub<WatchDeploymentStub> {
    private WatchDeploymentStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WatchDeploymentStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WatchDeploymentStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WatchDeploymentStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse> watchDeploymentEvent(
        io.grpc.stub.StreamObserver<com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getWatchDeploymentEventMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class WatchDeploymentBlockingStub extends io.grpc.stub.AbstractStub<WatchDeploymentBlockingStub> {
    private WatchDeploymentBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WatchDeploymentBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WatchDeploymentBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WatchDeploymentBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class WatchDeploymentFutureStub extends io.grpc.stub.AbstractStub<WatchDeploymentFutureStub> {
    private WatchDeploymentFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WatchDeploymentFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WatchDeploymentFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WatchDeploymentFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_WATCH_DEPLOYMENT_EVENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WatchDeploymentImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WatchDeploymentImplBase serviceImpl, int methodId) {
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
        case METHODID_WATCH_DEPLOYMENT_EVENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.watchDeploymentEvent(
              (io.grpc.stub.StreamObserver<com.tanjunchen.demo.WatchDeploymentProto.WatchDeploymentResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WatchDeploymentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WatchDeploymentBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tanjunchen.demo.WatchDeploymentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WatchDeployment");
    }
  }

  private static final class WatchDeploymentFileDescriptorSupplier
      extends WatchDeploymentBaseDescriptorSupplier {
    WatchDeploymentFileDescriptorSupplier() {}
  }

  private static final class WatchDeploymentMethodDescriptorSupplier
      extends WatchDeploymentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WatchDeploymentMethodDescriptorSupplier(String methodName) {
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
      synchronized (WatchDeploymentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WatchDeploymentFileDescriptorSupplier())
              .addMethod(getWatchDeploymentEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
