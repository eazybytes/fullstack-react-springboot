package com.eazybytes.eazystore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnableJpaRepositories
// @EntityScan
// @ComponentScan(basePackages = {"com.eazybytes.eazystore.controller"})
public class EazystoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(EazystoreApplication.class, args);
    }

}
