// DefaultInit.java
package com.jdojo.cls;

class DefaultInit {  
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean bool;
    String str;
    Human jack;
    
    public static void main(String[] args) {
        // Create an object of DefaultInit class
        DefaultInit obj = new DefaultInit();
        
        // Print the default values for all instance variables
        System.out.println("byte is initialized to " + obj.b);
        System.out.println("short is initialized to " + obj.s);
        System.out.println("int is initialized to " + obj.i);
        System.out.println("long is initialized to " + obj.l);
        System.out.println("float is initialized to " + obj.f);
        System.out.println("double is initialized to " + obj.d);
        System.out.println("boolean is initialized to " + obj.bool);
        System.out.println("String is initialized to " + obj.str);
        System.out.println("Human is initialized to " + obj.jack);
    }
}
