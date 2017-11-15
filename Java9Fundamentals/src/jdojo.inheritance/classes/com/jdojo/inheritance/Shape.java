// Shape.java
package com.jdojo.inheritance;

public abstract class Shape {
    private String name;

    public Shape() {
        this.name = "Unknown shape";
    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract methods 
    public abstract void draw();

    public abstract double getArea();

    public abstract double getPerimeter();
}
