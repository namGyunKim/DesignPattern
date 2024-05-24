package com.example.demo.domain.creationpatterns.singleton.entity;

import lombok.Getter;

//즉시로딩 방식 (Eager Initialization)
//단점 : 프로그램이 시작될 때 인스턴스를 생성하기 때문에 메모리를 미리 차지하게 됩니다.
@Getter
public class Settings2 {
    private static final Settings2 instance = new Settings2();

    // private 생성자는 외부에서 이 클래스의 인스턴스를 생성하지 못하도록 합니다.
    private Settings2() {
    }
}
