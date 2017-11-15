// ArrayCopyTest.java
package com.jdojo.array;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        // Have an array with 5 elements
        int[] data = {1, 2, 3, 4, 5};

        // Expand the data array to 7 elements
        int[] eData = expandArray(data, 7);

        // Truncate the data array to 3 elements
        int[] tData = expandArray(data, 3);

        System.out.println("Using for-loop...");
        printArrays(data, eData, tData);

        /* Using System.arraycopy() method */
        // Copy data array to new arrays
        eData = new int[7];
        tData = new int[3];
        System.arraycopy(data, 0, eData, 0, 5);
        System.arraycopy(data, 0, tData, 0, 3);

        System.out.println("\nUsing System.arraycopy() method...");
        printArrays(data, eData, tData);

        /* Using Arrays.copyOf() method  */
        // Copy data array to new arrays
        eData = Arrays.copyOf(data, 7);
        tData = Arrays.copyOf(data, 3);
        System.out.println("\nUsing Arrays.copyOf() method...");
        printArrays(data, eData, tData);

        /* Using Arrays.copyOfRange() method  */
        // Copy data array to new arrays
        int[] copy1 = Arrays.copyOfRange(data, 0, 3);
        int[] copy2 = Arrays.copyOfRange(data, 2, 4);
        System.out.println("\nUsing Arrays.copyOfRange() method...");
        System.out.println("Original Array: " + Arrays.toString(data));
        System.out.println("Copy1 (0, 3): " + Arrays.toString(copy1));
        System.out.println("Copy2 (2, 4): " + Arrays.toString(copy2));
    }

    // Uses a for-loop to copy an array
    public static int[] expandArray(int[] oldArray, int newLength) {
        int originalLength = oldArray.length;
        int[] newArray = new int[newLength];
        int elementsToCopy = originalLength > newLength ? newLength : originalLength;

        for (int i = 0; i < elementsToCopy; i++) {
            newArray[i] = oldArray[i];
        }

        return newArray;
    }

    private static void printArrays(int[] original, int[] expanded, int[] truncated) {
        System.out.println("Original Array: " + Arrays.toString(original));
        System.out.println("Expanded Array: " + Arrays.toString(expanded));
        System.out.println("Truncated Array: " + Arrays.toString(truncated));
    }
}
