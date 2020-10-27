package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);
        int choice = 0;
        System.out.println("Er du oprættet i systemet?");
        System.out.print("ja/nej:");
        String jaNej = in.nextLine();

        switch(jaNej){

            case "ja":
                menu();
                break;

            case "nej":
                System.out.print("\nIndtast fulde navn: ");
                Account.setOwnerName() = in.nextLine();
                break;


        }

    }

    public static void menu(){

        System.out.println("Menu:");
        System.out.println("1: Indæt penge på din konto");
        System.out.println("2. Hæv penge fra din konto");
        System.out.println("3. Overfør penge til en anden konto");

    }

}
