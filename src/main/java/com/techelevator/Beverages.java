package com.techelevator;

public class Beverages extends VendingMachineItem {
    public Beverages(String productName, double price) {
        super(productName, price, "Beverages");
    }
    // constructor needs to be overwritten since the parent has a custom constructor
    //    public VendingMachineItem(String productName, double price, String productType) {
    //        this.productName = productName;
    //        this.price = price;
    //        this.productType = productType;
    //    }
}