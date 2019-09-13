package com.programmingPractise;

import java.util.Scanner;

public class PrimeNumber {

    //By the way, you can even take this problem of checking if a number is prime or not,
    // to next level by try to implement different algorithms for finding primes e.g. sieve of Atkin or  sieve of Eratosthenes.
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int number = Integer.MAX_VALUE;
        System.out.println("Enter number to check if prime or not ::");
        while(number !=0){
            number = scrn.nextInt();
            System.out.printf("Does %d is prime ? %s %n", number, isPrime(number));
        }
    }

    public static boolean isPrime(int number){
        int sqrt =(int) Math.sqrt(number)+1;
        for(int i=2; i< sqrt; i++){

            if(number % i == 0){
                    return false;
            }
        }
        return true;
    }
}
