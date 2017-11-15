// QueryTest.java
package com.jdojo.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;

public class QueryTest {
    public static void main(String[] args) {
        // Get references of the precision and local date queries
        TemporalQuery<TemporalUnit> precisionQuery = TemporalQueries.precision();
        TemporalQuery<LocalDate> localDateQuery = TemporalQueries.localDate();

        // Query a LocalDate
        LocalDate ld = LocalDate.now();
        TemporalUnit precision = ld.query(precisionQuery);
        LocalDate queryDate = ld.query(localDateQuery);
        System.out.println("Precision of LocalDate: " + precision);
        System.out.println("LocalDate of LocalDate: " + queryDate);

        // Query a LocalTime
        LocalTime lt = LocalTime.now();
        precision = lt.query(precisionQuery);
        queryDate = lt.query(localDateQuery);
        System.out.println("Precision of LocalTime: " + precision);
        System.out.println("LocalDate of LocalTime: " + queryDate);

        // Query a ZonedDateTime
        ZonedDateTime zdt = ZonedDateTime.now();
        precision = zdt.query(precisionQuery);
        queryDate = zdt.query(localDateQuery);
        System.out.println("Precision of ZonedDateTime: " + precision);
        System.out.println("LocalDate of ZonedDateTime: " + queryDate);
    }
}
