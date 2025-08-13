package com.example.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John", 10000.0);

        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: ₹" + account.getBalance());

        account.deposit(5000);
        System.out.println("Balance after deposit: ₹" + account.getBalance());

        account.withdraw(300);
        System.out.println("Balance after withdrawal: ₹" + account.getBalance());
    }
}