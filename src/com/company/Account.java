package com.company;

public class Account {

    String accountNumber;
    String ownerName;
    double balance;

    public Account(String accountNumber, String ownerName){
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(String accountNumber) {
        return accountNumber;
    }

    public void setAccountnumber(String newaccountNumber){
        this.accountNumber = newaccountNumber;
    }
}
