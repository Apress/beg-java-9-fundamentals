// DeepCloneTest.java
package com.jdojo.object;

public class DeepCloneTest {
    public static void main(String[] args) {
        DeepClone sc = new DeepClone(100.00);
        DeepClone scClone = (DeepClone) sc.clone();

        // Print the value in original and clone
        System.out.println("Original: " + sc.getValue());
        System.out.println("Clone: " + scClone.getValue());

        // Change the value in original and it will not change the value
        // for clone because we have done deep cloning
        sc.setValue(200.00);

        // Print the value in original and clone
        System.out.println("Original: " + sc.getValue());
        System.out.println("Clone: " + scClone.getValue());
    }
}
