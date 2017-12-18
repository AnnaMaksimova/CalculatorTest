package com.epam.moscow.module4.test;

import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTestSum extends BaseTestCalculator {

    @DataProvider(name = "sumLocalData")
    public Object[][] valuesForSum() {
	return new Object[][] { 
		{ 50, 20, 70 }, 
		{ 11, 6, 17 }, 
		{ 1, -10, -9 },
		{ 0, 0, 0 } };
    }

    // Using DataProvider
    @Test(dataProvider = "sumLocalData")
    public void testSum(long a, long b, long expected) {
	long result = calculator.sum(a, b);
	Assert.assertEquals(result, expected);
	c = "testSum";

    }

    // Without DataProvider (fail)
    @Test
    public void testSumm() {
	long result = calculator.sum(1, 2);
	Assert.assertEquals(result, 4);
	c = "testSumm";
    }
}