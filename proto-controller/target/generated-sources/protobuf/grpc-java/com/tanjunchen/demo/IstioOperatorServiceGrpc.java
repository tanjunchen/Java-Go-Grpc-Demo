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
 * IstioOperatorService rpc 服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: istio/istiooperator.proto")
public final class IstioOperatorServiceGrpc {

  private IstioOperatorServiceGrpc() {}

  public static final String SERVICE_NAME = "istio.IstioOperatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest,
      com.tanjunchen.demo.IstioOperatorProto.IopInfoResponse> getGetAllIstioOperatorInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllIstioOperatorInfo",
      requestType = com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest.class,
      responseType = com.tanjunchen.demo.IstioOperatorProto.IopInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest,
      com.tanjunchen.demo.IstioOperatorProto.IopInfoResponse> getGetAllIstioOperatorInfoMethod() {
    io.grpc.MethodDescriptor<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest, com.tanjunchen.demo.IstioOperatorProto.IopInfoResponse> getGetAllIstioOperatorInfoMethod;
    if ((getGetAllIstioOperatorInfoMethod = IstioOperatorServiceGrpc.getGetAllIstioOperatorInfoMethod) == null) {
      synchronized (IstioOperatorServiceGrpc.class) {
        if ((getGetAllIstioOperatorInfoMethod = IstioOperatorServiceGrpc.getGetAllIstioOperatorInfoMethod) == null) {
          IstioOperatorServiceGrpc.getGetAllIstioOperatorInfoMethod = getGetAllIstioOperatorInfoMethod = 
              io.grpc.MethodDescriptor.<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest, com.tanjunchen.demo.IstioOperatorProto.IopInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "istio.IstioOperatorService", "GetAllIstioOperatorInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanjunchen.demo.IstioOperatorProto.IopInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IstioOperatorServiceMethodDescriptorSupplier("GetAllIstioOperatorInfo"))
                  .build();
          }
        }
     }
     return getGetAllIstioOperatorInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest,
      com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse> getAddIstioOperatorInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddIstioOperatorInfo",
      requestType = com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest.class,
      responseType = com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest,
      com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse> getAddIstioOperatorInfoMethod() {
    io.grpc.MethodDescriptor<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest, com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse> getAddIstioOperatorInfoMethod;
    if ((getAddIstioOperatorInfoMethod = IstioOperatorServiceGrpc.getAddIstioOperatorInfoMethod) == null) {
      synchronized (IstioOperatorServiceGrpc.class) {
        if ((getAddIstioOperatorInfoMethod = IstioOperatorServiceGrpc.getAddIstioOperatorInfoMethod) == null) {
          IstioOperatorServiceGrpc.getAddIstioOperatorInfoMethod = getAddIstioOperatorInfoMethod = 
              io.grpc.MethodDescriptor.<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest, com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "istio.IstioOperatorService", "AddIstioOperatorInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IstioOperatorServiceMethodDescriptorSupplier("AddIstioOperatorInfo"))
                  .build();
          }
        }
     }
     return getAddIstioOperatorInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest,
      com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse> getUpdateIstioOperatorInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateIstioOperatorInfo",
      requestType = com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest.class,
      responseType = com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest,
      com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse> getUpdateIstioOperatorInfoMethod() {
    io.grpc.MethodDescriptor<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest, com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse> getUpdateIstioOperatorInfoMethod;
    if ((getUpdateIstioOperatorInfoMethod = IstioOperatorServiceGrpc.getUpdateIstioOperatorInfoMethod) == null) {
      synchronized (IstioOperatorServiceGrpc.class) {
        if ((getUpdateIstioOperatorInfoMethod = IstioOperatorServiceGrpc.getUpdateIstioOperatorInfoMethod) == null) {
          IstioOperatorServiceGrpc.getUpdateIstioOperatorInfoMethod = getUpdateIstioOperatorInfoMethod = 
              io.grpc.MethodDescriptor.<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest, com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "istio.IstioOperatorService", "UpdateIstioOperatorInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IstioOperatorServiceMethodDescriptorSupplier("UpdateIstioOperatorInfo"))
                  .build();
          }
        }
     }
     return getUpdateIstioOperatorInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest,
      com.tanjunchen.demo.IstioOperatorProto.DeleteIstioOperatorResponse> getDeleteIstioOperatorInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteIstioOperatorInfo",
      requestType = com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest.class,
      responseType = com.tanjunchen.demo.IstioOperatorProto.DeleteIstioOperatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest,
      com.tanjunchen.demo.IstioOperatorProto.DeleteIstioOperatorResponse> getDeleteIstioOperatorInfoMethod() {
    io.grpc.MethodDescriptor<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest, com.tanjunchen.demo.IstioOperatorProto.DeleteIstioOperatorResponse> getDeleteIstioOperatorInfoMethod;
    if ((getDeleteIstioOperatorInfoMethod = IstioOperatorServiceGrpc.getDeleteIstioOperatorInfoMethod) == null) {
      synchronized (IstioOperatorServiceGrpc.class) {
        if ((getDeleteIstioOperatorInfoMethod = IstioOperatorServiceGrpc.getDeleteIstioOperatorInfoMethod) == null) {
          IstioOperatorServiceGrpc.getDeleteIstioOperatorInfoMethod = getDeleteIstioOperatorInfoMethod = 
              io.grpc.MethodDescriptor.<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest, com.tanjunchen.demo.IstioOperatorProto.DeleteIstioOperatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "istio.IstioOperatorService", "DeleteIstioOperatorInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tanjunchen.demo.IstioOperatorProto.DeleteIstioOperatorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IstioOperatorServiceMethodDescriptorSupplier("DeleteIstioOperatorInfo"))
                  .build();
          }
        }
     }
     return getDeleteIstioOperatorInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IstioOperatorServiceStub newStub(io.grpc.Channel channel) {
    return new IstioOperatorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IstioOperatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IstioOperatorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IstioOperatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IstioOperatorServiceFutureStub(channel);
  }

  /**
   * <pre>
   * IstioOperatorService rpc 服务
   * </pre>
   */
  public static abstract class IstioOperatorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取集群中所有的 istio operator 的信息
     * </pre>
     */
    public void getAllIstioOperatorInfo(com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest request,
        io.grpc.stub.StreamObserver<com.tanjunchen.demo.IstioOperatorProto.IopInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllIstioOperatorInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * 安装 Istio Operator 资源对象
     * </pre>
     */
    public void addIstioOperatorInfo(com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest request,
        io.grpc.stub.StreamObserver<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddIstioOperatorInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新 istio operator 信息
     * </pre>
     */
    public void updateIstioOperatorInfo(com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest request,
        io.grpc.stub.StreamObserver<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateIstioOperatorInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除所有的 istio operator 信息
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest> deleteIstioOperatorInfo(
        io.grpc.stub.StreamObserver<com.tanjunchen.demo.IstioOperatorProto.DeleteIstioOperatorResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getDeleteIstioOperatorInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllIstioOperatorInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest,
                com.tanjunchen.demo.IstioOperatorProto.IopInfoResponse>(
                  this, METHODID_GET_ALL_ISTIO_OPERATOR_INFO)))
          .addMethod(
            getAddIstioOperatorInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest,
                com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse>(
                  this, METHODID_ADD_ISTIO_OPERATOR_INFO)))
          .addMethod(
            getUpdateIstioOperatorInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest,
                com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse>(
                  this, METHODID_UPDATE_ISTIO_OPERATOR_INFO)))
          .addMethod(
            getDeleteIstioOperatorInfoMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest,
                com.tanjunchen.demo.IstioOperatorProto.DeleteIstioOperatorResponse>(
                  this, METHODID_DELETE_ISTIO_OPERATOR_INFO)))
          .build();
    }
  }

  /**
   * <pre>
   * IstioOperatorService rpc 服务
   * </pre>
   */
  public static final class IstioOperatorServiceStub extends io.grpc.stub.AbstractStub<IstioOperatorServiceStub> {
    private IstioOperatorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IstioOperatorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IstioOperatorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IstioOperatorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取集群中所有的 istio operator 的信息
     * </pre>
     */
    public void getAllIstioOperatorInfo(com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest request,
        io.grpc.stub.StreamObserver<com.tanjunchen.demo.IstioOperatorProto.IopInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllIstioOperatorInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 安装 Istio Operator 资源对象
     * </pre>
     */
    public void addIstioOperatorInfo(com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest request,
        io.grpc.stub.StreamObserver<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddIstioOperatorInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新 istio operator 信息
     * </pre>
     */
    public void updateIstioOperatorInfo(com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest request,
        io.grpc.stub.StreamObserver<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateIstioOperatorInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除所有的 istio operator 信息
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest> deleteIstioOperatorInfo(
        io.grpc.stub.StreamObserver<com.tanjunchen.demo.IstioOperatorProto.DeleteIstioOperatorResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getDeleteIstioOperatorInfoMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * IstioOperatorService rpc 服务
   * </pre>
   */
  public static final class IstioOperatorServiceBlockingStub extends io.grpc.stub.AbstractStub<IstioOperatorServiceBlockingStub> {
    private IstioOperatorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IstioOperatorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IstioOperatorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IstioOperatorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取集群中所有的 istio operator 的信息
     * </pre>
     */
    public com.tanjunchen.demo.IstioOperatorProto.IopInfoResponse getAllIstioOperatorInfo(com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllIstioOperatorInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 安装 Istio Operator 资源对象
     * </pre>
     */
    public com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse addIstioOperatorInfo(com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddIstioOperatorInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新 istio operator 信息
     * </pre>
     */
    public com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse updateIstioOperatorInfo(com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateIstioOperatorInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * IstioOperatorService rpc 服务
   * </pre>
   */
  public static final class IstioOperatorServiceFutureStub extends io.grpc.stub.AbstractStub<IstioOperatorServiceFutureStub> {
    private IstioOperatorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IstioOperatorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IstioOperatorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IstioOperatorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取集群中所有的 istio operator 的信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tanjunchen.demo.IstioOperatorProto.IopInfoResponse> getAllIstioOperatorInfo(
        com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllIstioOperatorInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 安装 Istio Operator 资源对象
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse> addIstioOperatorInfo(
        com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddIstioOperatorInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新 istio operator 信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse> updateIstioOperatorInfo(
        com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateIstioOperatorInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_ISTIO_OPERATOR_INFO = 0;
  private static final int METHODID_ADD_ISTIO_OPERATOR_INFO = 1;
  private static final int METHODID_UPDATE_ISTIO_OPERATOR_INFO = 2;
  private static final int METHODID_DELETE_ISTIO_OPERATOR_INFO = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IstioOperatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IstioOperatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_ISTIO_OPERATOR_INFO:
          serviceImpl.getAllIstioOperatorInfo((com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest) request,
              (io.grpc.stub.StreamObserver<com.tanjunchen.demo.IstioOperatorProto.IopInfoResponse>) responseObserver);
          break;
        case METHODID_ADD_ISTIO_OPERATOR_INFO:
          serviceImpl.addIstioOperatorInfo((com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest) request,
              (io.grpc.stub.StreamObserver<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ISTIO_OPERATOR_INFO:
          serviceImpl.updateIstioOperatorInfo((com.tanjunchen.demo.IstioOperatorProto.IstioOperatorRequest) request,
              (io.grpc.stub.StreamObserver<com.tanjunchen.demo.IstioOperatorProto.IstioOperatorResponse>) responseObserver);
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
        case METHODID_DELETE_ISTIO_OPERATOR_INFO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.deleteIstioOperatorInfo(
              (io.grpc.stub.StreamObserver<com.tanjunchen.demo.IstioOperatorProto.DeleteIstioOperatorResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class IstioOperatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IstioOperatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tanjunchen.demo.IstioOperatorProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IstioOperatorService");
    }
  }

  private static final class IstioOperatorServiceFileDescriptorSupplier
      extends IstioOperatorServiceBaseDescriptorSupplier {
    IstioOperatorServiceFileDescriptorSupplier() {}
  }

  private static final class IstioOperatorServiceMethodDescriptorSupplier
      extends IstioOperatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IstioOperatorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IstioOperatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IstioOperatorServiceFileDescriptorSupplier())
              .addMethod(getGetAllIstioOperatorInfoMethod())
              .addMethod(getAddIstioOperatorInfoMethod())
              .addMethod(getUpdateIstioOperatorInfoMethod())
              .addMethod(getDeleteIstioOperatorInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
