package com.designPattern.creational.singleton;

public class Singleton {

    private static final Singleton instance = new Singleton();

    //private constructor to avoid client application to use the constructor
    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }
}
