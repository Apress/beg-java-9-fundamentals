// AccountTest.java
package com.jdojo.cls;

public class AccountTest {
    public static void main(String[] args) {
        Account ac = new Account();
        double balance = ac.getBalance();
        System.out.println("Balance = " + balance);
        
        // Credit and debit some amount
        ac.credit(234.78);
        ac.debit(100.12);
        
        balance = ac.getBalance();
        System.out.println("Balance = " + balance);
        
        // Attempt to credit and debit invalid amounts
        ac.credit(-234.90);
        ac.debit(Double.POSITIVE_INFINITY);

        balance = ac.getBalance();
        System.out.println("Balance = " + balance);

        // Attempt to debit more than the balance
        ac.debit(2000.00);
        
        balance = ac.getBalance();
        System.out.println("Balance = " + balance);
    }
}
