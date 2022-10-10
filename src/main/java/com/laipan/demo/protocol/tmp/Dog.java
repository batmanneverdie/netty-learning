package com.laipan.demo.protocol.tmp;

public class Dog implements Speak{

    @Override
    public void animalSpeak() {
        System.out.println("这是狗狗的叫声！");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.dogSpeak();
    }
}
