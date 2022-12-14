package com.example.grpcclient.client;

import org.springframework.stereotype.Service;
import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class GrpcClientClass {

    @GrpcClient("city-score")
    private com.example.grpcserver.HelloServiceGrpc.HelloServiceBlockingStub helloServiceBlockingStub;

    public void testingGRPC() {
        com.example.grpcserver.HelloRequest helloRequest = com.example.grpcserver.HelloRequest.newBuilder().setFirstName("Ankitha").setLastName("HJ").build();
        com.example.grpcserver.HelloResponse response = helloServiceBlockingStub.hello(helloRequest);
        System.out.println("response:"+response);
    }
}
