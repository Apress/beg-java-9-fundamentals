// CloningTest.java
package com.jdojo.object;

public class CloningTest {
    public static void main(String[] args) {
        DoubleHolder dh = new DoubleHolder(100.00);

        // Clone dh 
        DoubleHolder dhClone = (DoubleHolder) dh.clone();

        // Print the values in original and clone
        System.out.println("Original:" + dh.getValue());
        System.out.println("Clone:" + dhClone.getValue());

        // Change the value in original and clone
        dh.setValue(200.00);
        dhClone.setValue(400.00);

        // Print the values in original and clone again
        System.out.println("Original:" + dh.getValue());
        System.out.println("Clone:" + dhClone.getValue());
    }
}
