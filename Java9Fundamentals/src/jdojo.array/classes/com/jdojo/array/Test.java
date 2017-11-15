// Test.java
package com.jdojo.array;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Create an array to work with
        int[][] table1 = {{1, 2, 3}, {10, 20, 30}};
        int[][] table2 = new int[table1.length][];

        // Complete missing logic
        for (int i = 0; i < table1.length; i++) {
            table2[i] = new int[table1[i].length];
            for (int j = 0; j < table1[i].length; j++) {
                table2[i][j] = table1[i][j];
            }
        }

        boolean equal = Arrays.deepEquals(table1, table2);
        System.out.println(equal);
        System.out.println(Arrays.deepToString(table1));
        System.out.println(Arrays.deepToString(table2));

    }
}
