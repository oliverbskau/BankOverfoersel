package com.company;
import java.util.ArrayList;

public class Database {

    private ArrayList<Account> database = new ArrayList<Account>();

    public void add(String ownerName, String accountNumber,double balance){
        Account account = new Account(ownerName, accountNumber, balance);
        database.add(account);
    }

    public double searchPerson(String accountNumber){
        for(Account account : database){
            if(accountNumber.compareTo(account.getAccountNumber()) == 0){
                double balance = account.getbalance();
                return balance;
            }
        }
        return 0;
    }

    public double addMoney(String accountNumber, double addamount){
        for(Account account : database){
            if(accountNumber.compareTo(account.getAccountNumber()) == 0){
                double newBalance = account.getbalance() + addamount;
                return account.changeBalance(newBalance);
            }
        }
        return 0;
    }

    public double withdrawMoney(String accountNumber, double withdraw){
        for(Account account : database){
            if(accountNumber.compareTo(account.getAccountNumber()) == 0){
                double newBalance = account.getbalance() - withdraw;
                return account.changeBalance(newBalance);
            }
        }
        return 0;
    }



}

