package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication(scanBasePackages = "com")
@EnableDiscoveryClient
public class BusStart {
    public static void main(String[] args) {
        SpringApplication.run(BusStart.class, args);
    }

}
