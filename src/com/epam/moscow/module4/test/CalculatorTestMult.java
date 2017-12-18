package com.epam.moscow.module4.test;

import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTestMult extends BaseTestCalculator {

    @DataProvider(name = "multLocalData")
    public Object[][] valuesForMult() {
	return new Object[][] { { 50, 20, 1000 }, { 11, 2, 22 }, { -1, -3, -3 },
		{ 0, 0, 0 } };
    }

    // Using DataProvider
    @Test(dataProvider = "multLocalData")
    public void testMult(long a, long b, long expected) {
	long result = calculator.mult(a, b);
	Assert.assertEquals(result, expected);
	c = "testMult";

    }

    // Without DataProvider (fail)
    @Test
    public void testMultt() {
	long result = calculator.mult(100, 2);
	Assert.assertEquals(result, 200);
	c = "testMultt";
    }
}

