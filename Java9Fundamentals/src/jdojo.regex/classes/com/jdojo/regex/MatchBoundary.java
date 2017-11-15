// MatchBoundary.java
package com.jdojo.regex;

public class MatchBoundary {
    public static void main(String[] args) {
        // Prepare regular expression. Use \\b to get \b inside the string literal.
        String regex = "\\bapple\\b";
        String replacementStr = "orange";
        String inputStr = "I have an apple and five pineapples";
        String newStr = inputStr.replaceAll(regex, replacementStr);

        System.out.printf("Regular Expression: %s%n", regex);
        System.out.printf("Input String: %s%n", inputStr);
        System.out.printf("Replacement String: %s%n", replacementStr);
        System.out.printf("New String: %s%n", newStr);
    }
}
