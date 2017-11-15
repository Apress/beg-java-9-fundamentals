// ExceptionB.java
package com.jdojo.exception;

public class ExceptionB extends Exception {
    public ExceptionB() {
        super();
    }

    public ExceptionB(String message) {
        super(message);
    }

    public ExceptionB(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionB(Throwable cause) {
        super(cause);
    }
}
