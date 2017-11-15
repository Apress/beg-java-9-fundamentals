// UserInput.java
package com.jdojo.statement;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month;
        do {
            System.out.print("Enter a month[1-12]: ");
    
            // Read an input from the user
            month = input.nextInt();
        } while (month < 1 || month > 12);

        System.out.println("You entered " + month);
    }
}
