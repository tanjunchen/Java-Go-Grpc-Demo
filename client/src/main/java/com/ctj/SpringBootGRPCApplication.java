package com.ctj;

import com.tanjunchen.demo.ServiceServiceGrpc;
import com.tanjunchen.demo.SyncServiceResponse;
import io.grpc.netty.shaded.io.grpc.netty.NegotiationType;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGRPCApplication {
    private static final String host = "127.0.0.1";
    private static final int port = 9999;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGRPCApplication.class, args);
        //test1();
        test2();
    }

    private static void test2() {
        io.grpc.Channel channel = NettyChannelBuilder.forAddress(host, port)
                .negotiationType(NegotiationType.PLAINTEXT)
                .build();

        ServiceServiceGrpc.ServiceServiceStub serviceServiceStub = ServiceServiceGrpc.newStub(channel);

        // 异步存根
        StreamObserver<com.tanjunchen.demo.SyncServiceResponse> responseObserver = new StreamObserver<SyncServiceResponse>() {
            @Override
            public void onNext(SyncServiceResponse value) {
                System.out.println("返回了结果 ==> " + value);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

            }
        };

        com.tanjunchen.demo.SyncServiceRequest request = com.tanjunchen.demo.SyncServiceRequest.newBuilder().build();
        StreamObserver<com.tanjunchen.demo.SyncServiceRequest> result = serviceServiceStub.syncServiceWatchListService(responseObserver);
        result.onNext(request);
        result.onCompleted();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void test1() {
        io.grpc.Channel channel = NettyChannelBuilder.forAddress(host, port)
                .negotiationType(NegotiationType.PLAINTEXT)
                .build();

        com.tanjunchen.demo.ProdRequest req =
                com.tanjunchen.demo.ProdRequest.newBuilder()
                        .setProdId(1000).build();

        com.tanjunchen.demo.ProdResponse result =
                com.tanjunchen.demo.ProductServiceGrpc.newBlockingStub(channel).getProductStock(req);
        try {
            System.out.println(result);
            System.out.println(result.getStatus().getCode());
            System.out.println(result.getStatus().getMsg());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

