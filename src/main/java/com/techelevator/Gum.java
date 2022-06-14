package com.techelevator;

public class Gum extends VendingMachineItem {
    String message = "Chew Chew, Yum!";
    public Gum(String productName, double price) {
        super(productName, price, "Gum");
    }

    @Override
    public String consume() {
        return message;
    }
    // constructor needs to be overwritten since the parent has a custom constructor

    // String gumPhrase = "Chew Chew, Yum!"
}
