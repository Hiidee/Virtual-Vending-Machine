package com.techelevator;

public abstract class VendingMachineItem {
//    private String locationKey;
    private String productName;
    private double price;
    private String productType;
    private int quantity = 5;
    private String message;
    private boolean isStocked = true;

    public VendingMachineItem(String productName, double price, String productType) {
        this.productName = productName;
        this.price = price;
        this.productType = productType;
    }

    public boolean isStocked() { //test me!
        if (quantity == 0) {
            isStocked = false;
        }
        return isStocked;
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