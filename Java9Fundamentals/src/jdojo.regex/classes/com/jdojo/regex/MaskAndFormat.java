// MaskAndFormat.java
package com.jdojo.regex;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaskAndFormat {
    public static void main(String[] args) {
        // Prepare the regular expression
        String regex = "\\b(\\d{3})(\\d{3})(\\d{4})\\b";        
        String source = "3342449027, 2339829, and 6152534734";

        // Compile the regular expression
        Pattern p = Pattern.compile(regex);

        // Get Matcher object
        Matcher m = p.matcher(source);

        // Replace the phone numbers by formatted phone numbers
        String formattedSource = m.replaceAll(MaskAndFormat::mask);

        System.out.printf("Text: %s%n", source );
        System.out.printf("Formatted Text: %s%n", formattedSource );
    }
    
    private static String mask(MatchResult result) {
        String replacementText = "($1) $2-$3";
        
        String areaCode = result.group(1);
        if("334".equals(areaCode)) {
            replacementText = "(***) ***-****";
        }
        
        return replacementText;
    }
}
