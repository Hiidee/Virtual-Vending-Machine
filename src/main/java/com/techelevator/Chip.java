package com.techelevator;

public class Chip extends VendingMachineItem {
    public Chip(String productName, double price) {
        super(productName, price, "Chip");
    }
    // constructor needs to be overwritten since the parent has a custom constructor
}
