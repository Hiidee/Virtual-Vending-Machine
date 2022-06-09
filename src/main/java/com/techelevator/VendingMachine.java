package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class VendingMachine {
    private final String FILE_NAME = "vendingmachine.csv";

    // Vending machine has an inventory
    private Map<String, String> inventory;

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
                // if productType = chips, Chips chippy = new Chip(productName, price); => repeat for ea productType, this pushes all that stuff to the proper subclass
                // then we need to move each new item into the inventory (aka Vending Machine) <==== goes in a list, organized by productName - list says "Toblerone (4!), Snickers (3!)


                VendingMachineItem item = new Gum(productName, price); // make one of these for each treat type

                inventory.put(locationKey, productName);    // this loads the map
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("PROBLEM");
        }
    }

    @Override
    public String toString() {
        return "Vending Machine " + inventory;
    }
}