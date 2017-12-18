package com.epam.moscow.module4.test;

import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTestSub extends BaseTestCalculator {

    @DataProvider(name = "subLocalData")
    public Object[][] valuesForSub() {
	return new Object[][] { { 50, 20, 30 }, { 11, 6, 5 }, { -1, -3, -4 },
		{ 0, 0, 0 } };
    }

    // Using DataProvider
    @Test(dataProvider = "subLocalData")
    public void testSub(long a, long b, long expected) {
	long result = calculator.sub(a, b);
	Assert.assertEquals(result, expected);
	c = "testSub";

    }

    // Without DataProvider (fail)
    @Test
    public void testSubb() {
	long result = calculator.sub(100, 20);
	Assert.assertEquals(result, 80);
	c = "testSubb";
    }
}

