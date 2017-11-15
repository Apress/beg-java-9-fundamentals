// StackTraceAsStringTest.java
package com.jdojo.exception;

import java.io.StringWriter;
import java.io.PrintWriter;

public class StackTraceAsStringTest {
    public static void main(String[] args) {
        try {
            m1();
        } catch (MyException e) {
            String str = getStackTrace(e);

            // Print the stack trace to the standard output
            System.out.println(str);
        }
    }

    public static void m1() throws MyException {
        m2();
    }

    public static void m2() throws MyException {
        throw new MyException("Some error has occurred.");
    }

    public static String getStackTrace(Throwable e) {
        StringWriter strWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(strWriter);
        e.printStackTrace(printWriter);

        // Get the stack trace as a string
        String str = strWriter.toString();

        return str;
    }
}
