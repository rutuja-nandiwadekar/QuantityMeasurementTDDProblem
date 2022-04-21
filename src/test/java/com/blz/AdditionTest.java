package com.blz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {

    private QuantityMeasurement quantityMeasurement;
    private QuantityMeasurement quantityMeasurement1;

    static double value1;
    static double value2;
    @Before
    public void init(){
        quantityMeasurement = new QuantityMeasurement();
        quantityMeasurement1 = new QuantityMeasurement();
    }
    /*
       TC 1 to add two lengths in inches 2 in + 2 in = 4 in
    */
    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturnCorrect() {
        value1 = quantityMeasurement.unitAddition(Units.INCH, 2.0, Units.INCH, 2.0);
        value2= quantityMeasurement.unitComparison(Units.INCH, 4);
        Assert.assertEquals(value1, value2,0.0);
    }
}
