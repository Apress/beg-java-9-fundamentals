// NameIterator.java
package com.jdojo.array;

import java.util.ArrayList;

public class NameIterator {
    public static void main(String[] args) {
        // Create an ArrayList of String
        ArrayList<String> nameList = new ArrayList<>();

        // Add some names
        nameList.add("Chris");
        nameList.add("Laynie");
        nameList.add("Jessica");

        // Get the count of names in the list
        int count = nameList.size();        

        // Let us print the name list using a for loop
        System.out.println("List of names...");
        for(int i = 0; i < count; i++) {
            String name = nameList.get(i);
            System.out.println(name);
        }

        // Let us remove Jessica from the list
        nameList.remove("Jessica");

        // Get the count of names in the list again
        count = nameList.size();        

        // Let us print the name list again using a for-each loop
        System.out.println("\nAfter removing Jessica...");
        for(String name : nameList) {            
            System.out.println(name);
        }
    }
}
