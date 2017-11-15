// MDAccess.java
package com.jdojo.array;

public class MDAccess {
    public static void main(String[] args){
        int[][] ra = new int[3][];        
        ra[0] = new int[2];
        ra[1] = new int[1];
        ra[2] = new int[3];
        
        // Populate the ragged array using for loops
        for(int i = 0; i < ra.length; i++) {
            for(int j = 0; j < ra[i].length; j++){
                ra[i][j] = i + j;
            }
        }

        // Print the array using for loops
        for(int i = 0; i < ra.length; i++) {
            for (int j = 0; j < ra[i].length; j++){
                System.out.print(ra[i][j] + "\t");
            }

            // Add a new line after each row is printed
            System.out.println();
        }        
    }
}
