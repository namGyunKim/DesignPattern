package com.example.demo.domain.creationpatterns.factorymethod.service;

import com.example.demo.domain.creationpatterns.factorymethod.dto.BlackShip;
import com.example.demo.domain.creationpatterns.factorymethod.dto.Ship;
import org.springframework.stereotype.Component;

@Component
public class BlackShipFactory implements ShipFactory{


    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
