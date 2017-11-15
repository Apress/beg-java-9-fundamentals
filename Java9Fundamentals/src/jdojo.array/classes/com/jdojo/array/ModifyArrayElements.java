// ModifyArrayElements.java
package com.jdojo.array;

import java.util.Arrays;

public class ModifyArrayElements {
    public static void main(String[] args) {
        int[] origNum = {10, 89, 7};
        String[] origNames = {"Mike", "John"};
        System.out.println("Before method call, origNum: " + Arrays.toString(origNum));
        System.out.println("Before method call, origNames: " + Arrays.toString(origNames));

        // Call methods passing the arrays
        tryElementChange(origNum);
        tryElementChange(origNames);

        System.out.println("After method call, origNum: " + Arrays.toString(origNum));
        System.out.println("After method call, origNames: " + Arrays.toString(origNames));
    }

    public static void tryElementChange(int[] num) {
        // If the array has at least one element, store 1116 in its first element.
        if (num != null && num.length > 0) {
            num[0] = 1116;
        }
    }

    public static void tryElementChange(String[] names) {
        // If the array has at least one element, store "Twinkle" in its first element
        if (names != null && names.length > 0) {
            names[0] = "Twinkle";
        }
    }
}
