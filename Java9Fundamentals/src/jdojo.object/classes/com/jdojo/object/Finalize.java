// Finalize.java
package com.jdojo.object;

public class Finalize {
    private int x;

    public Finalize(int x) {
        this.x = x;
    }

    @Override
    public void finalize() {
        System.out.println("Finalizing " + this.x);
    
        /* Perform any cleanup work here... */
    }
}
