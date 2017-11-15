// Book.java
package com.jdojo.object;

public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean hardCover;
    private double price;

    /* Other code goes here */

    /* Must implement the equals() method too. */
    @Override
    public int hashCode() {
        int hash = 37;
        int code = 0;

        // Use title
        code = (title == null ? 0 : title.hashCode());
        hash = hash * 59 + code;

        // Use author
        code = (author == null ? 0 : author.hashCode());
        hash = hash * 59 + code;

        // Use pageCount
        code = pageCount;
        hash = hash * 59 + code;

        // Use hardCover
        code = (hardCover ? 1 : 0);
        hash = hash * 59 + code;

        // Use price
        long priceBits = Double.doubleToLongBits(price);
        code = (int) (priceBits ^ (priceBits >>> 32));
        hash = hash * 59 + code;

        return hash;
    }
}
