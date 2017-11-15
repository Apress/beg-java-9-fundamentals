// BadSwapTest.java
package com.jdojo.cls;

public class BadSwapTest {
    public static void swap(int x, int y) {
        System.out.println("#2: x = " + x + ", y = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("#3: x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        int a = 19;
        int b = 37;

        System.out.println("#1: a = " + a + ", b = " + b);

        // Call the swap() method to swap values of a and b
        BadSwapTest.swap(a, b);

        System.out.println("#4: a = " + a + ", b = " + b);
    }
}
