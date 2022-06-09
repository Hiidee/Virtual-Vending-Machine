package com.techelevator;

public class MathOperations {
    private int balance = 0;

    public int feedMoney(int moneyIn) {
        balance = balance + moneyIn;
        return balance;
    }


}