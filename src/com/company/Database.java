package com.company;
import java.util.ArrayList;

public class Database {

    private ArrayList<Account> database = new ArrayList<Account>();

    public void add(String ownerName, String accountNumber, int balance){
        Account account = new Account(ownerName, accountNumber, balance);
        database.add(account);
    }
}
