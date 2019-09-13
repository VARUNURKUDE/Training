package com.oops.polymorphism.overriding;

public class SimpleExample {

    //Method overriding is one of the way by which java achieve Run Time Polymorphism.
    // The version of a method that is executed will be determined by the object that is used to invoke it.
    // If an object of a parent class is used to invoke the method, then the version in the parent class will be executed,
    // but if an object of the subclass is used to invoke the method, then the version in the child class will be executed.
    // In other words, it is the type of the object being referred to (not the type of the reference variable) that determines
    // which version of an overridden method will be executed.

    public static class Parent{
        void show(){
            System.out.println("Parent's Show() method");
        }
    }

    public static class Child extends Parent{

        @Override
        void show(){
            System.out.println("Child's Show() method");
        }
    }

        public static void main(String[] args) {
            Parent parent = new Parent();
            parent.show();

            Parent child = new Child();
            child.show();
        }

}
