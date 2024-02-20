package org.rntgroup.test;

import org.rntgroup.BaseTest;
import org.rntgroup.StaticDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticFunctionTests extends BaseTest {

    @Test(description = "Unit Sum Long Test",
            dataProvider = "valuesForSumLongTest",
            dataProviderClass = StaticDataProvider.class,
            groups = "smoke")
    public void unitSumLongTest(long num1, long num2, long expValue) {
        long result = calculator.sum(num1, num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @Test(description = "Unit Sum Double Test",
            dataProvider = "valuesForSumDoubleTest",
            dataProviderClass = StaticDataProvider.class)
    public void unitSumDoubleTest(double num1, double num2, double expValue) {
        double result = calculator.sum(num1, num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @Test(description = "Unit Sub Long Test",
            dataProvider = "valuesForSubLongTest",
            dataProviderClass = StaticDataProvider.class)
    public void unitSubLongTest(long num1, long num2, long expValue) {
        long result = calculator.sub(num1, num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @Test(description = "Unit Sub Double Test",
            dataProvider = "valuesForSubDoubleTest",
            dataProviderClass = StaticDataProvider.class)
    public void unitSubDoubleTest(double num1, double num2, double expValue) {
        double result = calculator.sub(num1, num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @Test(description = "Unit Mult Long Test",
            dataProvider = "valuesForMultLongTest",
            dataProviderClass = StaticDataProvider.class)
    public void unitMultLongTest(long num1, long num2, long expValue) {
        long result = calculator.mult(num1, num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @Test(description = "Unit Mult Double Test",
            dataProvider = "valuesForMultDoubleTest",
            dataProviderClass = StaticDataProvider.class)
    public void unitMultDoubleTest(double num1, double num2, double expValue) {
        double result = calculator.mult(num1, num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @Test(description = "Unit Div Long Test",
            dataProvider = "valuesForDivLongTest",
            dataProviderClass = StaticDataProvider.class)
    public void unitDivLongTest(long num1, long num2, long expValue) {
        long result = calculator.div(num1, num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @Test(description = "Unit Div On Zero Long Test")
    public void unitDivOnZeroLongTest() {
        try {
            calculator.div(20, 0);
            Assert.fail("Expected exception not thrown");
        } catch (ArithmeticException e) {
            Assert.assertEquals(e.getClass(), ArithmeticException.class);
        }
    }

    @Test(description = "Unit Div Double Test",
            dataProvider = "valuesForDivDoubleTest",
            dataProviderClass = StaticDataProvider.class)
    public void unitDivDoubleTest(double num1, double num2, double expValue) {
        double result = calculator.div(num1, num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @Test(description = "Unit Div On Zero Double Test")
    public void unitDivOnZeroDoubleTest() {
        try {
            calculator.div(3.5, 0);
            Assert.fail("Expected exception not thrown");
        } catch (ArithmeticException e) {
            Assert.assertEquals(e.getClass(), ArithmeticException.class);
        }
    }
}
