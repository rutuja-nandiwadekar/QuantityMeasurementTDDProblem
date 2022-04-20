package com.blz;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTestRefactor {

    //test case for Feet
    /*
      TC 1.1 to check equality of 2 feet variables
    */
    @Test

    public void given0FeetAnd0Feet_ShouldReturnEqual()  {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double value1 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
        double value2 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double value1 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
        double value2 = quantityMeasurement.unitComparison(Units.FEET, 1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    /*
      TC 1.2 to check equality of null
    */
    @Test
    public void givenNullFeetValue_shouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double value1 = quantityMeasurement.unitComparison(Units.FEET,0.0);
        Assert.assertNotNull(value1);
    }

    /*
       TC 1.3 to check equality of Two references
     */
    @Test
    public void givenSameReference_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Assert.assertSame(quantityMeasurement,quantityMeasurement);
    }

    @Test
    public void givenNotSameReference_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
        Assert.assertNotSame(quantityMeasurement,quantityMeasurement1);
    }

    /*
       TC 1.4 to check equality of 2 types
     */
    @Test
    public void giveSameTypes_shouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement,quantityMeasurement);
    }

    @Test
    public void giveDifferentTypes_shouldReturnNotEqual() {
        QuantityMeasurementTestRefactor quantityMeasurementTestRefactor = new QuantityMeasurementTestRefactor();
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Assert.assertNotEquals(quantityMeasurementTestRefactor,quantityMeasurement);
    }


}
