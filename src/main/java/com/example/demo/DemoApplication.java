package com.example.demo;

import com.example.demo.domain.creationpatterns.singleton.entity.Settings;
import com.example.demo.domain.creationpatterns.singleton.entity.Settings2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }
}