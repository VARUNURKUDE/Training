package com.oops.polymorphism.overloading;

public class ReturnType {

    public static int intOverloading(int x){
        return 10;
    }

    //We cannot overload by return type. This behavior is same in C++

    /*public char foo(){
        return 'A';
    }*/


    //However, Overloading methods on return type are possible
    // in cases where the data type of the function being called is explicitly specified.
    public static char charOverloading(int a, int b){
        return 'a';
    }

    public static void main(String[] args) {
        System.out.println(intOverloading(10));

        System.out.println(charOverloading(10,20));
    }
}
