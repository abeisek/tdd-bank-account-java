package org.xpdojo.bank;

public class Account {
    public int getBalance() {
        return balance;
    }

    private int balance;

    public void deposit(int amount) {
        balance = balance+amount;
    }
}
