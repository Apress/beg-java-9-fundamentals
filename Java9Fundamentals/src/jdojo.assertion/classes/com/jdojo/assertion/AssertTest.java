// AssertTest.java
package com.jdojo.assertion;

public class AssertTest {
    public static void main(String[] args) {
        int x = 10 + 15;
        assert x == 100 :  "x = " + x; // should throw an AssertionError
    }
}
