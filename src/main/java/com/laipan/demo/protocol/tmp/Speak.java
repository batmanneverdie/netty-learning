package com.laipan.demo.protocol.tmp;

public interface Speak {

    static void speak() {
        System.out.println("我要开始叫了！");
    }

    default void dogSpeak() {
        speak();
        System.out.println("汪汪");
    }

    void animalSpeak();
}
