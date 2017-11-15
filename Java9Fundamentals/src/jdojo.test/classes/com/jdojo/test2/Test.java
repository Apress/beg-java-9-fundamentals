package com.jdojo.test2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import static java.time.format.DateTimeFormatter.ofPattern;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String pattern = "";        
        
        OffsetDateTime odt = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.of("+05:00:45"));
        
        for(int i = 1; i <= 5 ; i++) {
            char[] c = new char[i];
            Arrays.fill(c, 0, i, 'x');
            String p = pattern + new String(c);
            System.out.println(p + " = " + ofPattern(p).format(odt));
        }
                
        
    }
}
