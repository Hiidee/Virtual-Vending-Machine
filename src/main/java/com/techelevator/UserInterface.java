package com.techelevator;

public class UserInterface {

    // maybe get start look at review day for example of mostly class work and calling the ui.start method
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

    // potentially getUserInput() Method that takes input from keyboard for 1,2,3 then wiould call the menu based on input
    // else it would return the error and message
    //        String menuChoice = scanner.nextLine();
    //        int menuChoiceNumber = Integer.parseInt(menuChoice);
    //
    //        if (menuChoiceNumber == 0 || menuChoiceNumber > 4) {
    //            System.out.println("Please enter 1, 2, or 3");
    //            userInterface.getMainMenu();
    //        } else if (menuChoiceNumber == 1) {
    //            System.out.println(vendingMachine.toString());
    //        } else if (menuChoiceNumber == 2) {
    //        } else if (menuChoiceNumber == 3) {
    //        } else if (menuChoiceNumber == 4) {
    //        }
    // possible content of the method
}
