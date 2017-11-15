package com.jdojo.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;

public class Test {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(1968, Month.JANUARY, 12);
        LocalDate ld2 = LocalDate.of(1969, Month.SEPTEMBER, 19);
        long daysBetween = DAYS.between(ld1, ld2);
        System.out.println(daysBetween);
    }
    
 
    
}
