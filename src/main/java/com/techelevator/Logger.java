package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    static String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy h:mm:ss a"));
/*
        File destinationFile = new File("log.txt"); // may need to put in entire path

        if (destinationFile.isFile()) {  // if the destination file is invalid (b/c is set at false)
            System.out.println("Sorry, this destination is invalid."); // print out dude it's invalid
            System.exit(0); // exit


        try (PrintWriter writer = new PrintWriter(destinationFile)) { // write to output file
*/

    public Logger() {
        try {
            File writeToHere = new File("log.txt");
            writeToHere.createNewFile();
        } catch (Exception e) {
            System.out.println("exception caught");
        }
    }
        public void addToLogFeedMoney(MathOperations math) {
            File destinationFile = new File("log.txt"); // may need to put in entire path

            if (!destinationFile.isFile()) {  // if the destination file is invalid (b/c is set at false)
                System.out.println("Sorry, this destination is invalid."); // print out it's invalid
            } else {
                // fileWriter append = new fileWriter(new fileWriter(destinationfile, true))
                try (PrintWriter append = new PrintWriter(new FileWriter(destinationFile, true))) {
                    append.println(dateTime + " FEED MONEY: $" + math.getBalance() + " $" + math.getBalance());
                } catch (Exception e) {
                    System.out.println("CAUGHT YA");
                }
            }
        }
        public void addToLogItemPurchase(String locationKey, VendingMachineItem item, MathOperations math) {
            File destinationFile = new File("log.txt"); // may need to put in entire path

            if (!destinationFile.isFile()) {
                System.out.println("Sorry, this destination is invalid.");
            } else {
                try (PrintWriter append = new PrintWriter(new FileWriter(destinationFile, true))) {
                    append.println(dateTime + " " + item.getProductName() + " " + locationKey + " $" + item.getPrice() + " $" + math.getBalance());
                } catch (Exception e) {
                    System.out.println("caught exception");
                }
            }
        }
        public void addToLogGiveChange(MathOperations math) {
            File destinationFile = new File("log.txt"); // may need to put in entire path

            if (!destinationFile.isFile()) {
                System.out.println("Sorry, this destination is invalid.");
            } else {
                try (PrintWriter append = new PrintWriter(new FileWriter(destinationFile, true))) {
                    append.println(dateTime + " GIVE CHANGE: $" + math.getBalance() + " $" + math.getChange(math.getBalance()));
                } catch (Exception e) {
                    System.out.println("caught exception");
                }
            }
        }
    }
/*
    public void activityTextToLog() {
        String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy h:mm:ss a"));
        // NOT USING IFS. 3 Different methods to call when its either log.txt or sales report etc.
        // if money is deposited, writer.println(dateTime + " FEED MONEY: $" + moneyIn + " $" + newBalance);
        // if money is spent, writer.println(dateTime + " " + productName + " " + productLocation + " $" + price + " $" + newBalance);
        // if change is given, writer.println(dateTime + " GIVE CHANGE: $" + changeReturned + " $" + newBalance);
    }

 */
