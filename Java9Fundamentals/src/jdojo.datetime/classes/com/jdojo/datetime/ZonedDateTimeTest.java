// ZonedDateTimeTest.java
package com.jdojo.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {
    public static void main(String[] args) {
        // Get the current zoned datetime for the system default time zone
        ZonedDateTime zdt1 = ZonedDateTime.now();
        System.out.println("Current zoned datetime:" + zdt1);
        
        // Create a local datetime
        LocalDateTime ldt = LocalDateTime.of(2012, Month.MARCH, 11, 7, 30);

        // Create some zoned datetimes
        ZoneId usCentralZone = ZoneId.of("America/Chicago");
        ZonedDateTime zdt2 = ZonedDateTime.of(ldt, usCentralZone);         
        System.out.println(zdt2);
        
        // Get zone offset and zone id
        ZoneOffset offset = zdt2.getOffset();
        ZoneId zone = zdt2.getZone();
        System.out.println("Offset:" + offset + ", Zone:" + zone);
    
        // Subtract 10 hours. Zone-offset changes from -05:00 to -06:00
        ZonedDateTime zdt3 = zdt2.minusHours(10);
        System.out.println(zdt3);
        
        // Create a datetime in Asia/Kolkata time zone
        ZoneId indiaKolkataZone = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zdt4 = ZonedDateTime.of(ldt, indiaKolkataZone); 
        System.out.println(zdt4);
        
        // Perform some conversions on zoned date time
        LocalDateTime ldt2 = zdt4.toLocalDateTime();        
        OffsetDateTime odt = zdt4.toOffsetDateTime();
        Instant i1 = zdt4.toInstant();
        System.out.println("To local datetime: " + ldt2);
        System.out.println("To offset datetime: " + odt);
        System.out.println("To instant: " + i1);
    }
}
