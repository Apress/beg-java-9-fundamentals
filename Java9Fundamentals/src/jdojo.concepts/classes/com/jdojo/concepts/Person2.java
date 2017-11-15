// Person2.java
package com.jdojo.concepts;

public class Person2 {
    public String name;   // Not hidden from its users 	
    public String gender; // Not hidden from its users 

    public Person2(String initialName, String initialGender) {
        name = initialName;
        gender = initialGender;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getGender() {
        return gender;
    }
}
