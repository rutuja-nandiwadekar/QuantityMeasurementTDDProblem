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

    /*
      TC 1.4 to compare weights 1 kg = 1000 grams
     */
    @Test
    public void given1KGAnd1000GramsWhenEqual_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(WeightUnits.KG, 1.0);
        double value2 = quantityMeasurement.unitConversion(WeightUnits.GRAM, 1000.0);
        Assert.assertEquals(value1, value2, 0);
    }
    /*
      TC 1.5 to compare weights 1 tonne = 1000 kgs
    */
    @Test
    public void given1TonneAnd1000KGWhenEqual_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(WeightUnits.TONNE, 1.0);
        double value2 = quantityMeasurement.unitConversion(WeightUnits.KG, 1000.0);
        Assert.assertEquals(value1, value2, 0);
    }

    /*
      TC 1.6 to add weights 1 tonne + 1000 gm = 1001 kg
    */
    @Test
    public void given1TonneAnd1000GramsWhenAdded_ShouldReturn1001KG() {
        double value1 = quantityMeasurement.unitAddition(WeightUnits.TONNE, 1.0, WeightUnits.GRAM, 1000.0);
        double value2 = quantityMeasurement.unitConversion(WeightUnits.KG, 1001.0);
        Assert.assertEquals(value1, value2, 0);
    }
}
