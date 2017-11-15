// Account.java
package com.jdojo.cls;

public class Account {
    private double balance;

    public double getBalance() {
        // Return the balance of this account
        return this.balance;
    }

    public int credit(double amount) {
        // Make sure credit amount is not negative, NaN or infinity
        if (amount < 0.0 || Double.isNaN(amount) || Double.isInfinite(amount)) {
            System.out.println("Invalid credit amount: " + amount);
            return -1;
        }

        // Credit the amount
        System.out.println("Crediting amount: " + amount);
        this.balance = this.balance + amount;
        return 1;
    }

    public int debit(double amount) {
        // Make sure the debit amount is not negative, NaN or infinity */
        if (amount < 0.0 || Double.isNaN(amount) || Double.isInfinite(amount)) {
             System.out.println("Invalid debit amount: " + amount);
            return -1;
        }

        // Make sure a minimum balance of zero is maintained
        if (this.balance < amount) {
            System.out.println("Insufficient funds. Debit attempted: " + amount);
            return -1;
        }

        // Debit the amount
        System.out.println("Debiting amount: " + amount);
        this.balance = this.balance - amount;
        return 1;
    }
}
