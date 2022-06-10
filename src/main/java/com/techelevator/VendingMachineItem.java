package com.techelevator;

public abstract class VendingMachineItem {
//    private String locationKey;
    private String productName;
    private double price;
    private String productType;
    private int quantity = 5;

    public VendingMachineItem(String productName, double price, String productType) {
        this.productName = productName;
        this.price = price;
        this.productType = productType;
    }

    // return the quantity so we can update
    // math operations needs to handle
    // need to be able to call math operations



    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getProductType() {
        return productType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return productName + " $" + price + " " + productType;
    }
}