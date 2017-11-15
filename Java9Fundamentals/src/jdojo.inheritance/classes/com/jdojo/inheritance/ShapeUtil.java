// ShapeUtil.java
package com.jdojo.inheritance;

public class ShapeUtil {
    public static void drawShapes(Shape[] list) {
        for (Shape s : list) {
            // Draw the shape, no matter what it is 
            s.draw(); // Late binding 
        }
    }

    public static void printShapeDetails(Shape[] list) {
        for (Shape s : list) {
            // Gather details about the shape 
            String name = s.getName(); // Late Binding 
            double area = s.getArea(); // Late binding 
            double perimeter = s.getPerimeter(); // Late binding 

            // Print details 
            System.out.println("Name: " + name);
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
        }
    }
}
