package com.techelevator;

import java.util.Scanner;

// This is Vending Machine
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface = new UserInterface();
        userInterface.getMainMenu();

        VendingMachine vendingMachine = new VendingMachine();

        String menuChoice = scanner.nextLine();
        int menuChoiceNumber = Integer.parseInt(menuChoice);

        if (menuChoiceNumber == 0 || menuChoiceNumber > 4) {
            System.out.println("Please enter 1, 2, or 3");
            userInterface.getMainMenu();
        } else if (menuChoiceNumber == 1) {
            System.out.println(vendingMachine.toString());
        } else if (menuChoiceNumber == 2) {
        } else if (menuChoiceNumber == 3) {
        } else if (menuChoiceNumber == 4) {
        }

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