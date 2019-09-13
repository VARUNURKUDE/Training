package com.oops.polymorphism.overriding;

public class StaticMethodTest {

    //http://docs.oracle.com/javase/tutorial/java/IandI/override.html

    public static void main(String[] args) {

        StaticMethodParent obj1 = new StaticMethodParent();

        // As per overriding rules this
        // should call to class Child static
        // overridden method. Since static
        // method can not be overridden, it
        // calls Parent's action1()
        obj1.action1();

        // Here overriding works
        // and Child's action2() is called
        obj1.action2();

        StaticMethodParent obj2 = new StaticMethodChild();
        obj2.action1();
        obj2.action2();

        StaticMethodChild obj3 = new StaticMethodChild();
        obj3.action1();
        obj3.action2();
    }
}
