package com.example.manydatesource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ManydatesourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManydatesourceApplication.class, args);
    }
}
