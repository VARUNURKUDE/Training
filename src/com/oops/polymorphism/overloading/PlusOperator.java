package com.oops.polymorphism.overloading;

public class PlusOperator {

    //Java doesn't allow operator overloading yet, + is overloaded for class String.
    //
    //Important points
    //When you add a non string operand such as an integer or char to a String, the non-string operand is converted to a string
    // and string concatenation happens.
    //
    //If both operands are char literals, the + operator performs addition rather than string concatenation by promoting each of
    // the char-valued operands to int values through widening primitive conversion.

    public static void main(String[] args) {
        final String first = "length:10";
        final String second = "length:" + first.length();

        //The + operator, whether used for addition or string concatenation, has more precedence than the == operator.
        // Therefore, the parameter of the println method is evaluated like:
        //
        //System.out.println(("first and second are equal: " + first) == second);
        System.out.println("first and second are equal: "+ first==second);

        String str = "420";
        str+=42;
        System.out.println(str);

        System.out.println('a');
        //Here both operands are char literals. Because neither operand is of type String, the + operator performs addition rather than
        // string concatenation. The compiler evaluates the constant expression 'a' + 'b' by promoting each of the char-valued
        // operands ('a' and 'b') to int values through widening primitive conversion. Widening primitive conversion of a char to an
        // int zero extends the 16-bit char value to fill the 32-bit int. In the case of 'a', the char value is 97 and in the case
        // of 'b', it is 9b, so the expression 'a' + 'b' is equivalent to the int constant 97 + 98, or 195.
        System.out.println('a' + 'b');

        //Java doesn't allow operator overloading yet + is overloaded for class String. When you add a String to an integer or char it
        // is converted to a string and hence string concatenation happens. So output is Hab.
        System.out.println("H" + 'a' + 'b');

        //Java evaluates operands from left. So it adds ‘a’ and ‘b’ as string literals and
        // then concatenates the result to the string “H” to get 195H.
        System.out.println('a' + 'b'+"H");
        System.out.println('a' + 'b'+"H" + 'a' + 'b');
    }
}
