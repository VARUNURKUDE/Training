package com.oops.polymorphism.overriding;

public class ExceptionRuleOne {


    // If the super-class overridden method does not throws an exception, subclass overriding method can only
    // throws the unchecked exception, throwing checked exception will lead to compile-time error.
    class Parent {
        void m1() {
            System.out.println("From parent m1()");
        }

        void m2() {
            System.out.println("From parent  m2()");
        }
    }

    class Child extends Parent {
        @Override
            // no issue while throwing unchecked exception
        void m1() throws ArithmeticException {
            System.out.println("From child m1()");
        }

/*        @Override
            // compile-time error
            // issue while throwin checked exception
        void m2() throws Exception {
            System.out.println("From child m2");
        }
 */   }
}
