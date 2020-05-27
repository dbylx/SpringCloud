package com.example.consumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumberApplication.class, args);
    }

}
