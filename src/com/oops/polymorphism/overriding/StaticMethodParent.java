package com.oops.polymorphism.overriding;

public class StaticMethodParent {

    static void action1(){
        System.out.println("From parent static m1()");
    }

    void action2(){
        System.out.println("From parent "
                + "non-static(instance) m2()");
    }
}
