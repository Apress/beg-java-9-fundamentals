// SuperSmartSeverity.java
package com.jdojo.enums;

public enum SuperSmartSeverity {
    LOW("Low Priority", 30) {
        @Override
        public double getProjectedCost() {
            return 1000.0;
        }
    },
    MEDIUM("Medium Priority", 15) {
        @Override
        public double getProjectedCost() {
            return 2000.0;
        }
    },
    HIGH("High Priority", 7) {
        @Override
        public double getProjectedCost() {
            return 3000.0;
        }
    },
    URGENT("Urgent Priority", 1) {
        @Override
        public double getProjectedCost() {
            return 5000.0;
        }
    };

    // Declare instance variables  
    private final String description;
    private final int projectedTurnaroundDays;

    // Declare a private constructor  
    private SuperSmartSeverity(String description,
            int projectedTurnaroundDays) {
        this.description = description;
        this.projectedTurnaroundDays = projectedTurnaroundDays;
    }

    // Declare a public method to get the turn around days  
    public int getProjectedTurnaroundDays() {
        return projectedTurnaroundDays;
    }

    // Override the toString() method in the Enum class to return description  
    @Override
    public String toString() {
        return this.description;
    }

    // Provide getProjectedCost() abstract method, so all constants 
    // override and provide implementation for it in their body  
    public abstract double getProjectedCost();
}
