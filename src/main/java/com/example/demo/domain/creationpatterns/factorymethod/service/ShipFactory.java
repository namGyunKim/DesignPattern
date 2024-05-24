package com.example.demo.domain.creationpatterns.factorymethod.service;

import com.example.demo.domain.creationpatterns.factorymethod.dto.Ship;
import org.springframework.stereotype.Component;
@Component
public interface ShipFactory {
    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    Ship createShip();

    private void sendEmailTo(String email, Ship ship) {
        System.out.println(email + "님에게 배송 완료 메일을 보냅니다.");
        System.out.println("배 이름 : " + ship.getName());
        System.out.println("배 색깔 : " + ship.getColor());
    }

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("이름을 남겨주세요");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + "님의 배를 준비합니다.");
    }
}
