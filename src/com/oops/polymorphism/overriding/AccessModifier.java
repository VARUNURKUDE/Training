package com.oops.polymorphism.overriding;

public class AccessModifier {

    public static class Parent{

        // private methods are not overridden
        private void action1(){
            System.out.println("Parent class action1 method");
        }

        protected void action2(){
            System.out.println("Parent class action2 method");
        }
    }

    public static class Child extends Parent{

        //The access modifier for an overriding method can allow more, but not less, access than the overridden method.
        // For example, a protected instance method in the super-class can be made public, but not private, in the subclass.
        // Doing so, will generate compile-time error.

        // new m1() method
        // unique to Child class
        private void action1(){
            System.out.println("Child class action1 method");
        }

        // overriding method
        // with more accessibility
        @Override
        protected void action2(){
            System.out.println("Child class action2 method");
        }

    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.action1();
        parent.action2();

        Parent child = new Child();
        child.action1();
        child.action2();
    }
}
