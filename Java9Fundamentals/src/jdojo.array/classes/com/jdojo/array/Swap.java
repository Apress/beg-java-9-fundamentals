// Swap.java
package com.jdojo.array;

public class Swap {
    public static void main(String[] args) {
        int[] num = {17, 80};

        System.out.println("Before swap");    
        System.out.println("#1: " + num[0]);
        System.out.println("#2: " + num[1]);
        
        // Call the swap() method passing the num array
        swap(num);    

        System.out.println("After swap");    
        System.out.println("#1: " + num[0]);
        System.out.println("#2: " + num[1]);
    }

    // The swap() method accepts an int array as an argument and swaps the values 
    // if array contains two values. 
    public static void swap (int[] source) {
        if (source != null && source.length == 2) {
            // Swap the first and the second elements
            int temp = source[0];
            source[0] = source[1];
            source[1] = temp;
        }
    }
}
