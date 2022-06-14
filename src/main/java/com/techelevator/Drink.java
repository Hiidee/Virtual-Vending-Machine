package com.techelevator;

public class Drink extends VendingMachineItem {
    String message = "Glug Glug, Yum!";
    public Drink(String productName, double price) {
        super(productName, price, "Drink");
    }

    @Override
    public String consume() {
        return message;
    }
    // constructor needs to be overwritten since the parent has a custom constructor

    // String drinkPhrase = "Glug Glug, Yum!"

}