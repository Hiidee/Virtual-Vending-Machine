package com.techelevator;

public class MathOperations {
    private double balance = 0;

    public double feedMoney(double moneyIn) {
        balance = balance + moneyIn; // we need to double check where moneyIn is declared, and develop some stuff around what if moneyIn is a string
        return balance;
    }

    public int updateQuantity(int quantity) {
        if (quantity == 0) {
            System.out.println("SOLD OUT");
            return quantity;
        }
        if (quantity > 0) {
            quantity = quantity - 1;
            return quantity;

        }
        return quantity;
    }

    public double receivesChange(double balance) {
        if (balance > 0) {
            int numberOfDimes = 0;
            int numberOfQuarters = 0;
            int numberOfNickels = 0;
            if ((balance % .25) != 0) {
                numberOfQuarters = (int) (balance / .25);
                balance = balance - (numberOfQuarters * .25);
            } else if ((balance % .1) != 0) {
                numberOfDimes = (int) ((balance % .25) / .10);
                balance = balance - (numberOfDimes * .10);
            } else if ((balance % .05) != 0) {
                numberOfNickels = (int) ((balance % .1) / 05);
                balance = balance - (numberOfNickels * .10);
            }
            System.out.println("You will receive " + numberOfQuarters + "quarters, " + numberOfDimes + "dimes, and " + numberOfNickels + "in nickels.");
        } else {
            System.out.println("Your balance is $0.00!");
        }
        return balance;
    }
}

