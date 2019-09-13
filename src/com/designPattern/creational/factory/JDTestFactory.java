package com.designPattern.creational.factory;

public class JDTestFactory {
    public static void main(String[] args) {

        //When to Use Factory Method Design Pattern
        //>>When the implementation of an interface or an abstract class is expected to change frequently
        //>>When the current implementation cannot comfortably accommodate new change
        //>>When the initialization process is relatively simple, and the constructor only requires a handful of parameters

        JDComputer pc = JDComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        JDComputer server = JDComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
    }
}
