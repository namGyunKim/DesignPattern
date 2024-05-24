package com.example.demo.domain.creationpatterns.singleton.entity;

public class Settings {
    // volatile 키워드는 instance 변수가 여러 스레드 간에 일관되게 보이도록 보장합니다.
    // 이는 변수의 값을 모든 스레드가 즉시 일관되게 볼 수 있도록 합니다.
    private static volatile Settings instance;

    // private 생성자는 외부에서 이 클래스의 인스턴스를 생성하지 못하도록 합니다.
    private Settings() {
    }

    // 지연 로딩 (Lazy Initialization)
    public static Settings getInstance() {
        // 첫 번째 null 체크: 인스턴스가 이미 생성되었는지 확인합니다.
        if (instance == null) {
            // 동기화 블록: 여러 스레드가 동시에 이 블록에 접근하지 못하게 합니다.
            synchronized (Settings.class) {
                // 두 번째 null 체크: 동기화 블록 내에서 다시 한 번 인스턴스가 생성되었는지 확인합니다.
//                더블 체크드 로킹(Double-Checked Locking) 패턴
                if (instance == null) {
                    // 인스턴스가 null인 경우, 새로운 Settings 인스턴스를 생성합니다.
                    instance = new Settings();
                }
            }
        }
        // 이미 생성된 인스턴스가 있으면 그것을 반환합니다.
        return instance;
    }
}
