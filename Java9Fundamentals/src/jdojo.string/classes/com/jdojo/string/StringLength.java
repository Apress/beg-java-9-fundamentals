// StringLength.java
package com.jdojo.string;

public class StringLength {
    public static void main(String[] args) {
        // Create two string objects 
        String str1 = new String();
        String str2 = new String("Hello");

        // Get the length of str1 and str2 
        int len1 = str1.length();
        int len2 = str2.length();

        // Display the length of str1 and str2 
        System.out.println("Length of \"" + str1 + "\" = " + len1);
        System.out.println("Length of \"" + str2 + "\" = " + len2);
    }
}
