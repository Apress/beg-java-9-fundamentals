// ArithOperator.java
package com.jdojo.operator;

class ArithOperator {
    public static void main(String[] args) {
        int num = 120;
        double realNum = 25.5F;
        double veryBigNum = 25.8 / 0.0;
        double garbage = 0.0 / 0.0;
        boolean test = true;

        // Print the value of num  
        System.out.println("num = " + num);

        // Print the value of realNum  
        System.out.println("realNum = " + realNum);

        // Print the value of veryBigNum  
        System.out.println("veryBigNum = " + veryBigNum);

        // Print the value of garbage  
        System.out.println("garbage = " + garbage);

        // Print the value of test  
        System.out.println("test = " + test);

        // Print the maximum value of int type  
        System.out.println("Maximum int = " + Integer.MAX_VALUE);

        // Print the maximum value of double type  
        System.out.println("Maximum double = " + Double.MAX_VALUE);

        // Print the sum of two numbers  
        System.out.println("12.5 + 100 = " + (12.5 + 100));

        // Print the difference of two numbers  
        System.out.println("12.5 - 100 = " + (12.5 - 100));

        // Print the multiplication of two numbers  
        System.out.println("12.5 * 100 = " + (12.5 * 100));

        // Print the result of division   
        System.out.println("12.5 / 100 = " + (12.5 / 100));

        // Print the result of modulus  
        System.out.println("12.5 % 100 = " + (12.5 % 100));

        // Print the result of string concatenation  
        System.out.println("\"abc\" + \"xyz\" = " + "\"" + ("abc" + "xyz") + "\"");
    }
}
