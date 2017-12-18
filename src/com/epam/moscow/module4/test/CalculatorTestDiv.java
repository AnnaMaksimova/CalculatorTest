package com.epam.moscow.module4.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTestDiv extends BaseTestCalculator {
//Using DataProvider
    @DataProvider(name = "divLocalData")
    public Object[][] valuesForDiv() {
	return new Object[][] { { 50, 2, 25 }, { 1000, 250, 4 },
		{ -40, 2, -20 }, { 0, 100, 0 } };
    }

    @Test(dataProvider = "divLocalData")
    public void testDiv(long a, long b, long expected) {
	long result = calculator.div(a, b);
	Assert.assertEquals(result, expected);
	c = "testDiv";
    }
//Without DataProvider (fail)
    @Test
    public void testDivv() {
	double result = calculator.div(5.0, 2.0);
	Assert.assertEquals(result, 2.6);
	c = "testDivv";
    }
}
