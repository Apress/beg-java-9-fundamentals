// SuperSmartSeverityTest.java
package com.jdojo.enums;

public class SuperSmartSeverityTest {
    public static void main(String[] args) {
        for (SuperSmartSeverity s : SuperSmartSeverity.values()) {
            String name = s.name();
            String desc = s.toString();
            int ordinal = s.ordinal();
            int projectedTurnaroundDays = s.getProjectedTurnaroundDays();
            double projectedCost = s.getProjectedCost();
            System.out.println("name=" + name
                    + ", description=" + desc
                    + ", ordinal=" + ordinal
                    + ", turnaround days="
                    + projectedTurnaroundDays
                    + ", projected cost=" + projectedCost);
        }
    }
}
