package org.rntgroup.test;

import org.rntgroup.BaseTest;
import org.rntgroup.StaticDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TrigonometricFunctionTest extends BaseTest {

    @Test(description = "Unit Sin Corner Test",
            dataProvider = "valuesForSinTest",
            dataProviderClass = StaticDataProvider.class)
    public void unitSinTest(double corner, double expValue) {
        double result = calculator.sin(Math.toRadians(corner));
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @Test(description = "Unit Cos Corner Test",
            dataProvider = "valuesForCosTest",
            dataProviderClass = StaticDataProvider.class)
    public void unitCosTest(double corner, double expValue) {
        double result = calculator.cos(Math.toRadians(corner));
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @Test(description = "Unit Tg Corner Test",
            dataProvider = "valuesForTgTest",
            dataProviderClass = StaticDataProvider.class)
    public void unitTgTest(double corner, double expValue) {
        double result = calculator.tg(Math.toRadians(corner));
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @Test(description = "Unit Ctg Corner Test",
            dataProvider = "valuesForCtgTest",
            dataProviderClass = StaticDataProvider.class)
    public void unitCtgTest(double corner, double expValue) {
        double result = calculator.ctg(Math.toRadians(corner));
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }
}
