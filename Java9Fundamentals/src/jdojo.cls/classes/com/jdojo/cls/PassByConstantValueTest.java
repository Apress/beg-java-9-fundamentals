// PassByConstantValueTest.java
package com.jdojo.cls;

public class PassByConstantValueTest {
    // x is paased by constant value and y is passed by value
    public static void test(final int x, int y) {
        System.out.println("#2: x = " + x + ", y = " + y);

        /* Uncommenting following statement will generate a compile-time error */
        // x = 79; /* Cannot change x. It is passed by constant value */
        y = 223; // Ok to change y

        System.out.println("#3: x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        int a = 19;
        int b = 37;
        System.out.println("#1: a = " + a + ", b = " + b);
        PassByConstantValueTest.test(a, b);
        System.out.println("#4: a = " + a + ", b = " + b);
    }
}
