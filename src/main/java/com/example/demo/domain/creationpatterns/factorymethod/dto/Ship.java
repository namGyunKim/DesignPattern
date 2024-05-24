package com.example.demo.domain.creationpatterns.factorymethod.dto;

import lombok.Getter;

@Getter
public class Ship {
    private String name;
    private String color;

    protected void generate(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
