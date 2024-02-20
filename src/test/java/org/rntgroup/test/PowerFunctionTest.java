package org.rntgroup.test;

import org.rntgroup.BaseTest;
import org.rntgroup.StaticDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PowerFunctionTest extends BaseTest {

    @Test(description = "Unit Pow Test",
            dataProvider = "valuesForPowTest",
            dataProviderClass = StaticDataProvider.class)
    public void unitPowTest(double num1, double num2, double expValue) {
        double result = calculator.pow(num1, num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @Test(description = "Unit Sqrt Test",
            dataProvider = "valuesForSqrtTest",
            dataProviderClass = StaticDataProvider.class)
    public void unitSqrtTest(double num, double expValue) {
        double result = calculator.sqrt(num);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @Test(description = "Unit Sqrt Negative Numbers Test")
    public void unitSqrtNegativeNumbersTest() {
        try {
            calculator.sqrt(-49);
            Assert.fail("Expected exception not throw");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getClass(), IllegalArgumentException.class);
        }
    }
}
