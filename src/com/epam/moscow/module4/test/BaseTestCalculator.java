package com.epam.moscow.module4.test;

import com.epam.moscow.module4.calculator.Calculator;
import org.testng.annotations.*;

public class BaseTestCalculator {
    protected Calculator calculator;
    protected String c;

    @BeforeClass
    public void setUp() {
	System.out.println("Config prepare calculator");
	calculator = new Calculator();
    }

    @AfterMethod
    public void resulttime() {
	System.out.println("testname " + c);

    }
}
