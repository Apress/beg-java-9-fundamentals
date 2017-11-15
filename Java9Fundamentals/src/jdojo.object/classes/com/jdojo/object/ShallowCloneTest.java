// ShallowCloneTest.java
package com.jdojo.object;

public class ShallowCloneTest {
    public static void main(String[] args) {
        ShallowClone sc = new ShallowClone(100.00);
        ShallowClone scClone = (ShallowClone) sc.clone();

        // Print the value in original and clone
        System.out.println("Original: " + sc.getValue());
        System.out.println("Clone: " + scClone.getValue());

        // Change the value in original and it will change the value 
        // for clone too because we have done shallow cloning 
        sc.setValue(200.00);

        // Print the value in original and clone 
        System.out.println("Original: " + sc.getValue());
        System.out.println("Clone: " + scClone.getValue());
    }
}