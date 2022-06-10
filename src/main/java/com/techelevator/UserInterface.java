package com.techelevator;

import com.sun.security.jgss.GSSUtil;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
//    UserInterface ui = new UserInterface();
    VendingMachine vendingMachine = new VendingMachine();

    // maybe get start look at review day for example of mostly class work and calling the ui.start method
    public void start() {
        int menuChoiceNumber = 0;
        do {
            System.out.println("```");
            System.out.println("(1) Display Vending Machine Items");
            System.out.println("(2) Purchase");
            System.out.println("(3) Exit");
            System.out.println("```");

            String menuChoice = scanner.nextLine();
            menuChoiceNumber = Integer.parseInt(menuChoice);// put a try catch here in case someoen enters a character

           if (menuChoiceNumber == 1) {
                System.out.println(vendingMachine); // can we add price and quantity to this method? (Lives in VendingMachine)
            } else if (menuChoiceNumber == 2) {
                getPurchaseMenu();
            } else if (menuChoiceNumber == 3) {
                System.out.println("Adios");
                System.exit(0);
            } else if (menuChoiceNumber == 4) {
                System.out.println("Feed me a stray cat");
            }
        }while(menuChoiceNumber <= 0 || menuChoiceNumber > 4);
    }

    private void getPurchaseMenu() {
        System.out.println("```");
        System.out.println("Current balance: ");
        System.out.println("(1) Feed money");
        // if user chooses (1),
        // do a try / catch in case user enters 0 or a letter or nothing.
        // (A) System.out.println("You didn't add any money!" OR
        // feedMoney() & (A) System.out.println("Your balance is now: $" + newBalance); (B) write appropriate moneyDepositedTextToLog
        System.out.println("(2) Select Product");
        // if user chooses (2),
        // System.out.println(productLocation + " " + productName + " $" + price); => Probably will need a loop. Also is there any way to get this to print on different lines?
        //if user enters a code that doesn't exist, (A) System.out.println("Sorry, that item doesn't exist."), (B) return to Purchase menu
        //if user asks for an item that is sold out (quantity == 0 || userInput > quantity), (A) System.out.println("Sorry, that item is sold out."), (B) return to Purchase menu
        //if userInput < quantity,
        // (A) updateQuantity(),
        // (B) write appropriate activityTextToLog
        // another IF scenario for (C) System.out.println(DISPENSE RESPONSE);
        // (D) return to Purchase menu;
        System.out.println("(3) Finish Transaction");
        // (A) receivesChange(), balance = 0
        // (B) Return to Main Menu,
        // (C) write appropriate moneyDepositedTextToLog
        System.out.println("```");
    }
}
/*
    public void dispenseResponse() { //This may need to go somewhere else. Like if there's a get.Chip() it could be part of that.
        // String chipPhrase = "Crunch Crunch, Yum!"
        // String drinkPhrase = "Glug Glug, Yum!"
        // String candyPhrase = "Munch Munch, Yum!"
        // String gumPhrase = "Chew Chew, Yum!"
        // this approach would require a for loop
        // if (productType.equals("Chip"));
        //System.out.println("Enjoy your " + productName + ". It cost: " + price + ". Your remaining balance is: " + newBalance + ". " + chipPhrase);
        // if (productType.equals("Gum"));
        //System.out.println("Enjoy your " + productName + ". It cost: " + price + ". Your remaining balance is: " + newBalance + ". " + gumPhrase);
        // if (productType.equals("Drink"));
        //System.out.println("Enjoy your " + productName + ". It cost: " + price + ". Your remaining balance is: " + newBalance + ". " + drinkPhrase);
        // if (productType.equals("Candy"));
        //System.out.println("Enjoy your " + productName + ". It cost: " + price + ". Your remaining balance is: " + newBalance + ". " + candyPhrase);
    }

    public void activityTextToLog() {
        String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy h:mm:ss a"));
        // if money is deposited, writer.println(dateTime + " FEED MONEY: $" + moneyIn + " $" + newBalance);
        // if money is spent, writer.println(dateTime + " " + productName + " " + productLocation + " $" + price + " $" + newBalance);
        // if change is given, writer.println(dateTime + " GIVE CHANGE: $" + changeReturned + " $" + newBalance);
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
 */