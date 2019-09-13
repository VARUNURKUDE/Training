package com.oops.polymorphism.overloading;

public class StaticMethod {

    //We can have two ore more static methods with same name, but differences in input parameters.

    //We cannot overload two methods in Java if they differ
    // only by static keyword (number of parameters and types of parameters is same).

    public static int sum(int x, int y){
        return x+y;
    }

    public static int sum(int x, int y , int z){
        return x+y+z;
    }

    public static void main(String[] args) {
        System.out.println(sum(10,20));

        System.out.println(sum(10,20,30));
    }
}
