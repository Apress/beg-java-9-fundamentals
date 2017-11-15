// PatternMatcherWithMatchResult.java
package com.jdojo.regex;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherWithMatchResult {
     public static void main(String[] args) {
        String regex = "[abc]@.";

        String source = "cric@jdojo.com is a valid email address";
        PatternMatcher.findPattern(regex, source);

        source = "kelly@jdojo.com is invalid";
        PatternMatcher.findPattern(regex, source);

        source = "a@band@yea@u";
        PatternMatcher.findPattern(regex, source);

        source = "There is an @ sign here";
        PatternMatcher.findPattern(regex, source);
    }

    public static void findPattern(String regex, String source) {
        // Compile regex into a Pattern object
        Pattern p = Pattern.compile(regex);

        // Get a Matcher object
        Matcher m = p.matcher(source);

        // Print regex and source text
        System.out.println("\nRegex: " + regex);
        System.out.println("Text: " + source);

        // Perform find
        boolean found = false;
        while (m.find()) {
            MatchResult result = m.toMatchResult();
            System.out.printf("Matched Text: %s, Start: %s, End: %s%n",
                    result.group(), result.start(), result.end());

            // We found at least one match. Set the found flag to true
            found = true;
        }

        if (!found) {
            // We did not find any match
            System.out.println("No match found");
        }
    }
}
