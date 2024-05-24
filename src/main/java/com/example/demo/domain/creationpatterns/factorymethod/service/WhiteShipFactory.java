package com.example.demo.domain.creationpatterns.factorymethod.service;

import com.example.demo.domain.creationpatterns.factorymethod.dto.Ship;
import com.example.demo.domain.creationpatterns.factorymethod.dto.WhiteShip;
import org.springframework.stereotype.Component;

@Component
public class WhiteShipFactory implements ShipFactory{


    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
