package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class VendingMachine {
    private final String FILE_NAME = "vendingmachine.csv";

    // Vending machine has an inventory
    private Map<String, Object> inventory; // we can store a location with an entire object

    public VendingMachine() {
        inventory = new HashMap<>();
        fillVendingMachine();
    }

    private void fillVendingMachine() {
        File sourceFile = new File(FILE_NAME);
        try (Scanner fileReader = new Scanner(sourceFile)) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] words = line.split("\\|");

                String locationKey = words[0];
                String productName = words[1];
                String productPrice = words[2];
                double price = Double.parseDouble(productPrice);
                String productType = words[3]; // we need to figure out how to use this piece of info to sort the items into their proper subclasses
                VendingMachineItem item = null;
                // the following pushes all the items to their proper subclass
                if (productType.equals("Chip")) {
                    item = new Chip(productName, price);
                }
                if (productType.equals("Candy")) {
                    item = new Candy(productName, price);
                }
                if (productType.equals("Drink")) {
                    item = new Drink(productName, price);
                }
                if (productType.equals("Gum")) {
                    item = new Gum(productName, price);
                }
                /*
                // then we need to move each new item into the inventory (aka Vending Machine) <==== goes in a list, organized by productName - list says "Toblerone (4!), Snickers (3!)
                //make one of these for each treat type
                //VendingMachineItem item = new Gum(productName, price);
                 */
                inventory.put(locationKey, item);    // this loads the map
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("YOU BROKE THE MACHINE");
        }
    }

    public VendingMachineItem purchaseItem(String pickLocation) { // input is locationKey, that pulls map at the location and gives the object
        System.out.println("test");
        if (inventory.containsKey(pickLocation)) {
            inventory.g(pickLocation);
//            if ()
//        } else {
//            System.out.println("Invalid location");
//        }
//            int quantity = 5;
//        if (quantity == 0) {    // if map.contains(locationKey)
//            System.out.println("SOLD OUT"); // quantity check and if > 0  && balance > price then quantity-- and new balance = balance - price
//            return quantity;                // else if (quantity = 0) return out of stock and pull menu again
//        }                                   // else if (balance < price) return balance not enough and return the menu again
//        if (quantity > 0) {
//            quantity = quantity - 1;
//            return quantity;
//
//        }
        return ;
    }

    @Override
    public String toString() {
        String print = "";
        for (String vendingItem : inventory.keySet()) {
            // vendingItem += inventory.values();
            print += vendingItem + ": " + inventory.get(vendingItem) + " \n";
        }
        ///    \n  newline - loop thru map, for each inventory.keyset, create a string variable, string += inventory.key. get name + get price + \n
        return print; // can we need to add + price and + quantity?? <key: Location, value: "productName + productPrice + quantity">
    }
}