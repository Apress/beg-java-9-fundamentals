// Cat.java
package com.jdojo.interfaces;

public class Cat implements Walkable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println(name + " (a cat) is walking.");
    }
}
