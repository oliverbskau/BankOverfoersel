package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {

    private ArrayList<Account> database = new ArrayList<Account>();
    private double addAmount;
    private double withdraw;

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

    public double addMoney(String accountNumber){
        for(Account account : database){
            if(accountNumber.compareTo(account.getAccountNumber()) == 0){
                Scanner in = new Scanner(System.in);
                System.out.print("Indtast beløb: ");
                addAmount = in.nextDouble();
                double newBalance = account.getbalance() + addAmount;
                return account.changeBalance(newBalance);
            }
        }
        return 0;
    }

    public double withdrawMoney(String accountNumber){
        for(Account account : database){
            if(accountNumber.compareTo(account.getAccountNumber()) == 0){
                Scanner in = new Scanner(System.in);
                System.out.println("Hæv beløb: ");
                withdraw = in.nextDouble();
                double newBalance = account.getbalance() - withdraw;
                return account.changeBalance(newBalance);
            }
        }
        return 0;
    }


}

