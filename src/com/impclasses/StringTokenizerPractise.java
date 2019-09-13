package com.impclasses;

import java.util.StringTokenizer;

public class StringTokenizerPractise {

    public static void main(String[] args) {

        //Using default constructor which considers default delimiters like new line, space, tab,
        //carriage return and form feed.

        //Baeldung

        StringTokenizer s1 =  new StringTokenizer("Hello World Hello Universe");
        while(s1.hasMoreTokens())
        System.out.println("Example 1 : "+s1.nextToken());

        StringTokenizer s2 =  new StringTokenizer("Hello World Hello Universe"," ");
        while(s2.hasMoreTokens())
            System.out.println("Example 2 : "+s2.nextToken());

        StringTokenizer s3 =  new StringTokenizer("Hello World Hello Universe"," ",true);
        while(s3.hasMoreTokens())
            System.out.println("Example 3 : "+s3.nextToken());

        StringTokenizer s4 =  new StringTokenizer("Hello World Hello Universe"," ",true);
        while(s4.hasMoreTokens())
            System.out.println("Example 4 : "+s4.nextToken("o"));

    }
}
