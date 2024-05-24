package com.example.demo.domain.creationpatterns.factorymethod.service;

import com.example.demo.domain.creationpatterns.factorymethod.dto.Ship;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ShipFactoryTest {

    @Autowired
    private ShipFactory whiteShipFactory;

    @Autowired
    private ShipFactory blackShipFactory;

    @Test
    void orderShip() {
        Ship whiteShip = whiteShipFactory.orderShip("홍길동", "abc@naver.com");
        Ship blackShip = blackShipFactory.orderShip("김철수", "ddd@naver.com");

        // Assertions or validations can be added here to verify the results
        System.out.println("White Ship: " + whiteShip.getName() + ", " + whiteShip.getColor());
        System.out.println("Black Ship: " + blackShip.getName() + ", " + blackShip.getColor());
    }
}
