// SmartSeverity.java
package com.jdojo.enums;

public enum SmartSeverity {
    LOW(30), MEDIUM(15), HIGH(7), URGENT(1);
    
    // Declare an instance variable  
    private final int projectedTurnaroundDays;
    
    // Declare a private constructor  
    private SmartSeverity(int projectedTurnaroundDays) {
        this.projectedTurnaroundDays = projectedTurnaroundDays;
    }
    
    // Declare a public method to get the turnaround days  
    public int getProjectedTurnaroundDays() {
        return projectedTurnaroundDays;
    }
}
