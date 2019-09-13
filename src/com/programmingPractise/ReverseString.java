package com.programmingPractise;

public class ReverseString {

    public static void main(String[] args) {

        String one = "Hello World";
        String reverse = new StringBuffer(one).reverse().toString();
        System.out.printf("Original string : %s, reversed string %s %n", one ,reverse);

        String two = "Hello Universe";
        reverse = new StringBuilder(one).reverse().toString();
        System.out.printf("Original string : %s, reversed string %s %n", two ,reverse);

        String three = "Hello Infinity";
        reverse = reverse(three);
        System.out.printf("Original string : %s, reversed string %s %n", three ,reverse);
    }

    public static String reverse(String source){

        if(source == null || source.isEmpty() ){
            return source;
        }

        String reverse = "";
        for(int i=source.length()-1;i<0;i--){
            reverse = reverse + source.charAt(i);
        }
        return reverse;
    }
}
