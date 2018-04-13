package com.dataart.dshmain.boottest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class BootTest1CloudZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootTest1CloudZipkinServerApplication.class, args);
	}
}
