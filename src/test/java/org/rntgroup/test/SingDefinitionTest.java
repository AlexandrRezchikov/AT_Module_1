package org.rntgroup.test;

import org.rntgroup.BaseTest;
import org.rntgroup.StaticDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingDefinitionTest extends BaseTest {

    @Test(description = "Unit isPositive Test",
            dataProvider = "valuesForIsPositiveTest",
            dataProviderClass = StaticDataProvider.class)
    public void unitIsPositiveTest(long num, boolean expectedResult) {
        boolean actualResult = calculator.isPositive(num);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Unit isNegative Test",
            dataProvider = "valuesForIsNegativeTest",
            dataProviderClass = StaticDataProvider.class)
    public void unitIsNegativeTest(long num, boolean expectedResult) {
        boolean actualResult = calculator.isNegative(num);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
