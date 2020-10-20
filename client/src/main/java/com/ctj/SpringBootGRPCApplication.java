package com.ctj;

import com.ctj.deployment.Deployment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGRPCApplication {
    private static final String host = "10.40.30.45";
    private static final int port = 8988;
    public static void main(String[] args) {
        SpringApplication.run(SpringBootGRPCApplication.class, args);
        Deployment deployment = new Deployment(host, port);
        deployment.stream();
    }
}

