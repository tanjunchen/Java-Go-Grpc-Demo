package com.ctj.deployment;

import com.tanjunchen.demo.WatchDeploymentGrpc;
import com.tanjunchen.demo.WatchDeploymentProto;
import io.grpc.ClientInterceptors;
import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.NegotiationType;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Slf4j
public class Deployment {

    private  ManagedChannel channel;

    private String host;
    private Integer port;

    public void stream() {

        Object temp = connectObject();

        StreamObserver<WatchDeploymentProto.WatchDeploymentResponse> responseListStreamObserver = new StreamObserver<WatchDeploymentProto.WatchDeploymentResponse>() {
            @Override
            public void onNext(WatchDeploymentProto.WatchDeploymentResponse response) {

            }

            @Override
            public void onError(Throwable t) {
                log.error(t.getMessage());
            }

            @Override
            public void onCompleted() {
                log.debug("response completed!");
            }
        };

        WatchDeploymentGrpc.WatchDeploymentStub futureStub = (WatchDeploymentGrpc.WatchDeploymentStub) temp;
        StreamObserver<WatchDeploymentProto.WatchDeploymentResponse> requestStreamObserver = futureStub.watchDeploymentEvent(responseListStreamObserver);

        WatchDeploymentProto.WatchDeploymentResponse.Builder builder = WatchDeploymentProto.WatchDeploymentResponse.newBuilder();
        requestStreamObserver.onNext(builder.build());
    }

    private Object connectObject() {
        try {
            Class classFQDN = Class.forName("com.tanjunchen.demo.WatchDeploymentGrpc");
            Method methods1 =classFQDN.getMethod("newStub",io.grpc.Channel.class);
            return methods1.invoke(null, ClientInterceptors.intercept(this.channel,new HeaderClientInterceptor("admin","admin")));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Deployment(String host, Integer port){
        this.host = host;
        this.port = port;
        this.channel = getChannel();
    }

    private ManagedChannel getChannel(){
        if(channel == null){
            this.channel = NettyChannelBuilder.forAddress(host, port)
                    .negotiationType(NegotiationType.PLAINTEXT)
                    .build();
        }
        return this.channel;
    }

}
