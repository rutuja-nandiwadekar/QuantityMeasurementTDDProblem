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

    /*
     TC 1.2 to compare volumes in litre and gallon /1 gallon = 3.78 litres
   */
    @Test
    public void given1GallonAndThreePointSevenEightLitersWhenEqual_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(VolumeUnits.GALLON, 1.0);
        double value2 = quantityMeasurement.unitConversion(VolumeUnits.LITRE, 3.78);
        Assert.assertEquals(value1, value2, 0);
    }

    /*
     TC 1.3 to compare volumes in litre and gallon /1 litre = 1000 ml
   */
    @Test
    public void given1LitreAnd1000MLWhenEqual_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(VolumeUnits.LITRE, 1.0);
        double value2 = quantityMeasurement.unitConversion(VolumeUnits.MILLILITER, 1000.0);
        Assert.assertEquals(value1, value2, 0);
    }

    //UC6
    /*
     TC 1.4 to add volumes in litres - 1 gallon + 3.78 litres = 7.57 litres
   */
    @Test
    public void given1GallonAndThreePointSevenEightLitersWhenAdded_ShouldReturnSevenPointFiveSixLiters() {
        double value1 = quantityMeasurement.unitAddition(VolumeUnits.GALLON,1.0,VolumeUnits.LITRE,3.78);
        double value2 = quantityMeasurement.unitConversion(VolumeUnits.LITRE, 7.56);
        Assert.assertEquals(value1, value2, 0);
    }

    /*
     TC 1.5 to add volumes in litres - 1 litre + 1000 ml = 2 litres
   */
    @Test
    public void given1LitreAnd1000MLWhenAdded_ShouldReturn2Liters() {
        double value1 = quantityMeasurement.unitAddition(VolumeUnits.LITRE,1.0,VolumeUnits.MILLILITER,1000);
        double value2 = quantityMeasurement.unitConversion(VolumeUnits.LITRE, 2.0);
        Assert.assertEquals(value1, value2, 0);
    }

}
