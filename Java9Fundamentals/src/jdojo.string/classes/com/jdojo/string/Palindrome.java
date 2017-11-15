// Palindrome.java
package com.jdojo.string;

import java.util.Objects;

public class Palindrome {
    public static void main(String[] args) {
        String str1 = "hello";
        boolean b1 = Palindrome.isPalindrome(str1);
        System.out.println(str1 + " is a palindrome: " + b1);

        String str2 = "noon";
        boolean b2 = Palindrome.isPalindrome(str2);
        System.out.println(str2 + " is a palindrome: " + b2);        
    }

    public static boolean isPalindrome(String inputString) {
        Objects.requireNonNull(inputString, "String cannot be null.");

        // Get the length of string 
        int len = inputString.length();

        // In case of an empty string and one character strings, we do not need to do
        // any comparisions. They are always palindromes.
        if (len <= 1) {
            return true;
        }

        // Convert the string into uppercase, so we can make the comparisons case insensitive 
        String newStr = inputString.toUpperCase();

        // Initialize the result variable to true 
        boolean result = true;

        // Get the number of comparisons to be done 
        int counter = len / 2;

        // Do the comparison 
        for (int i = 0; i < counter; i++) {
            if (newStr.charAt(i) != newStr.charAt(len - 1 - i)) {
                // It is not a palindrome 
                result = false;

                // Exit the loop
                break;
            }
        }

        return result;
    }
}
