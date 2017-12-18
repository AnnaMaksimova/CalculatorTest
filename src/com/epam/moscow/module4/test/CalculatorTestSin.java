package com.epam.moscow.module4.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTestSin extends BaseTestCalculator {

    @Test
    public void testSin() {
	double result = calculator.sin(30);
	Assert.assertEquals(result, 0.5);
	}
}
