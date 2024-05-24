package com.example.demo.domain.creationpatterns.singleton;

import com.example.demo.domain.creationpatterns.factorymethod.service.BlackShipFactory;
import com.example.demo.domain.creationpatterns.factorymethod.service.ShipFactory;
import com.example.demo.domain.creationpatterns.factorymethod.service.WhiteShipFactory;
import com.example.demo.domain.creationpatterns.singleton.entity.Settings;
import com.example.demo.domain.creationpatterns.singleton.entity.Settings2;
import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    void 싱글톤() {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();
        System.out.println(settings1 == settings2);


        Settings2 settings3 = Settings2.getInstance();
        Settings2 settings4 = Settings2.getInstance();
        System.out.println(settings3 == settings4);
    }
}