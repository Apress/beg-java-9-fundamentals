// ThisTest5.java
package com.jdojo.cls;

public class ThisTest5 {
    int num = 1982; // An instance variable
     
    public static void main(String[] args) {
        ThisTest5 tt5 = new ThisTest5();
        tt5.printNum(1969);
    }
    
    void printNum(int num) {
        System.out.println("Parameter num: " + num);
        System.out.println("Instance variable num: " + num);
    }
}
