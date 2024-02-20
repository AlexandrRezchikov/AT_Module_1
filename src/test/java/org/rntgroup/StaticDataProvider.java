package org.rntgroup;

import org.testng.annotations.DataProvider;

public class StaticDataProvider {

    @DataProvider(name = "valuesForSumLongTest")
    public static Object[][] valueForSumLong() {
        return new Object[][]{
                {350, 150, 500},
                {-350, 150, -200},
                {-350, -150, -500},
                {350, -150, 200},
                {0, 150, 150},
                {0, -150, -150},
                {0, 0, 0}
        };
    }

    @DataProvider(name = "valuesForSumDoubleTest")
    public static Object[][] valuesForSumDouble() {
        return new Object[][]{
                {5.1, 2.4, 7.5},
                {-5.1, 2.3, -2.8},
                {-5.1, -2.4, -7.5},
                {5.1, 0, 5.1}
        };
    }

    @DataProvider(name = "valuesForSubLongTest")
    public static Object[][] valuesForSubLong() {
        return new Object[][]{
                {150, 100, 50},
                {-150, 100, -250},
                {150, -100, 250},
                {0, 100, -100}
        };
    }

    @DataProvider(name = "valuesForSubDoubleTest")
    public static Object[][] valuesForSubDouble() {
        return new Object[][]{
                {5.1, 2.3, 2.8},
                {-5.1, 2.4, -7.5},
                {-5.1, -2.3, -2.8},
                {5.1, 0, 5.1}
        };
    }

    @DataProvider(name = "valuesForMultLongTest")
    public static Object[][] valuesForMultLong() {
        return new Object[][]{
                {7, 6, 42},
                {-7, 6, -42},
                {-7, -6, 42},
                {0, 6, 0}
        };
    }

    @DataProvider(name = "valuesForMultDoubleTest")
    public static Object[][] valuesForMultDouble() {
        return new Object[][]{
                {5.1, 2.3, 11.73},
                {-5.1, 2.4, -12.24},
                {-5.1, -2.3, 11.73},
                {5.1, 0, 0}
        };
    }

    @DataProvider(name = "valuesForDivLongTest")
    public static Object[][] valuesForDivLong() {
        return new Object[][]{
                {20, 4, 5},
                {-20, 4, -5},
                {20, -5, -4},
                {-20, -4, 5},
//                {20, 0, 0}
        };
    }

    @DataProvider(name = "valuesForDivDoubleTest")
    public static Object[][] valuesForDivDouble() {
        return new Object[][]{
                {5.1, 2.3, 2.2173913},
                {-5.1, 2.4, -2.125},
                {-5.1, -2.3, -2.2173913},
//                {5.1, 0, 0.0}
        };
    }

    @DataProvider(name = "valuesForPowTest")
    public static Object[][] valuesForPow() {
        return new Object[][]{
                {7, 2, 49},
                {-3, 3, -27},
                {3, 3.5, 46.7653718},
                {3, 0, 1}
        };
    }

    @DataProvider(name = "valuesForSqrtTest")
    public static Object[][] valuesForSqrt() {
        return new Object[][]{
                {49, 7},
                {30.25, 5.5},
                {0, 0}
        };
    }

    @DataProvider(name = "valuesForSinTest")
    public static Object[][] valuesForSin() {
        return new Object[][]{
                {90, 1},
                {30, 0.5},
                {-90, -1},
                {0, 0}
        };
    }

    @DataProvider(name = "valuesForCosTest")
    public static Object[][] valuesForCos() {
        return new Object[][]{
                {60, 0.5},
                {-180, -1},
                {0, 1}
        };
    }

    @DataProvider(name = "valuesForTgTest")
    public static Object[][] valuesForTg() {
        return new Object[][]{
                {45, 1},
                {180, 0},
                {20, 0.364},
                {-180, 0},
                {135, -1}
        };
    }

    @DataProvider(name = "valuesForCtgTest")
    public static Object[][] valuesForCtg() {
        return new Object[][]{
                {90, 0},
                {112, 0.404},
                {-45, -1}
        };
    }

    @DataProvider(name = "valuesForIsPositiveTest")
    public static Object[][] valuesForIsPositive() {
        return new Object[][]{
                {5, true},
                {0, false},
                {-5, false}
        };
    }

    @DataProvider(name = "valuesForIsNegativeTest")
    public static Object[][] valuesForIsNegative() {
        return new Object[][]{
                {-5, true},
                {0, false},
                {5, false}
        };
    }
}