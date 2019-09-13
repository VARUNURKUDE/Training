package com.impclasses;

import java.util.Locale;

public class StringPractise {

    public static void main(String[] args) {

        //String class provides equals() and equalsIgnoreCase() methods to compare two strings. These methods compare the value of
        // string to check if two strings are equal or not. It returns true if two strings are equal and false if not.
        String a1="abc";
        String a2 = "def";
        String a3 = "abc";
        String a4 = "ABC";

        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
        System.out.println(a2.equals(a3));
        System.out.println(a1.equalsIgnoreCase(a4));


        //There are several constructors available in String class
        // to get String from char array, byte array, StringBuffer and StringBuilder.
        String s1= new String("abc");
        System.out.println("s1--"+s1);

        char[] arr = {'a','b','c'};
        String s2 = new String(arr);
        System.out.println("s2--"+s2);

        byte[] byteArr = {'d','e','f'};
        String s3 = new String(byteArr);
        System.out.println("s3--"+s3);


        //String class implements Comparable interface, which provides compareTo() and compareToIgnoreCase() methods and it compares
        // two strings lexicographically
        //Both strings are converted into Unicode value for comparison and return an integer value which can be greater than,
        // less than or equal to zero.

        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(a3));
        System.out.println(a2.compareTo(a3));
        System.out.println(a1.compareToIgnoreCase(a4));

        //split()
        //split(String regex): This method splits the string using given regex expression and returns array of string

        String s="a/b/c/d";
        String[] a = s.split("/");

        for(String string : a){
            System.out.println("Split string ->"+string);
        }

        String[] b=s.split("/",3);

        for(String limit: b){
            System.out.println("Split string limit -->"+limit);
        }

        //Java contains method internally checks the indexOf the character we provide and returns true or false based on index value
        // False if index is <0
        //True if index is >=0
        String containsExample = "Hello World";
        System.out.println(containsExample.contains("H"));
        System.out.println(containsExample.contains("X"));

        //length method (Look at the method code)
        String lengthExample1= "Hello";
        String lengthExample2="Hello Universe";
        String lengthExample3 = "Hello World";
        System.out.println("Length 1: "+lengthExample1.length());
        System.out.println("Length 1: "+lengthExample2.length());
        System.out.println("Length 1: "+lengthExample3.length());

        //replace (Look at the method code) (Pattern and Matcher is used)
        String replaceExample = "Hello World";
        replaceExample = replaceExample.replace("H","M");
        System.out.println("Replace String 1: "+replaceExample);

        String replaceExample2= "Hello World Hello Universe";
        replaceExample2 =replaceExample2.replace("Hello","Mello");
        System.out.println("Replace String 2: "+replaceExample2);

        //ReplaceAll internally calls - Pattern.compile(regex).matcher(this).replaceAll(replacement)
        String replaceAllRegexExample="Hello World Hello Universe";
        replaceAllRegexExample=replaceAllRegexExample.replaceAll("Hello","Hi");
        System.out.println("replaceAllRegexExample: "+replaceAllRegexExample);

        //ReplaceAll internally calls - Pattern.compile(regex).matcher(this).replaceFirst(replacement)
        String replaceFirstRegexExample = "Hello World Hello Universe";
        replaceFirstRegexExample = replaceFirstRegexExample.replaceFirst("Hello","Hi");
        System.out.println("replaceFirstRegexExample: "+replaceFirstRegexExample);

        //format() (Look at the method code )(Formatter is used)

        String formatString = "Hello World ";
        System.out.println("Format String : "+String.format("My first program says %s",formatString));

        //using locale as Locale.US
        System.out.println(String.format(Locale.US,"%f",3.14));

        //SubString method (Look at the method code) (StringLatin1 and StringUTF16 is used)
        //this.isLatin1() ? StringLatin1.newString(this.value, beginIndex, subLen) : StringUTF16.newString(this.value, beginIndex, subLen)

        //Substring with starting index
        String subStringBeginsExample = "This is my World Hello World";
        System.out.println("SubString Example :"+subStringBeginsExample.substring(10));

        //Substring with starting and ending index
        String subStringExample = "This is my World Hello World";
        System.out.println("SubString Example :"+subStringExample.substring(10,15));


        //Concatenation

        String concatenationString1 = "Hello";
        String concatenationString2 = " World";

        //Using + operator
        //Operator overloading is only allowed in string in java

        System.out.print("Concatenation example + : "+concatenationString1+concatenationString2);

        //Using concat method (Look at the method code carefully)

        System.out.print("Concatenation example + : "+concatenationString1.concat(concatenationString2));


        //intern() method

        String intern1= new String("abc");
        String intern2="abc";
        String intern3="abc";

        System.out.println("intern1==intern2? "+(intern1==intern3));

        System.out.println("intern2==intern3? "+(intern2==intern3));

        System.out.println("intern2==intern3? "+(intern2==intern1.intern()));
    }

}
