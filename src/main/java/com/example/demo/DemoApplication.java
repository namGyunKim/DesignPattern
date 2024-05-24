package com.example.demo;

import com.example.demo.domain.creationpatterns.singleton.entity.Settings;
import com.example.demo.domain.creationpatterns.singleton.entity.Settings2;

//@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();
        System.out.println(settings1 == settings2);


        Settings2 settings3 = Settings2.getInstance();
        Settings2 settings4 = Settings2.getInstance();
        System.out.println(settings3 == settings4);

//        SpringApplication.run(DemoApplication.class, args);
    }
}
