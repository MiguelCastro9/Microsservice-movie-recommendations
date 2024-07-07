package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MovieRecommendationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieRecommendationServiceApplication.class, args);
    }
}
