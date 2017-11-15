// Book2.java
package com.jdojo.object;

import java.util.Objects;

public class Book2 {
    private String title;
    private String author;
    private int pageCount;
    private boolean hardCover;
    private double price;

    public static void main(String[] args) {
        Book2 b2 = new Book2();
        b2.title = "Beginning Java 9";
        b2.author = "Kishori Sharan";
        b2.pageCount = 890;
        b2.hardCover = false;
        b2.price = 819.90;
        int h = b2.hashCode();
        System.out.println(h);
    }
    /* Other code goes here */

    /* Must implement the equals() method too. */
    @Override
    public int hashCode() {
        return Objects.hash(title, author, pageCount, hardCover, price);
    }
}
