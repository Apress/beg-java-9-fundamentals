// InterCalendarDates.java
package com.jdojo.datetime;

import java.time.LocalDate;
import java.time.chrono.ThaiBuddhistDate;

public class InterCalendarDates {
    public static void main(String[] args) {
        ThaiBuddhistDate thaiBuddhistNow = ThaiBuddhistDate.now();
        LocalDate isoNow = LocalDate.now();
        System.out.println("Thai Buddhist Current Date: " + thaiBuddhistNow);
        System.out.println("ISO Current Date: " + isoNow);

        // Convert Thai Buddhist date to ISO date and vice versa
        ThaiBuddhistDate thaiBuddhistNow2 = ThaiBuddhistDate.from(isoNow);
        LocalDate isoNow2 = LocalDate.from(thaiBuddhistNow);
        System.out.println("Thai Buddhist Current Date from ISO: " + thaiBuddhistNow2);
        System.out.println("ISO Current Date from Thai Buddhist: " + isoNow2);
    }
}
