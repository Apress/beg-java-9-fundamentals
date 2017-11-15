// Item.java
package com.jdojo.array;

public class Item {
    private double price;
    private final String name;

    public Item (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price ) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + this.name + ", " + this.price + "]";
    }
}
