// ThisTest6.java
package com.jdojo.cls;

public class ThisTest6 {
    int num = 1982; // An instance variable

    public static void main(String[] args) {
        ThisTest6 tt6 = new ThisTest6();
        tt6.printNum(1969);
    }

    void printNum(int num) {
        System.out.println("Parameter num: " + num);
        System.out.println("Instance variable num: " + this.num);
    }
}
