// SimplestInheritanceTest.java
package com.jdojo.inheritance;

public class SimplestInheritanceTest {
    public static void main(String[] args) {
        // Create an object of the Manager class
        Manager mgr = new Manager();

        // Set the manager name
        mgr.setName("Leslie Zanders");

        // Get the manager name
        String mgrName = mgr.getName();

        // Print the manager name
        System.out.println("Manager Name: " + mgrName);
    }
}
