package com.techelevator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.testng.annotations.Test;

public class VendingMachineItemTest {
    @Test
    public void isStockedTestFalse() {
        VendingMachineItem sut = new VendingMachineItem() {
        Assert.assertFalse(sut.isStocked(false)); // why is this happening
        }
    }
}
