// FinalizeTest.java
package com.jdojo.object;

public class FinalizeTest {
    public static void main(String[] args) {
        // Create many objects, say 20000 objects.
        for(int i = 0; i < 2000000; i++) {
            new Finalize(i);        
        }    
    }
}
