package com.designPattern.creational.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

    }
}
