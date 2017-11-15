// EarlyBindingTest.java
package com.jdojo.inheritance;

public class EarlyBindingTest {
    public static void main(String[] args) {
        EarlyBindingSuper ebSuper = new EarlyBindingSuper();
        EarlyBindingSub ebSub = new EarlyBindingSub();

        // Will access EarlyBindingSuper.str 
        System.out.println(ebSuper.str);

        // Will access EarlyBindingSuper.count 
        System.out.println(ebSuper.count);

        // Will access EarlyBindingSuper.print() 
        ebSuper.print();

        System.out.println("------------------------------");

        // Will access EarlyBindingSub.str 
        System.out.println(ebSub.str);

        // Will access EarlyBindingSub.count 
        System.out.println(ebSub.count);

        // Will access EarlyBindingSub.print() 
        ebSub.print();

        System.out.println("------------------------------");

        // Will access EarlyBindingSuper.str 
        System.out.println(((EarlyBindingSuper) ebSub).str);

        // Will access EarlyBindingSuper.count 
        System.out.println(((EarlyBindingSuper) ebSub).count);

        // Will access EarlyBindingSuper.print() 
        ((EarlyBindingSuper) ebSub).print();

        System.out.println("------------------------------");

        // Assign the ebSub to ebSuper 
        ebSuper = ebSub; // Upcasting 

        /* Now access methods and fields using ebSuper variable, which is 
           referring to a EarlyBindingSub object 
         */
        // Will access EarlyBindingSuper.str 
        System.out.println(ebSuper.str);

        // Will access EarlyBindingSuper.count 
        System.out.println(ebSuper.count);

        // Will access EarlyBindingSuper.print() 
        ebSuper.print();
        System.out.println("------------------------------");
    }
}
