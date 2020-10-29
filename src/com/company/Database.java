package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {


    private ArrayList<Account> database = new ArrayList<Account>();
    private double addAmount;
    private double withdraw;
    Scanner in = new Scanner(System.in);

    public void add(String accountNumber, String ownerName,double balance){
        Account account = new Account(ownerName, accountNumber, balance);
        database.add(account);
    }

    public double searchPerson(String accountNumber){
        for(Account account : database){
            if(accountNumber.compareTo(account.getAccountNumber()) == 0){
                double mainbalance = account.getbalance();
                return mainbalance;
            }
        }
        return 0;
    }

    public double addMoney(String accountNumber) {
        System.out.println("Saldo: " + searchPerson(accountNumber));
        System.out.print("Indtast beløb: ");
        addAmount = in.nextDouble();
        for (Account account : database) {
            if (accountNumber.compareTo(account.getAccountNumber()) == 0) {
                double newBalance = account.getbalance() + addAmount;
                return account.setbalance(newBalance);
            }
        } return 0;
    }
    public double withdrawMoney(String accountNumber){
        System.out.println("Saldo: " + searchPerson(accountNumber));
        System.out.println("Hæv beløb: ");
        withdraw = in.nextDouble();
        for(Account account : database){
            if(accountNumber.compareTo(account.getAccountNumber()) == 0){
                double newBalance = account.getbalance() - withdraw;
                return newBalance;
            }
        }
        return 0;
    }

    public void printAll() {
        for (Account account : database) {
            System.out.println(database.toString());
        }
    }

}

