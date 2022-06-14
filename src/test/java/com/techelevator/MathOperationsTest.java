package com.techelevator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.testng.annotations.Test;

public class MathOperationsTest {

    @Test
    public void feedMoneyMoneyIn0Balance0() {
        MathOperations sut = new MathOperations();
        int moneyIn = 0;
        double balance = 0;
        double expected = 0;
        Assert.assertEquals(expected, sut.feedMoney(moneyIn), 0.001); // is 0.001 the right delta to put in here?

    }

    @Test
    public void feedMoneyMoneyIn5Balance0() {
        MathOperations sut = new MathOperations();
        int moneyIn = 5;
        double balance = 0.0;
        double expected = 5.0;
        Assert.assertEquals(expected, sut.feedMoney(moneyIn), .001);
    }

    @Test
    public void feedMoneyMoneyIn5Balance5AndChange() {
        MathOperations sut = new MathOperations();
        int moneyIn = 5;
        double balance = 5.25;
        double expected = 5.25;
        Assert.assertEquals(expected, sut.feedMoney(moneyIn), .001);
    }

    @Test
    public void feedMoneyMoneyInNegative5Balance5() {
        MathOperations sut = new MathOperations();
        int moneyIn = -5;
        double balance = 5.0;
        double expected = 5.0;
        Assert.assertEquals(expected, sut.feedMoney(moneyIn), .001);
    }

    @Test
    public void getChangeTestQuartersZeroBalanceEquals0() {
        MathOperations sut = new MathOperations();
        double balance = 0.0;
        int expectedNumberOfQuarters = 0;
        Assert.assertEquals(expectedNumberOfQuarters, sut.getChange(balance), .001); // how to make a test of multiple variables
    }

    @Test
    public void getChangeTestDimesZeroBalanceEquals0() {
        MathOperations sut = new MathOperations();
        double balance = 0.0;
        int expectedNumberOfDimes = 0;
        Assert.assertEquals(expectedNumberOfDimes, sut.getChange(balance), .001); // how to make a test of multiple variables
    }
    @Test
    public void getChangeTestNickelsZeroBalanceEquals0() {
        MathOperations sut = new MathOperations();
        double balance = 0.0;
        int expectedNumberOfNickels = 0;
        Assert.assertEquals(expectedNumberOfNickels, sut.getChange(balance), .001); // how to make a test of multiple variables
    }
    @Test
    public void getChangeTestQuartersOneDollarBalanceEquals4() {
        MathOperations sut = new MathOperations();
        double balance = 1.0;
        int expectedNumberOfQuarters = 4;
        Assert.assertEquals(expectedNumberOfQuarters, sut.getChange(balance), .001); // how to make a test of multiple variables
    }
    @Test
    public void getChangeTestDimesOneDollarBalanceEquals0() {
        MathOperations sut = new MathOperations();
        double balance = 1.0;
        int expectedNumberOfDimes = 0;
        Assert.assertEquals(expectedNumberOfDimes, sut.getChange(balance), .001); // how to make a test of multiple variables
    }
    @Test
    public void getChangeTestNickelsOneDollarBalanceEquals0() {
        MathOperations sut = new MathOperations();
        double balance = 1.0;
        int expectedNumberOfNickels = 0;
        Assert.assertEquals(expectedNumberOfNickels, sut.getChange(balance), .001); // how to make a test of multiple variables
    }
    @Test
    public void getChangeTestQuartersEqual4BalanceEquals115() {
        MathOperations sut = new MathOperations();
        double balance = 1.15;
        int expectedNumberOfQuarters = 4;
        Assert.assertEquals(expectedNumberOfQuarters, sut.getChange(balance), .001); // how to make a test of multiple variables
    }
    @Test
    public void getChangeTestDimesEqual1BalanceEquals115() {
        MathOperations sut = new MathOperations();
        double balance = 1.15;
        int expectedNumberOfDimes = 1;
        Assert.assertEquals(expectedNumberOfDimes, sut.getChange(balance), .001); // how to make a test of multiple variables
    }
    @Test
    public void getChangeTestNickelEquals1BalanceEquals115() {
        MathOperations sut = new MathOperations();
        double balance = 1.15;
        int expectedNumberOfNickels = 1;
        Assert.assertEquals(expectedNumberOfNickels, sut.getChange(balance), .001); // how to make a test of multiple variables
    }
}
