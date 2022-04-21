package com.blz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VolumeMeasurementTest {
    private QuantityMeasurement quantityMeasurement;

    @Before
    public void init() {
        quantityMeasurement = new QuantityMeasurement();
    }
    //UC5
    /*
      TC 1.1 to compare volumes in litre and gallon /0 gallon = 0 gallon
    */
    @Test
    public void given0gallonAnd0Gallon_shouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(VolumeUnits.GALLON,0.0);
        double value2 = quantityMeasurement.unitConversion(VolumeUnits.GALLON, 0.0);
        Assert.assertEquals(value1, value2, 0);
    }
    
}
