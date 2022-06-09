package com.techelevator;

public class Chips extends VendingMachineItem {
    public Chips(String productName, double price) {
        super(productName, price, "Chips");
    }
    // constructor needs to be overwritten since the parent has a custom constructor
    //    public VendingMachineItem(String productName, double price, String productType) {
    //        this.productName = productName;
    //        this.price = price;
    //        this.productType = productType;
    //    }
}
