// ArrayListToArray.java
package com.jdojo.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("cat");
        al.add("dog");
        al.add("rat");

        // Print the content of the ArrayList
        System.out.println("ArrayList: " + al);

        // Create an array of the same length as the ArrayList
        String[] s1 = new String[al.size()];

        // Copy the ArrayList elements to the array
        String[] s2 = al.toArray(s1);

        // s1 has enough space to copy all ArrayList elements.
        // al.toArray(s1) returns s1 itself 
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1: " + Arrays.toString(s1));
        System.out.println("s2: " + Arrays.toString(s2));

        // Create an array of string with 1 element.
        s1 = new String[1];
        s1[0] = "hello"; // Store hello in first element

        // Copy ArrayList to the array s1
        s2 = al.toArray(s1);

        /* Since s1 doesn't have sufficient space to copy all ArrayList elements,
           al.toArray(s1) creates a new String array with 3 elements in it. All 
           elements of arraylist are copied to new array. Finally, the new array is 
           returned. Here, s1 == s2 is false. s1 will be untouched by the method call.
         */
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1: " + Arrays.toString(s1));
        System.out.println("s2: " + Arrays.toString(s2));
    }
}
