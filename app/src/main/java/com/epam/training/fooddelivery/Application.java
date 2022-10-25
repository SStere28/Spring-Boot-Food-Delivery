package com.epam.training.fooddelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
        "com.epam.training.fooddelivery.data", "com.epam.training.fooddelivery.service","com.epam.training.fooddelivery.view"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(FoodDelivery.class, args);
    }
}
