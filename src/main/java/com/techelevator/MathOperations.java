package com.techelevator;

public class MathOperations {
    private double balance = 0;

    public double feedMoney(double moneyIn) {
        balance = balance + moneyIn;
        return balance; //does this need to involve this.Balance?
    }

    public int updateQuantity(int quantity) { // QUESTION: DO we want to put the various print-outs here too?
        if (quantity > 0) {
            quantity = quantity - 1;
            return quantity; //does this need to involve this.quantity?
          }
        
    public double receivesChange(double balance) { //why is this throwing compiler errors?
            if (balance > 0) {
                double numberOfQuarters = balance / .25; // this determines the number of quarters
                double numberOfDimes = (balance % .25) / .10; // the remainder of balance / .25 divided by .10 determines the number of dimes
                double numberOfNickels = (numberOfDimes % .10) / 0.05; // this determines the number of nickels returned from what's left over after dimes paid out
            System.out.println("You will receive " + numberOfQuarters + "quarters, " + numberOfDimes + "dimes, and " + numberOfNickels + "in nickels.");
            }
        }

}
}