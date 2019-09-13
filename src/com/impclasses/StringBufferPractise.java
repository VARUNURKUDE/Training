package com.string;

public class StringBufferPractise {

    public static void main(String[] args) {

        //All the methods of StringBuffer class are synchronized

        //public final class StringBuffer extends AbstractStringBuilder implements Serializable,
        // Comparable<StringBuffer>, CharSequence

        StringBuffer s1 = new StringBuffer("Hello World");

        //length() method
        System.out.println("Length of the stringBuffer is : "+s1.length());

        //capacity() method (Method present in AbstractStringBuilder)
        System.out.println("Capacity of the stringBuffer is : "+s1.capacity());

        //append() method (Method present in AbstractStringBuilder)

        StringBuffer s2 = new StringBuffer("Hello");

        System.out.println("Append 1 : "+s2.append(" World"));

        System.out.println("Append 2 : "+s2.append(1));

        //insert() method (Method present in AbstractStringBuilder)

        StringBuffer s3 = new StringBuffer("Hello");

        System.out.println("Insert 1 : "+s3.insert(5," World"));

        System.out.println("Insert 1 : "+s3.insert(5,1.3));

        char[] array = {' ','W','O','R','L','D'};
        System.out.println("Insert 1 : "+s3.insert(5,array));

        StringBuffer s4 = new StringBuffer("Hello world");

        //delete() method (Method present in AbstractStringBuilder)

        System.out.println("delete example : "+s4.delete(0,5));

        //deleteCharAt() (Method present in AbstractStringBuilder)

        System.out.println("delete example : "+s4.deleteCharAt(0));

        //replace() method

        StringBuffer s5 = new StringBuffer("Hello World");

        System.out.println("Replace example : "+s5.replace(0,5,"Mello"));
    }
}
