// ModifyArrayParam.java
package com.jdojo.array;

import java.util.Arrays;

public class ModifyArrayParam {
    public static void main(String[] args) {
        int[] origNum = {101, 307, 78};
        System.out.println("Before method call: " + Arrays.toString(origNum));
        
        // Pass the array to the method
        tryArrayChange(origNum);
        
        System.out.println("After method call: " + Arrays.toString(origNum));
    }

    public static void tryArrayChange(int[] num) {
        System.out.println("Inside method-1: " + Arrays.toString(num));

        // Create and store a new int array in num
        num = new int[]{10, 20};

        System.out.println("Inside method–2: " + Arrays.toString(num));
    }
}
