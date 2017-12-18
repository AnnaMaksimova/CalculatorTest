package com.epam.moscow.module4.test;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestGroups extends BaseTestCalculator {

    @Test(groups = "div")
    public void div1() {
        long result = calculator.div(30, 2);
        Assert.assertEquals(result, 15);
    }

    @Test(groups = "div")
    public void div2(){
        long result = calculator.div(30, -2);
        Assert.assertEquals(result, -15);
    }

    @Test(groups = "sum", dependsOnGroups = "div")
    public void sum1() {
        long result = calculator.sum(10, 100);
        Assert.assertEquals(result, 110);
    }

    @Test(dataProvider = "divDP", groups = "div")
    public void oneValueMinusAnother(long a, long b, long expected) {
        long result = calculator.div(a, b);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "sumDP", groups = "sum")
    public void oneValuePlusAnother(long a, long b, long expected) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "divDP")
    public Object[][] valuesForDiv() {
        return new Object[][] {
                {20, 2, 10},
                {-15, 3, -5},
                {100,-10, -10},
                {0, 0, 0}
        };
    }

    @DataProvider(name = "sumDP")
    public Object[][] valuesForSum() {
        return new Object[][] {
                {20, 20, 40},
                {10, 6, 16},
                {-10, -10, -20},
                {-10, 10, 0},
                {0, 0, 0}
        };
    }
}
