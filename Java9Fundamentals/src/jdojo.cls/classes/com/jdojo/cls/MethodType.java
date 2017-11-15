// MethodType.java
package com.jdojo.cls;

public class MethodType {
    static int m = 100; // A static variable
    int n = 200;        // An instance variable

    // Declare a static method
    static void printM() {
        /* You can refer to only static variable m in this method 
           because you are inside a static method. 
        */

        System.out.println("printM() - m = " + m); 
   
        // Uncommenting the following sttaement results in a compile-time error.
        //System.out.println("printM() - n = " + n);
    }

    // Declare an instance method
    void printMN() {
        // You can refer to both static and instance variables m and n in this method.
        System.out.println("printMN() - m = " + m);
        System.out.println("printMN() - n = " + n);
    }
}
