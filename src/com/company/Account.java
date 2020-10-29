package com.company;

public class Account {

    String accountNumber;
    String ownerName;
    double balance;

    public Account(String accountNumber, String ownerName, double balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountnumber(String AccountNumber){
        this.accountNumber = AccountNumber;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void setOwnerName(String OwnerName){
        this.ownerName = OwnerName;
    }

    public double getbalance(){
        return balance;
    }

    public double setbalance(double balance){
        this.balance = balance;
        return balance;
    }

    public double changeBalance(double balance){
        this.balance = balance;
        return balance;
    }

    public String toString(){
        return this.ownerName + this.accountNumber + this.balance;
    }
}