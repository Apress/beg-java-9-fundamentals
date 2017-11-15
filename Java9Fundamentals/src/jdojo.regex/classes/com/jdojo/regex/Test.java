// Test.java
package com.jdojo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String source = "3342330908, 2337656, 234, 6179086547, unknown";
        String regex = "\\b(\\d{3})?(\\d{3})(\\d{4})\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(source);
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            String replacement = m.group(1) != null ? "($1) $2-$3" : "$2-$3";
            m.appendReplacement(sb, replacement);
        }

        m.appendTail(sb);
        System.out.println(sb.toString());

    }
}
