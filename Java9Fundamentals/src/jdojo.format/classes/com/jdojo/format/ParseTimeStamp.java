// ParseTimeStamp.java
package com.jdojo.format;

import java.util.Date;
import java.util.Calendar;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;

public class ParseTimeStamp {
    public static void main(String[] args) {
        String input = "2003-04-03 09:10:40.325";

        // Prepare the pattern
        String pattern = "yyyy-MM-dd HH:mm:ss.SSS";
        
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        // Parse the text into a Date object
        Date dt = sdf.parse(input, new ParsePosition(0));
        System.out.println(dt);

        // Get the Calendar instance
        Calendar cal = Calendar.getInstance();

        // Set the time
        cal.setTime(dt);

        // Print time parts
        System.out.println("Hour:" + cal.get(Calendar.HOUR));
        System.out.println("Minute:" + cal.get(Calendar.MINUTE));
        System.out.println("Second:" + cal.get(Calendar.SECOND));
        System.out.println("Millisecond:"
                + cal.get(Calendar.MILLISECOND));

    }
}
