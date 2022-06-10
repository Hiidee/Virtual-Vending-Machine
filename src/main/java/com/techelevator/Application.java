package com.techelevator;

import java.util.Scanner;

// This is Vending Machine
public class Application {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface();
        ui.start(); // display main menu
        /*
        VendingMachine vendingMachine = new VendingMachine(); // the quantity of every item should reset to 5

        String menuChoice = scanner.nextLine();
        int menuChoiceNumber = Integer.parseInt(menuChoice);

          moved all the following to the UserInterface class.
        if (menuChoiceNumber == 0 || menuChoiceNumber > 4) {
            System.out.println("Please enter 1, 2, or 3");
            userInterface.getMainMenu();
        } else if (menuChoiceNumber == 1) {
            System.out.println(vendingMachine.toString()); // can we add price and quantity to this method? (Lives in VendingMachine)
        } else if (menuChoiceNumber == 2) {
            userInterface.getPurchaseMenu();
        } else if (menuChoiceNumber == 3) {
        } else if (menuChoiceNumber == 4) {
        }
         */
        /*
        do {
            if (menuChoiceNumber == 1) {
            } else if (menuChoiceNumber == 2) {
            } else if (menuChoiceNumber == 3) {
            } else if (menuChoiceNumber == 4) {
            } else {
                System.out.println("Please enter 1, 2, or 3");
                userInterface.getMainMenu();
            }
        } while (menuChoiceNumber == 0 || menuChoiceNumber > 4);
         */
    }
}