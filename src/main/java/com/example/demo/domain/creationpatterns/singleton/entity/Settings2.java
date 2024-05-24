package com.example.demo.domain.creationpatterns.singleton.entity;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

//즉시로딩 방식 (Eager Initialization)
//단점 : 프로그램이 시작될 때 인스턴스를 생성하기 때문에 메모리를 미리 차지하게 됩니다.
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Settings2 {
    private static final Settings2 instance = new Settings2();

    public static Settings2 getInstance() {
        return instance;
    }
}
