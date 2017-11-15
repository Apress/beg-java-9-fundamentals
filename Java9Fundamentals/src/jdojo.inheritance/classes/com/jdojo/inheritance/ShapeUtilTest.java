// ShapeUtilTest.java
package com.jdojo.inheritance;

public class ShapeUtilTest {
    public static void main(String[] args) {
        // Create some shapes, draw, and print their details 
        Shape[] shapeList = new Shape[2];
        shapeList[0] = new Rectangle(2.0, 4.0);  // Upcasting 
        shapeList[1] = new Circle(5.0);          // Upcasting 

        // Draw all shapes 
        ShapeUtil.drawShapes(shapeList);

        // Print details of all shapes 
        ShapeUtil.printShapeDetails(shapeList);
    }
}
