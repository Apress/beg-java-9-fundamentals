// ReadInput.java
package com.jdojo.exception;

import java.io.IOException;

public class ReadInput {
    public static char readChar() {
        char c = '\u0000';
        int input = 0;
        try {
            input = System.in.read();
            if (input != -1) {
                c = (char)input;
            }
        } catch (IOException e) {
            System.out.print("IOException occurred while reading input.");
        }    

        return c;
    }
}
