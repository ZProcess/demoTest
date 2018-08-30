package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitReciever {

    public static void main(String[] args) {
        SpringApplication.run(RabbitReciever.class,args);
    }
}
