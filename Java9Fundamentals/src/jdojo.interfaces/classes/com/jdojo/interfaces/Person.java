// Person.java
package com.jdojo.interfaces;

public class Person implements Walkable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println(name + " (a person) is walking.");
    }
}
