package com.oops.polymorphism.overriding;

public class StaticMethodChild extends StaticMethodParent{
    // This method hides m1() in Parent
    static void action1()
    {
        System.out.println("From child static m1()");
    }

    // This method overrides m2() in Parent
    @Override
    public void action2()
    {
        System.out.println("From parent "
                + "non-static(instance) m2()");
    }
}
