// DecimalFormatter.java
package com.jdojo.format;

import java.text.DecimalFormat;

public class DecimalFormatter {
    private static DecimalFormat formatter = new DecimalFormat();

    public static void main(String[] args) {
        formatNumber("##.##", 12.745);
        formatNumber("##.##", 12.746);
        formatNumber("0000.0000", 12.735);
        formatNumber("#.##", -12.735);

        // Positive and negative number format
        formatNumber("#.##;(#.##)", 12.735);
        formatNumber("#.##;(#.##)", -12.735);
    }

    public static void formatNumber(String pattern, double value) {
        // Apply the pattern
        formatter.applyPattern(pattern);

        // Format the number
        String formattedNumber = formatter.format(value);

        System.out.println("Number: " + value + ", Pattern: "
                + pattern + ", Formatted Number: "
                + formattedNumber);
    }
}
