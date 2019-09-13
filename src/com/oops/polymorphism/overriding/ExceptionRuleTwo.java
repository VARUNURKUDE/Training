package com.oops.polymorphism.overriding;

public class ExceptionRuleTwo {

    //If the super-class overridden method does throws an exception, subclass overriding method can only throw same,
    // subclass exception. Throwing parent exception in Exception hierarchy will lead to compile time error.
    // Also there is no issue if subclass overridden method is not throwing any exception.

    // Java program to demonstrate overriding when
// superclass method does declare an exception

    class Parent {
        void m1() throws RuntimeException
        {
            System.out.println("From parent m1()");
        }
    }

    class Child1 extends Parent {
        @Override
            // no issue while throwing same exception
        void m1() throws RuntimeException
        {
            System.out.println("From child1 m1()");
        }
    }
    class Child2 extends Parent {
        @Override
            // no issue while throwing subclass exception
        void m1() throws ArithmeticException
        {
            System.out.println("From child2 m1()");
        }
    }
    class Child3 extends Parent {
        @Override
            // no issue while not throwing any exception
        void m1()
        {
            System.out.println("From child3 m1()");
        }
    }
    class Child4 extends Parent {
        @Override
            // compile-time error
            // issue while throwing parent exception
        void m1()
                //throws Exception
        {
            System.out.println("From child4 m1()");
        }
    }
}
