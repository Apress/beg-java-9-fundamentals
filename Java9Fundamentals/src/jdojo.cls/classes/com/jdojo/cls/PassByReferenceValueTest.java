// PassByReferenceValueTest.java
package com.jdojo.cls;

public class PassByReferenceValueTest {
    public static void main(String[] args) {
        // Create a Car object and assign its reference to myCar
        Car myCar = new Car();

        // Change model, year and price of Car object using myCar
        myCar.model = "Civic LX";
        myCar.year = 1999;
        myCar.price = 16000.0;

        System.out.println("#1: model = " + myCar.model
                + ", year = " + myCar.year
                + ", price = " + myCar.price);

        PassByReferenceValueTest.test(myCar);

        System.out.println("#4: model = " + myCar.model
                + ", year = " + myCar.year
                + ", price = " + myCar.price);
    }

    public static void test(Car xyCar) {
        System.out.println("#2: model = " + xyCar.model
                + ", year = " + xyCar.year
                + ", price = " + xyCar.price);

        // Let’s make xyCar refer to a new Car object
        xyCar = new Car();

        System.out.println("#3: model = " + xyCar.model
                + ", year = " + xyCar.year
                + ", price = " + xyCar.price);
    }
}
