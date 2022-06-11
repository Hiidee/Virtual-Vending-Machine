package com.techelevator;

public class Drink extends VendingMachineItem {
    public Drink(String productName, double price) {
        super(productName, price, "Drink");
    }
    // constructor needs to be overwritten since the parent has a custom constructor

    // String drinkPhrase = "Glug Glug, Yum!"

}