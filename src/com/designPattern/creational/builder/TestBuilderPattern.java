package com.designPattern.creational.builder;

public class TestBuilderPattern {

    public static void main(String args[]) {

        //Creating object using Builder pattern in java
        Cake whiteCake = new Cake.Builder().sugar(1).butter(0.5).  eggs(2).vanila(2).flour(1.5). bakingpowder(0.75).milk(0.5).build();

        //Cake is ready to eat :)
        System.out.println(whiteCake);

        //Creating object using Builder pattern for Computer
        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();

        System.out.println(comp);
    }
}
