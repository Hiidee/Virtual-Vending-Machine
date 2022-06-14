package com.techelevator;

import java.io.File;
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

        public static void addToLogFeedMoney() {
            File destinationFile = new File("log.txt"); // may need to put in entire path

            if (destinationFile.isFile()) {  // if the destination file is invalid (b/c is set at false)
                System.out.println("Sorry, this destination is invalid."); // print out it's invalid
                System.exit(0); // exit

                try (PrintWriter writer = new PrintWriter(destinationFile)) {
                    writer.println(dateTime + " FEED MONEY: $" + mathOperations.moneyIn + " $" + balance);

                } catch (Exception e) {
                    System.exit(0);
                }
            }
        }
        public static void addToLogGiveChange() {
            File destinationFile = new File("log.txt"); // may need to put in entire path

            if (destinationFile.isFile()) {
                System.out.println("Sorry, this destination is invalid.");
                System.exit(0);

                try (PrintWriter writer = new PrintWriter(destinationFile)) {
                    writer.println(dateTime + " " + productName + " " + productLocation + " $" + price + " $" + balance);

                } catch (Exception e) {
                    System.exit(0);
                }
            }
        }
        public static void addToLogItemPurchase() {
            File destinationFile = new File("log.txt"); // may need to put in entire path

            if (destinationFile.isFile()) {
                System.out.println("Sorry, this destination is invalid.");
                System.exit(0); // exit

                try (PrintWriter writer = new PrintWriter(destinationFile)) {
                    writer.println(dateTime + " GIVE CHANGE: $" + get.changeReturned + " $" + get.balance);

                } catch (Exception e) {
                    System.exit(0);
                }
            }
        }
    }



