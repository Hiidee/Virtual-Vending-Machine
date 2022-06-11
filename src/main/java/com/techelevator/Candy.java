package com.techelevator;

public class Candy extends VendingMachineItem {
    public Candy(String productName, double price) {
        super(productName, price, "Candy");
    }

/*
    // constructor needs to be overwritten since the parent has a custom constructor
        // String candyPhrase = "Munch Munch, Yum!"

        // this approach would require a for loop
        // if (productType.equals("Chip"));
        //System.out.println("Enjoy your " + productName + ". It cost: " + price + ". Your remaining balance is: " + newBalance + ". " + chipPhrase);
        // if (productType.equals("Gum"));
        //System.out.println("Enjoy your " + productName + ". It cost: " + price + ". Your remaining balance is: " + newBalance + ". " + gumPhrase);
        // if (productType.equals("Drink"));
        //System.out.println("Enjoy your " + productName + ". It cost: " + price + ". Your remaining balance is: " + newBalance + ". " + drinkPhrase);
        // if (productType.equals("Candy"));
        //System.out.println("Enjoy your " + productName + ". It cost: " + price + ". Your remaining balance is: " + newBalance + ". " + candyPhrase);
    }

 */
}
