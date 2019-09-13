package com.oops.polymorphism.overloading;

public class MainMethod {

    //Important Points:
    //The main method in Java is no extra-terrestrial method. Apart from the fact that main() is just like any other method
    // & can be overloaded in a similar manner, JVM always looks for the method signature to launch the program.
    //
    //The normal main method acts as an entry point for the JVM to start the execution of program.
    //We can overload the main method in Java. But the program doesn't execute the overloaded main method when we run your program,
    // we need to call the overloaded main method from the actual main method only.
    public static void main(String[] args) {
        System.out.println("Hello World");
        MainMethod.main("Hello");
    }

    public static void main (String arg1){
        System.out.println(arg1+" Universe");
        MainMethod.main("Hello","Infinity");
    }

    public static void main (String arg1,String arg2){
        System.out.println(arg1+arg2);
    }
}
