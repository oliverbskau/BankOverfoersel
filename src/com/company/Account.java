package com.company;

public class Account {

    public static String setOwnerName;
    String accountNumber;
    String ownerName;
    double balance;

    public Account(String accountNumber, String ownerName, double balance){
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountnumber(String newAccountNumber){
        this.accountNumber = newAccountNumber;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void setOwnerName(String newOwnerName){
        this.ownerName = newOwnerName;
    }

    public double getbalance(){
        return balance;
    }

    public void setbalance(double newbalance){
        this.balance = newbalance;
    }
}
