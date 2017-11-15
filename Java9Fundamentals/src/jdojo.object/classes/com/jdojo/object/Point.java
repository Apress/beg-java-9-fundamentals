// Point.java
package com.jdojo.object;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /* Reimplement toString() method of the Object class */
    @Override
    public String toString() {
        String str = "(" + x + ", " + y + ")";
        return str;
    }
}
