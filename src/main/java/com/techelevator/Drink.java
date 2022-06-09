package com.techelevator;

public class Drink extends VendingMachineItem {
    public Drink(String productName, double price) {
        super(productName, price, "Drink");
    }
    // constructor needs to be overwritten since the parent has a custom constructor
    //    public VendingMachineItem(String productName, double price, String productType) {
    //        this.productName = productName;
    //        this.price = price;
    //        this.productType = productType;
    //    }
}