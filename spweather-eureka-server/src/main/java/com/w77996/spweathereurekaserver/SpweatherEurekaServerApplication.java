package com.w77996.spweathereurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpweatherEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpweatherEurekaServerApplication.class, args);
    }
}
