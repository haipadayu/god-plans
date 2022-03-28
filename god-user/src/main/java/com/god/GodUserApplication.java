package com.god;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GodUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GodUserApplication.class, args);
    }

}
