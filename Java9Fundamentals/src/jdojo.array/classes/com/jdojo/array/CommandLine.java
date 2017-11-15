// CommandLine.java
package com.jdojo.array;

public class CommandLine {
    public static void main(String[] args) {
        // args contains all command-line arguments
        System.out.println("Total Arguments: " + args.length);

        // Display all arguments
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument #" + (i + 1) + ": " + args[i]);
        }
    }
}
