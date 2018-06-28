package com.w77996.spweathereurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpweatherEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpweatherEurekaClientApplication.class, args);
    }
}
