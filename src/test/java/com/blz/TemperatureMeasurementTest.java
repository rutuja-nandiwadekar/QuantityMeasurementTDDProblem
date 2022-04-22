package com.blz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TemperatureMeasurementTest {
    private QuantityMeasurement quantityMeasurement;

    @Before
    public void init() {
        quantityMeasurement = new QuantityMeasurement();
    }

    //UC8
    /*
      TC 1.1 to compare temp in Celsious
    */
    @Test
    public void given0CelsiousAnd0Celsious_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIOUS, 0.0);
        double value2 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIOUS, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /*
      TC 1.2 to compare temp in Fahrenheit
    */
    @Test
    public void given0FahrenheitAnd0Fahrenheit_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(TemperatureUnits.FAHRENHEIT, 0.0);
        double value2 = quantityMeasurement.unitConversion(TemperatureUnits.FAHRENHEIT, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

}
