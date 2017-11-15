// FHidingSub3.java
package com.jdojo.inheritance;

public class FHidingSub3 extends FHidingSuper {
    // Hides the num field in FHidingSuper class 
    private int num = 200;

    // Hides the name field in FHidingSuper class 
    private String name = "Wally Inman";

    public void print() {
        // FHidingSub3.num 
        System.out.println("num: " + num);

        // FHidingSuper.num 
        System.out.println("super.num: " + super.num);

        // FHidingSub3.name 
        System.out.println("name: " + name);

        // FHidingSuper.name     
        System.out.println("super.name: " + super.name);
    }
}
