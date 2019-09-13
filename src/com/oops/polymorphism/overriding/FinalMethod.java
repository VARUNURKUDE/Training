package com.oops.polymorphism.overriding;

public class FinalMethod {

    // If we don’t want a method to be overridden, we declare it as final
    class Parent{
        final void show(){}
    }

    class Child extends Parent{
       /* @Override
        void show(){

        }*/
    }
}
