// ComparablePersonTest.java
package com.jdojo.interfaces;

import java.util.Arrays;

public class ComparablePersonTest {
     public static void main(String[] args) {
        ComparablePerson[] persons = new ComparablePerson[] {
                new ComparablePerson("John", "Jacobs"),
                new ComparablePerson("Jeff", "Jacobs"),
                new ComparablePerson("Wally", "Inman")};
        
        System.out.println("Before sorting...");
        print(persons);
        
        // Sort the persons list
        Arrays.sort(persons);
        
        System.out.println("\nAfter sorting...");
        print(persons);
    }
     
    public static void print(ComparablePerson[] persons) {
        for(ComparablePerson person: persons){
            System.out.println(person);
        }
    }
}
