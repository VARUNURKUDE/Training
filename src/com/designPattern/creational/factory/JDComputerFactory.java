package com.designPattern.creational.factory;

public class JDComputerFactory {

    //According to GoF, this pattern “defines an interface for creating an object,
    // but let subclasses decide which class to instantiate.
    //This pattern delegates the responsibility of initializing a class from the client
    // to a particular factory class by creating a type of virtual constructor.
    public static JDComputer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new JDPc(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new JDServer(ram, hdd, cpu);

        return null;
    }
}
