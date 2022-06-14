package com.techelevator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.testng.annotations.Test;

public class MathOperationsTest {

    @Test
    public void feedMoneyMoneyIn0Balance0Expected0() {
        MathOperations sut = new MathOperations();
        int moneyIn = 0;
        sut.setBalance(0);
        double expected = 0;
        Assert.assertEquals(expected, sut.feedMoney(moneyIn), 0.001); // is 0.001 the right delta to put in here?

    }

    @Test
    public void feedMoneyMoneyIn5Balance0Expected5() {
        MathOperations sut = new MathOperations();
        int moneyIn = 5;
        sut.setBalance(0);
        double expected = 5.0;
        Assert.assertEquals(expected, sut.feedMoney(moneyIn), .001);
    }

    @Test
    public void feedMoneyMoneyIn5Balance525Expected1025() {
        MathOperations sut = new MathOperations();
        int moneyIn = 5;
        sut.setBalance(5.25);
        double expected = 10.25;
        Assert.assertEquals(expected, sut.feedMoney(moneyIn), .001);
    }

    @Test
    public void feedMoneyMoneyInNegative5Balance5() {
        MathOperations sut = new MathOperations();
        int moneyIn = -5;
        sut.setBalance(5);
        double expected = 5.0;
        Assert.assertEquals(expected, sut.feedMoney(moneyIn), .01);
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
    public void getChangeTestQuartersFiveCentsBalanceEquals0() {
        MathOperations sut = new MathOperations();
        double balance = .05;
        Assert.assertEquals(0.0, sut.getChange(balance), .001); // how to make a test of multiple variables
    }
    @Test
    public void getChangeTestDimesFiveCentsBalanceEquals0() {
        MathOperations sut = new MathOperations();
        double balance = .05;
        Assert.assertEquals(0.0, sut.getChange(balance), .001); // how to make a test of multiple variables
    }
    @Test
    public void getChangeTestNickelsFiveCentsBalanceEquals1() {
        MathOperations sut = new MathOperations();
        double balance = .05;
        Assert.assertEquals(0.0, sut.getChange(balance), .001); // how to make a test of multiple variables
    }
    @Test
    public void getChangeTestQuartersEqual0BalanceEqualsTenCents() {
        MathOperations sut = new MathOperations();
        double balance = 0.10;
        Assert.assertEquals(0.0, sut.getChange(balance), .001); // how to make a test of multiple variables
    }
    @Test
    public void getChangeTestDimesEqual1BalanceEqualsTenCents() {
        MathOperations sut = new MathOperations();
        double balance = 0.10;
        Assert.assertEquals(0.0, sut.getChange(balance), .001); // how to make a test of multiple variables
    }
    @Test
    public void getChangeTestNickelEquals0BalanceEqualsTenCents() {
        MathOperations sut = new MathOperations();
        double balance = 0.10;
        //int expectedNumberOfNickels = 1;
        Assert.assertEquals(0, sut.getChange(balance), .001); // how to make a test of multiple variables
    }
}
