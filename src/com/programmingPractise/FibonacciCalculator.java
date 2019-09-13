package com.programmingPractise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonacciCalculator {

    public static void main(String[] args) {

        //input to print Fibonacci series upto the numbers
        System.out.print("Enter number up to which Fibonacci series to print:: ");
        int number =new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series up to "+number+" numbers");

        //calling function for printing series
        for(int i=1;i<=number;i++){
            System.out.println("Fibonacci series using tail recursion");
            System.out.println(fibonacciTailRecursion(i)+" ");
        }

        for(int i=1;i<=number;i++){
        System.out.println("Fibonacci series using loop iteration");
        System.out.println(fibonacciLoopIteration(i)+" ");
    }
        for(int i=1;i<=number;i++){
            System.out.println("Fibonacci series using memoization iteration");
            System.out.println(imporvedFibo(i)+" ");
        }

        //comparision of calculation of Fibonacci series between fibonacci using loop iteration and using memoization

        int num=1000000;
        long startTime = System.nanoTime();
        int result = fibonacciLoopIteration(number);
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Time taken to calculate Fibonacci series without memoization :: "+ elapsedTime);

        startTime = System.nanoTime();
        result = imporvedFibo(number);
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Time taken to calculate Fibonacci series with memoization :: "+ elapsedTime);

        //Interesting point is that improved method only shows better performance for large numbers like 100M
        // otherwise iterative version of Fibonacci method is faster. That could be explained by extra work done by
        // improved method in terms of storing value in cache and getting it from there
    }


    public static int fibonacciTailRecursion(int num){

        if(num == 1 || num == 2){
            return 1;
        }
        return fibonacciTailRecursion(num-1) + fibonacciTailRecursion(num-2);
    }

    public static int fibonacciLoopIteration(int num){

        if(num == 1 || num == 2){
            return 1;
        }

        int fibo1=1,fibo2=1,fibonacci=1;

        for(int number=3;number<num;number++){

            fibonacci=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fibonacci;
        }

        return fibonacci;
    }

    public static int imporvedFibo(int number){
        Map<Integer,Integer> cache = new HashMap<Integer,Integer>();
        Integer fibonacci = cache.get(number);

        if(fibonacci != null){
            return fibonacci;
        }

        fibonacci= fibonacciLoopIteration(number);

        cache.put(number,fibonacci);
        return fibonacci;
    }
}
