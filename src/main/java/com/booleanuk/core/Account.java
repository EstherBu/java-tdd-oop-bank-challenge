package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private String accountNumber;
    private double balance;

    private String accountType;

    private List<Transaction> transactionHistory;

    public Account(String accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.transactionHistory = new ArrayList<>();
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean depositAmount(double deposit) {
        if (deposit >= 0.00) {
            double newBalance = this.getBalance() + deposit;
            this.setBalance(newBalance);
            return true;
        } else {
            return false;
        }
    }

    public boolean withdrawAmount(double withdraw) {
        if (withdraw >= 0.00) {
            double newBalance = this.getBalance() - withdraw;
            this.setBalance(newBalance);
            return true;
        } else {
            return false;
        }
    }

    public boolean addToTransactionHistory(Transaction transaction) {
        transactionHistory.add(transaction);
        return true;
    }

    public List<Transaction> getTransactionHistory() {
        System.out.println("transaction history retrieved" + transactionHistory);
        return transactionHistory;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }
}

