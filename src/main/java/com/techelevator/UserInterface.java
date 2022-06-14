package com.techelevator;

import com.sun.security.jgss.GSSUtil;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    VendingMachine vendingMachine = new VendingMachine();
    MathOperations math = new MathOperations();

    public void start() {
        int menuChoiceNumber = 0;
        do {
            System.out.println("(1) Display Vending Machine Items");
            System.out.println("(2) Purchase");
            System.out.println("(3) Exit");

            try {
                String menuChoice = scanner.nextLine();
                menuChoiceNumber = Integer.parseInt(menuChoice);// put a try catch here in case someone enters a character
            } catch (Exception e) {
                System.out.println("You broke the machine");
                menuChoiceNumber = -1;
            }

           if (menuChoiceNumber == 1) {
                System.out.println(vendingMachine); // this also needs to show stock
                menuChoiceNumber = 0;
            } else if (menuChoiceNumber == 2) {
                getPurchaseMenu();
            } else if (menuChoiceNumber == 3) {
                System.out.println("Good Bye");
                System.exit(0);
            } else if (menuChoiceNumber == 4) {
                System.out.println("Feed me a stray cat");
            }
        }while(menuChoiceNumber <= 0 || menuChoiceNumber > 4);
    }

    private void getPurchaseMenu() {
        int menuChoiceNumber = 0;
        do {
            System.out.println("Current balance: $" + math.getBalance());
            System.out.println("(1) Feed money");
            /*
            if user chooses (1),
            do a try / catch in case user enters 0 or a letter or nothing.
            (A) System.out.println("You didn't add any money!" OR
            feedMoney() & (A) System.out.println("Your balance is now: $" + newBalance); (B) write appropriate moneyDepositedTextToLog

             */
            System.out.println("(2) Select Product");
            /*
            if user chooses (2),
            System.out.println(productLocation + " " + productName + " $" + price); => Probably will need a loop. Also is there any way to get this to print on different lines?
            if user enters a code that doesn't exist, (A) System.out.println("Sorry, that item doesn't exist."), (B) return to Purchase menu
            if user asks for an item that is sold out (quantity == 0 || userInput > quantity), (A) System.out.println("Sorry, that item is sold out."), (B) return to Purchase menu
            if userInput < quantity,
            (A) updateQuantity(),
            (B) write appropriate activityTextToLog
            another IF scenario for (C) System.out.println(DISPENSE RESPONSE);
            (D) return to Purchase menu;
            */
            System.out.println("(3) Finish Transaction");
            /*
            (A) receivesChange(), balance = 0
            (B) Return to Main Menu,
            (C) write appropriate moneyDepositedTextToLog
            */

            try {
                String menuChoice = scanner.nextLine();
                menuChoiceNumber = Integer.parseInt(menuChoice);// put a try catch here in case someone enters a character
            } catch (Exception e) {
                System.out.println("You broke the machine");
                menuChoiceNumber = -1;
            }
            if (menuChoiceNumber == 1) {
                System.out.println("Enter the amount of money you want to put in (positive whole numbers)");
                try {
                    String inputMoney = scanner.nextLine();
                    int moneyIn = Integer.parseInt(inputMoney);
                    math.feedMoney(moneyIn);
                    // log add method call
                    menuChoiceNumber = 0;
                } catch (Exception e) {
                    System.out.println("Enter a positive whole number value!");
                    menuChoiceNumber = 0;
                }
            } else if (menuChoiceNumber == 2) {
                System.out.println(vendingMachine);
                System.out.println("Choose item");
                String pickLocation = scanner.nextLine();
//                vendingMachine.purchaseItem(pickLocation);

            } else if (menuChoiceNumber == 3) {
                System.out.println("Calculating Change");
                math.getChange(math.getBalance()); // maybe
                System.out.println("New balance: " + math.getBalance());
                start();
                // logger(addToLogChange)
            }
        } while (menuChoiceNumber <= 0 || menuChoiceNumber > 3);
    }
}
/*

    // potentially getUserInput() Method that takes input from keyboard for 1,2,3 then would call the menu based on input
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
 */