// MethodTypeTest.java
package com.jdojo.cls;

public class MethodTypeTest {
    public static void main(String[] args) {
        // Create an instance of the MethodTYpe class
        MethodType mt = new MethodType();

        // Invoke the instance method
        System.out.println("Invoking instance method...");
        mt.printMN();

        // Invoke the class method using the class name
        System.out.println("Invoking class method using class name...");
        MethodType.printM();

        // Invoke the class method using the instance reference
        System.out.println("Invoking class method using an instance...");
        mt.printM();
    }
}