package com.training.java;

public class Varargs {

    /**
     *
     * @param i
     * @param js
     * @return
     */
    public static int sum(int i, int... js){
    int sum=1;
    for(int x:js){
    sum+=x;
    }
    return sum;
    }

    /**
     *
     * @param i
     * @param js
     * @return
     */
    public static int sumArray(int i,int[] js){

        int sum=1;

        for(int x:js){
            sum+=x;
        }
        return sum;
    }


    public static void main(String[] args) {
    System.out.println("Value of sum---"+ sum(1,2,3,4,5,6));
    }
}
