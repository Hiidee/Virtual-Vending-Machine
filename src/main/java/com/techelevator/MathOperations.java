package com.techelevator;

public class MathOperations {
    private double balance = 0.00;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double feedMoney(int moneyIn) {
        if (moneyIn > 0) {
            balance = balance + moneyIn; // we need to double check where moneyIn is declared, and develop some stuff around what if moneyIn is a string
        }
        //setBalance(balance);
        return balance;
    }

    public double getChange(double balance) {
        int numberOfDimes = 0;
        int numberOfQuarters = 0;
        int numberOfNickels = 0;

        int balanceInt = (int)(balance * 100);

        if (balanceInt > 0) {
            if ((balanceInt % 25) == 0) {
                numberOfQuarters = (balanceInt / 25);
                balanceInt = balanceInt - (numberOfQuarters * 25);
            } else {
                numberOfQuarters = (balanceInt / 25);
                balanceInt = balanceInt - (numberOfQuarters * 25);
                numberOfDimes = (balanceInt / 10);
                balanceInt = balanceInt - (numberOfDimes * 10);
                System.out.println("balance here: " + balance);
                numberOfNickels = (balanceInt / 5);
                balanceInt = balanceInt - (numberOfNickels * 5);
            }
        } else {
            System.out.println("You're broke");
        }
        setBalance(balanceInt);
        System.out.println("You will receive " + numberOfQuarters + " quarters, " + numberOfDimes + " dimes, and " + numberOfNickels + " in nickels.");
        return balanceInt / 100;
    }
}
/*
public double getChange(double balance) {
        int numberOfDimes = 0;
        int numberOfQuarters = 0;
        int numberOfNickels = 0;

        balance = 1.40;
        int balanceInt = (int)(balance) * 100;

        if (balance > 0.0) {
            if ((balance % .25) == 0) {
                numberOfQuarters = (int)(balance / .25);
                balance = balance - ((double)numberOfQuarters * .25);
            } else {
                numberOfQuarters = (int)(balance / .25);
                balance = balance - ((double)numberOfQuarters * .25);
                numberOfDimes = (int)(balance / .10);
                balance = balance - ((double)numberOfDimes * .10);
                System.out.println("balance here: " + balance);
                numberOfNickels = (int)(balance / .05);
                balance = balance - ((double)numberOfNickels * .05);
                System.out.println("You will receive " + numberOfQuarters + " quarters, " + numberOfDimes + " dimes, and " + numberOfNickels + " in nickels.");
            }
        } else {
            System.out.println("You're broke");
        }
        return balance;
    }
 */

/*
            }
        if (balance > 0.0) {
            if ((balance % .25) == 0) {
                numberOfQuarters = (int) (balance / .25);
                balance = balance - (numberOfQuarters * .25);
                if (balance > 0) {
                    if ((balance % .1) == 0) {
                        numberOfDimes = (int) ((balance % .25) / .10);
                        balance = balance - (numberOfDimes * .10);
                    }
                    if ()
                }
            } else {
                if ((balance % .25) != 0) {
                    numberOfQuarters = (int) (balance / .25);
                    balance = balance - (numberOfQuarters * .25);
                } else
                } else if ((balance % .05) != 0) {
                    numberOfNickels = (int) ((balance % .1) / 05);
                    balance = balance - (numberOfNickels * .10);

        if (balance > 0.0) {
            System.out.println(balance);
            if ((balance % .25) != 0) {
                numberOfQuarters = (int) (balance / .25);
                balance = balance - (numberOfQuarters * .25);
            } else if ((balance % .1) != 0) {
                numberOfDimes = (int) ((balance % .25) / .10);
                balance = balance - (numberOfDimes * .10);
            } else if ((balance % .05) != 0) {
                numberOfNickels = (int) ((balance % .1) / 05);
                balance = balance - (numberOfNickels * .10);
            } else {

            }

        if (balance > 0.0) {
        if ((balance % .25) == 0) {
        numberOfQuarters = (int) (balance / .25);
        balance = balance - (numberOfQuarters * .25);
        else{
        numberOfQuarters = balance / .25;
        balance = balance-(numberOfQuarters*.25);
        numberOfDimes= balance / .10;
        balance = balance-(numberOfDimes*.10);
        numberOfNickels=balance / .5;
        }




        if ((balance % .1) == 0) {
        numberOfDimes = (int) ((balance % .25) / .10);
        balance = balance - (numberOfDimes * .10);
        }
        if ()
        }
        } else {
        if ((balance % .25) != 0) {
        numberOfQuarters = (int) (balance / .25);
        balance = balance - (numberOfQuarters * .25);
        } else
        } else if ((balance % .05) != 0) {
        numberOfNickels = (int) ((balance % .1) / 05);
        balance = balance - (numberOfNickels * .10);
        } else {
        System.out.println("Your balance is &" + balance);
        }
        }

 */