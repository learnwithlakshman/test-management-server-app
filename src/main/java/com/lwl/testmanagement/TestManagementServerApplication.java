package com.lwl.testmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TestManagementServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestManagementServerApplication.class, args);
	}

}
