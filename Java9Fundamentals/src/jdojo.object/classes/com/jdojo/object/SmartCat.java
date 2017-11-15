// SmartCat.java
package com.jdojo.object;

public class SmartCat {
    private String name;

    public SmartCat(String name) {
        this.name = name;
    }

    /* Reimplement the equals() method */
    @Override
    public boolean equals(Object otherObject) {
        // Are they the same?
        if (this == otherObject) {
            return true;
        }

        // Is otherObject a null reference? 
        if (otherObject == null) {
            return false;
        }

        // Do they belong to the same class?
        if (this.getClass() != otherObject.getClass()) {
            return false;
        }

        // Get the reference of otherObject is a SmartCat variable
        SmartCat otherCat = (SmartCat)otherObject;

        // Do they have the same names
        boolean isSameName = (this.name == null? otherCat.name == null
                           :this.name.equals(otherCat.name) ); 

        return isSameName;
    }

    /* Reimplement the hashCode() method, which is a requirement 
       when you reimplement equals() method
    */
    @Override
    public int hashCode() {
        return (this.name == null? 0 : this.name.hashCode());
    }
}
