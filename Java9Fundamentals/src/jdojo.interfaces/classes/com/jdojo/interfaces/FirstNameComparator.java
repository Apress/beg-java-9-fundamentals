// FirstNameComparator.java
package com.jdojo.interfaces;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<ComparablePerson> {
    @Override
    public int compare(ComparablePerson p1, ComparablePerson p2) {
        String firstName1 = p1.getFirstName();
        String firstName2 = p2.getFirstName();
        int diff = firstName1.compareTo(firstName2);        
        return diff;
    }
}
