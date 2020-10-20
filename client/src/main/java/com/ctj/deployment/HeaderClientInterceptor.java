package com.ctj.deployment;

import io.grpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HeaderClientInterceptor implements ClientInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(HeaderClientInterceptor.class);

    static final Metadata.Key<String> CUSTOM_HEADER_APPID =
            Metadata.Key.of("appid", Metadata.ASCII_STRING_MARSHALLER);
    static final Metadata.Key<String> CUSTOM_HEADER_KEY =
            Metadata.Key.of("appkey", Metadata.ASCII_STRING_MARSHALLER);

    private String appId;
    private String appKey;
    public HeaderClientInterceptor(String appId, String appKey){
        this.appId = appId;
        this.appKey = appKey;
    }


    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions, Channel channel) {
        return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(channel.newCall(methodDescriptor, callOptions)) {

            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                /* put custom header */
                headers.put(CUSTOM_HEADER_KEY, appKey);
                headers.put(CUSTOM_HEADER_APPID, appId);
                super.start(new ForwardingClientCallListener.SimpleForwardingClientCallListener<RespT>(responseListener) {
                    @Override
                    public void onHeaders(Metadata headers) {
                        /**
                         * if you don't need receive header from server,
                         * you can use {@link io.grpc.stub.MetadataUtils#attachHeaders}
                         * directly to send header
                         */
                        logger.debug("客户端拦截器:header received from server:" + headers);
                        super.onHeaders(headers);
                    }
                }, headers);
            }
        };

    }
}
