package com.epam.moscow.module4.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTestCos extends BaseTestCalculator {

    @Test
    public void testCos() {
	double result = calculator.cos(60);
	Assert.assertEquals(result, 0.5);
	}
}
