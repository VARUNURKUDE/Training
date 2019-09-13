package com.oops.polymorphism.overloading;

public class Demo {

    //if the exact prototype does not match with arguments
    //
    //Priority wise, compiler take these steps:
    //
    //Type Conversion but to higher type(in terms of range) in same family.
    //Type conversion to next higher family(suppose if there is no long data type available for an int data type, then it will search for float data type).
    public void show(int x){
        System.out.println("In int "+x);
    }

    public void show (String x){
        System.out.println("In string "+x);
    }

    public void show (byte x){
        System.out.println("In byte "+x);
    }

    public static void main(String[] args) {

        Demo demo = new Demo();
        byte b= 25;
        //byte argument method
        demo.show(b);

        //string argument method
        demo.show("Hello World");

        //int argument method
        demo.show(155);

        //Since char argument method is not there, it will go the next higher level in range that is int
        demo.show('H');

        //Since there is no higher level than float, it will result in error
        //  demo.show(7.5);
    }

}
