// DefaultNumberFormatters.java
package com.jdojo.format;

import java.util.Locale;
import java.text.NumberFormat;

public class DefaultNumberFormatters {
    public static void main(String[] args) {
        double value = 1566789.785;

        // Default locale
        printFormatted(Locale.getDefault(), value);

        // Indian locale. (Rupee is the Indian currency. Short form is Rs.)
        Locale indianLocale = new Locale("en", "IN");
        printFormatted(indianLocale, value);
    }

    public static void printFormatted(Locale locale, double value) {
        // Get number and currency formatter
        NumberFormat nf = NumberFormat.getInstance(locale);
        NumberFormat cf = NumberFormat.getCurrencyInstance(locale);

        System.out.println("Formatting value: " + value + " for locale: " + locale);
        System.out.println("Number: " + nf.format(value));
        System.out.println("Currency: " + cf.format(value));
    }
}
