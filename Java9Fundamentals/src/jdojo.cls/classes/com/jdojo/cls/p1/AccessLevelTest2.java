// AccessLevelTest2.java
package com.jdojo.cls.p1;

import com.jdojo.cls.AccessLevel;

public class AccessLevelTest2 {
    public static void main(String[] args) {
        AccessLevel al = new AccessLevel();

        //int a = al.v1; /* A compile-time error */
        //int b = al.v2; /* A compile-time error */
        //int c = al.v3; /* A compile-time error */
        int d = al.v4;

        System.out.println("d = " + d);

        //al.m1(); /* A compile-time error */
        //al.m2(); /* A compile-time error */
        //al.m3(); /* A compile-time error */
        al.m4();

        /* Modify the values of instance variables */
        //al.v2 = 20;  /* A compile-time error */
        //al.v3 = 30;  /* A compile-time error */
        al.v4 = 40;

        System.out.println("After modifying v4...");
        //al.m2();  /* A compile-time error */
        //al.m3();  /* A compile-time error */
        al.m4();
    }
}
