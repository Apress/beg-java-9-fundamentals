// ArrayInit.java
package com.jdojo.array;

public class ArrayInit {
    private final boolean[] bArray = new boolean[3];  // An instance variable

    public ArrayInit() {
        // Display the initial value for elements of the instance variable bArray
        for (int i = 0; i < bArray.length; i++) {
            System.out.println("bArray[" + i + "]:" + bArray[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("int array initialization:");

        int[] empId = new int[3];  // A local array variable
        for (int i = 0; i < empId.length; i++) {
            System.out.println("empId[" + i + "]:" + empId[i]);
        }

        System.out.println("\nboolean array initialization:");

        // Initial value for bArray elements are displayed inside the constructor
        new ArrayInit();

        System.out.println("\nReference type array initialization:");

        String[] name = new String[3];  // A local array variable
        for (int i = 0; i < name.length; i++) {
            System.out.println("name[" + i + "]:" + name[i]);
        }
    }
}
