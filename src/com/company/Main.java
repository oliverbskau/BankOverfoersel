package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    Database database = new Database();
    public String ownerName;
    public String accountNumber;
    public double balance;


    public static void main(String[] args) {
        // write your code here


        Main main = new Main();
        main.startProgram();
    }

    public void startProgram() {
        database.add("Svend", "2711", 3500);
        database.add("Bent", "2945", 2700);
        database.add("Ballonshow", "4831", 4900);

        Scanner in = new Scanner(System.in);
        System.out.println("Er du oprættet i systemet?");
        System.out.print("ja/nej: ");
        String jaNej = in.nextLine();

        switch (jaNej) {

            case "ja":
                menu(ownerName,accountNumber,balance);
                break;

            case "nej":
                System.out.print("\nIndtast fulde navn: ");
                ownerName = in.nextLine();
                System.out.print("Indtast dit ønskede account nummer: ");
                accountNumber = in.nextLine();
                Random random = new Random();
                balance = 1000 + random.nextInt(4000);
                database.add(ownerName, accountNumber, balance);
                menu(ownerName,accountNumber,balance);

                break;
        }
    }

    public void menu(String ownerName, String accountNumber, double balance) {

        System.out.println("\nMenu:");
        System.out.println("1: Indæt penge på din konto");
        System.out.println("2. Hæv penge fra din konto");
        System.out.println("3. Overfør penge til en anden konto");
        System.out.println("9. Afslut program");
        System.out.print("Indtast tal: ");


        Scanner in = new Scanner(System.in);
        int choice = 0;
        choice = in.nextInt();
        switch (choice) {

            case 1:
              database.addMoney(accountNumber);
              menu(ownerName,accountNumber,balance);
                break;
            case 2:
               database.withdrawMoney(accountNumber);
               menu(ownerName,accountNumber,balance);
                break;
            case 3:

                menu(ownerName,accountNumber,balance);
                break;
            case 9:
                System.exit(0);
        }
    }
}

