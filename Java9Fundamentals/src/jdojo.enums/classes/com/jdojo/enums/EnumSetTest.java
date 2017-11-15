// EnumSetTest.java
package com.jdojo.enums;

import java.util.EnumSet;

public class EnumSetTest {
    public static void main(String[] args) {
        // Get all constants of the Day enum    
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        print(allDays, "All days: ");

        // Get all constants from MONDAY to FRIDAY of the Day enum    
        EnumSet<Day> weekDays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
        print(weekDays, "Weekdays: ");

        // Get all constants that are not from MONDAY to FRIDAY of the Day enum.
        // Essentially, we will get days representing weekends. 
        EnumSet<Day> weekends = EnumSet.complementOf(weekDays);
        print(weekends, "Weekends: ");
    }

    public static void print(EnumSet<Day> days, String msg) {
        System.out.print(msg);
        for (Day d : days) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
