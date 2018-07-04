package com.w77996.spweather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpweatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpweatherApplication.class, args);
	}
}
