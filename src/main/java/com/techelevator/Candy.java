package com.techelevator;

public class Candy extends VendingMachineItem {
    public Candy(String productName, double price) {
        super(productName, price, "Candy");
    }




    // constructor needs to be overwritten since the parent has a custom constructor
}
