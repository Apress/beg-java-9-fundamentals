// Calc.java
package com.jdojo.array;

import java.util.Arrays;

public class Calc {
    public static void main(String[] args) {
        // Print the list of commandline argument
        System.out.println(Arrays.toString(args));

        // Make sure we received three arguments and the  
        // the second argument has only one character to indicate operation.
        if (!(args.length == 3 && args[1].length() == 1)) {
            printUsage();
            return;    // Stop the program here
        }

        // Parse the two number operands. Place the parsing code inside a try-catch, 
        // so we will handle the error in case both operands are not numbers.
        double n1;
        double n2;
        try {
            n1 = Double.parseDouble(args[0]);
            n2 = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Both operands must be a number");
            printUsage();
            return;    // Stop the program here
        }

        String operation = args[1];
        double result = compute(n1, n2, operation);

        // Print the result
        System.out.println(args[0] + args[1] + args[2] + " = " + result);
    }

    public static double compute(double n1, double n2, String operation) {
        // Initialize the result with not-a-number
        double result = Double.NaN;

        switch (operation) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
            default:
                System.out.println("Invalid operation:" + operation);
        }

        return result;
    }

    public static void printUsage() {
        System.out.println("Usage: java com.jdojo.array.Calc expr");
        System.out.println("Where expr could be:");
        System.out.println("n1 + n1");
        System.out.println("n1 - n2");
        System.out.println("n1 * n2");
        System.out.println("n1 / n2");
        System.out.println("n1 and n2 are two numbers");
    }
}
