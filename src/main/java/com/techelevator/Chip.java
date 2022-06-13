package com.techelevator;

public class Chip extends VendingMachineItem {
    String message = "Crunch Crunch, Yum!";
    public Chip(String productName, double price) {
        super(productName, price, "Chip");
    }

    @Override
    public String consume() {
        return message;
    }
    // constructor needs to be overwritten since the parent has a custom constructor

    // String chipPhrase = "Crunch Crunch, Yum!"

}
