package com.example.demo;

import com.example.demo.domain.singleton.entity.Settings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        Settings settings = Settings.getInstance();
        Settings settings2 = Settings.getInstance();
        System.out.println(settings == settings2);

        SpringApplication.run(DemoApplication.class, args);
    }
}
