package com.example.encapsulation;

class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String name, double initialBalance) {
        this.accountHolderName = name;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance can't be negative. Set to 0.");
        }
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Public setter
    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Deposit amount must be positive.");
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Invalid withdraw amount.");
    }
}

