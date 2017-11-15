// Duck.java
package com.jdojo.interfaces;

public class Duck implements Walkable {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println(name + " (a duck) is walking.");
    }
}
