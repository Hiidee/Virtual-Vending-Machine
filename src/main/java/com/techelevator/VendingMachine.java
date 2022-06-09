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
                String productType = words[3];

                List<String> productNames = new ArrayList<>() {words[0]};

                VendingMachineItem item = new VendingMachineItem(productName, price, productType);

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