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
                    item = new Gum(productName, price); // this is out of scope, we need to bring it back in scope
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

    @Override
    public String toString() {
        String print;
        for (String vendingItem : inventory.keySet()) {
            vendingItem += inventory.values();
            print = vendingItem + " \n";
            return print;
        }
        ///    \n  newline - loop thru map, for each inventory.keyset, create a string variable, string += inventory.key. get name + get price + \n
        return "Vending Machine " + "test"; // can we need to add + price and + quantity?? <key: Location, value: "productName + productPrice + quantity">
    }
}