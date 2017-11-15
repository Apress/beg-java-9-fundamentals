// OverloadingTest.java
package com.jdojo.inheritance;

public class OverloadingTest {
    public static void main(String[] args) {
        OverloadingTest ot = new OverloadingTest();

        int i = 10;
        int j = 15;
        double d1 = 10.4;
        double d2 = 2.5;
        float f1 = 2.3F;
        float f2 = 4.5F;
        short s1 = 2;
        short s2 = 6;

        ot.add(i, j);
        ot.add(d1, j);
        ot.add(i, s1);
        ot.add(s1, s2);
        ot.add(f1, f2);
        ot.add(f1, s2);

        Employee emp = new Employee();
        Manager mgr = new Manager();
        ot.test(emp);
        ot.test(mgr);

        emp = mgr;
        ot.test(emp);
    }

    public double add(int a, int b) {
        System.out.println("Inside add(int a, int b)");
        double s = a + b;
        return s;
    }

    public double add(double a, double b) {
        System.out.println("Inside add(double a, double b)");
        double s = a + b;
        return s;
    }

    public void test(Employee e) {
        System.out.println("Inside test(Employee e)");
    }

    public void test(Manager e) {
        System.out.println("Inside test(Manager m)");
    }
}
