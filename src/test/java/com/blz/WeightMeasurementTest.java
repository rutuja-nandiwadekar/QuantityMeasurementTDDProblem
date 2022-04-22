package com.blz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WeightMeasurementTest {
    private QuantityMeasurement quantityMeasurement;

    @Before
    public void init() {
        quantityMeasurement = new QuantityMeasurement();
    }

    //UC7
    /*
      TC 1.1 to compare weights in kg
    */
    @Test
    public void given0KGAnd0KGWhenEqual_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(WeightUnits.KG, 0.0);
        double value2 = quantityMeasurement.unitConversion(WeightUnits.KG, 0.0);
        Assert.assertEquals(value1, value2, 0);
    }

    /*
      TC 1.2 to compare weights in grams
    */
    @Test
    public void given0GramAnd0GramWhenEqual_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(WeightUnits.GRAM, 0.0);
        double value2 = quantityMeasurement.unitConversion(WeightUnits.GRAM, 0.0);
        Assert.assertEquals(value1, value2, 0);
    }

    /*
      TC 1.3 to compare weights in tonne
    */
    @Test
    public void given0TonneAnd0TonneWhenEqual_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(WeightUnits.TONNE, 0.0);
        double value2 = quantityMeasurement.unitConversion(WeightUnits.TONNE, 0.0);
        Assert.assertEquals(value1, value2, 0);
    }


}
