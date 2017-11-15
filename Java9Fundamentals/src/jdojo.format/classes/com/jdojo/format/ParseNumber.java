// ParseNumber.java
package com.jdojo.format;

import java.text.DecimalFormat;
import java.text.ParsePosition;

public class ParseNumber {
    public static void main(String[] args) {
        // Parse a string to decimal number
        String str = "XY4,123.983";
        String pattern = "#,###.###";
        DecimalFormat formatter = new DecimalFormat(pattern); 

        // Create a ParsePosition object to specify the first digit of number 
        // in the string. It is 4 in "XY4,123.983" with the index 2.
        ParsePosition pos = new ParsePosition(2);

        Number numberObject = formatter.parse(str, pos);

        double value = numberObject.doubleValue();
        System.out.println("Parsed Value is " + value);
    }
}
