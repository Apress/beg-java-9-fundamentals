// ArrayClass.java
package com.jdojo.array;

public class ArrayClass {
    public static void main (String[] args){
        int[] iArr = new int[2];
        int[][] iiArr = new int[2][2];
        int[][][] iiiArr = new int[2][2][2];
        
        String[] sArr  = {"A", "B"} ;
        String[][] ssArr = {{"AA"}, {"BB"}} ;
        String[][][] sssArr = {} ; // A 3D empty array of string

        // Print the class name for all arrays    
        System.out.println("int[]: " + getClassName(iArr));
        System.out.println("int[][]: " + getClassName(iiArr));
        System.out.println("int[][][]: " + getClassName(iiiArr));
        System.out.println("String[]: " + getClassName(sArr));
        System.out.println("String[][]: " + getClassName(ssArr));
        System.out.println("String[][][]: " + getClassName(sssArr));
    }

    // Any Java object can be passed to getClassName() method.
    // Since every array is an object, we can also pass an array to this method.
    public static String getClassName(Object obj) {
        // Get the reference of its class
        Class<?> c = obj.getClass();

        // Get the name of the class
        String className = c.getName();
        return className;
    }
}
