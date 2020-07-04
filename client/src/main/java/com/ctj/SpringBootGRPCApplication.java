package com.ctj;

import io.grpc.netty.shaded.io.grpc.netty.NegotiationType;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGRPCApplication {
    private static final String host = "127.0.0.1";
    private static final int port = 9999;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGRPCApplication.class, args);

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

