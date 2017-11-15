// CurrentLegacyDate.java
package com.jdojo.datetime;

import java.util.Date;        

public class CurrentLegacyDate {
    public static void main (String[] args) {
        // Create a new Date object
        Date currentDate = new Date();        
        System.out.println("Current date: " + currentDate);
        
        // Get the milliseconds value of the current date
        long millis = currentDate.getTime();
        System.out.println("Current datetime in millis: " + millis);        }
}
