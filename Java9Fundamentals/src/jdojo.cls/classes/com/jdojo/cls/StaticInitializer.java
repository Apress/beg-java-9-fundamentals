// StaticInitializer.java
package com.jdojo.cls;

public class StaticInitializer {
    private static int num;

    // An instance initializer
    {
        System.out.println("Inside instance initializer.");
    }

    // A static initializer. Note the use of the keyword static below.
    static {
        num = 1245;
        System.out.println("Inside static initializer.");
    }

    // Constructor
    public StaticInitializer() {
        System.out.println("Inside constructor.");
    }

    public static void main(String[] args) {
        System.out.println("Inside main() #1. num: " + num);

        // Declare a reference variable of the class
        StaticInitializer si;

        System.out.println("Inside main() #2. num: " + num);

        // Create an object
        new StaticInitializer();

        System.out.println("Inside main() #3. num: " + num);

        // Create another object
        new StaticInitializer();
    }
}
