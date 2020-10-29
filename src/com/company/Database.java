package com.company;
import java.util.ArrayList;
import java.util.Scanner;

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

    public double addMoney(String accountNumber, double addAmount){
        for(Account account : database){
            if(accountNumber.compareTo(account.getAccountNumber()) == 0){
                Scanner in = new Scanner(System.in);
                System.out.print("Indtast beløb: ");
                addAmount = in.nextInt();
                double newBalance = account.getbalance() + addAmount;
                return account.changeBalance(newBalance);
            }
            System.out.println("Din nye balance er: " + account.getbalance());
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

