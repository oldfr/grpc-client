package com.example.grpcclient;

import com.example.grpcclient.client.GrpcClientClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GrpcClientApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(GrpcClientApplication.class, args);
		 GrpcClientClass grpcClientClass = context.getBean(GrpcClientClass.class);
		 grpcClientClass.testingGRPC();
	}

}
