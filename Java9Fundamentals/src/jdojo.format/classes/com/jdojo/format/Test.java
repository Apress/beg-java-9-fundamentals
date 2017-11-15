// Test.java
package com.jdojo.format;

import java.util.Date;
import java.util.Locale;

public class Test {
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {
        String dayName = "TUESDAY";
        int ordinal = Day.valueOf(dayName).ordinal();
        System.out.println(ordinal);
    }
}
