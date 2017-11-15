// ThisTest4.java
package com.jdojo.cls;

public class ThisTest4 {    
    int num = 1982; // An instance variable
    
    public static void main(String[] args) {
        ThisTest4 tt4 = new ThisTest4();
        tt4.printNum();
    }

    void printNum() {
        System.out.println("Instance variable num: " + num);
    }
}
