package com.techelevator;

public class UserInterface {

    public void getMainMenu() {
        System.out.println("```");
        System.out.println("(1) Display Vending Machine Items");
        System.out.println("(2) Purchase");
        System.out.println("(3) Exit");
        System.out.println("```");
    }

    public void getPurchaseMenu() {
        System.out.println("```");
        System.out.println();
        System.out.println("Current balance: ");
        System.out.println("(1) Feed money");
        System.out.println("(2) Select Product");
        System.out.println("(3) Exit");
        System.out.println("```");
    }
}
