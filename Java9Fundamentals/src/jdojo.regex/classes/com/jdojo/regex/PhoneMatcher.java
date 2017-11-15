// PhoneMatcher.java
package com.jdojo.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PhoneMatcher {
    public static void main(String[] args) {
        // Prepare a regular expression: A group of 3 digits followed by 7 digits.
        String regex = "\\b(\\d{3})\\d{7}\\b";

        // Compile the regular expression 
        Pattern p = Pattern.compile(regex);

        String source = "3342449027, 2339829, and 6152534734";

        // Get the Matcher object
        Matcher m = p.matcher(source);

        // Start matching and display the found area codes
        while (m.find()) {
            String phone = m.group();
            String areaCode = m.group(1);
            System.out.printf("Phone: %s, Area Code: %s%n", phone, areaCode);
        }
    }
}
