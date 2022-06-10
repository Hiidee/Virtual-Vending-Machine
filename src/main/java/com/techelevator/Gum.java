package com.techelevator;

public class Gum extends VendingMachineItem {
    public Gum(String productName, double price) {
        super(productName, price, "Gum");
    }
    // constructor needs to be overwritten since the parent has a custom constructor
}
