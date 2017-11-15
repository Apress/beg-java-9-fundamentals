// Rectangle.java
package com.jdojo.inheritance;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        // Set the shape name as "Rectangle" 
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    // Provide an implementation for inherited abstract draw() method
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }

    // Provide an implementation for inherited abstract getArea() method 
    @Override
    public double getArea() {
        return width * height;
    }

    // Provide an implementation for inherited abstract getPerimeter() method
    @Override
    public double getPerimeter() {
        return 2.0 * (width + height);
    }
}
