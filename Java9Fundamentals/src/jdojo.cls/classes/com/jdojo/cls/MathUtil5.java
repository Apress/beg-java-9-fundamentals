// MathUtil5.java
package com.jdojo.cls;

public class MathUtil5 {
    public static int max(int n1, int n2, int... num) {
        // Initialize max to teh maximu of n1 and n2
        int max = (n1 > n2 ? n1 : n2);

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        System.out.println("max(7, 9) = " + MathUtil5.max(7, 9));
        System.out.println("max(70, 19, 30) = " + MathUtil5.max(70, 19, 30));
        System.out.println("max(-7, -1, 3) = " + MathUtil5.max(-70, -1, 3));
    }
}
