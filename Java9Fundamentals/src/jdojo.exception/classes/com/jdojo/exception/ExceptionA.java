// ExceptionA.java
package com.jdojo.exception;

public class ExceptionA extends Exception {
    public ExceptionA() {
        super();
    }

    public ExceptionA(String message) {
        super(message);
    }

    public ExceptionA(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionA(Throwable cause) {
        super(cause);
    }
}
