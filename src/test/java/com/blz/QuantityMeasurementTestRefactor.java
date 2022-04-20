package com.blz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTestRefactor {

    private QuantityMeasurement quantityMeasurement;
    private QuantityMeasurement quantityMeasurement1;
    private QuantityMeasurementTestRefactor quantityMeasurementTestRefactor;
    
    @Before
    public void init(){
        quantityMeasurement = new QuantityMeasurement();
        quantityMeasurement1 = new QuantityMeasurement();
        quantityMeasurementTestRefactor = new QuantityMeasurementTestRefactor();
    }

    //UC1
    //test case for Feet
    /*
      TC 1.1 to check equality of 2 feet variables
    */
    @Test

    public void given0FeetAnd0Feet_ShouldReturnEqual()  {
        double value1 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
        double value2 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
        double value2 = quantityMeasurement.unitComparison(Units.FEET, 1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    /*
      TC 1.2 to check equality of null
    */
    @Test
    public void givenNullFeetValue_shouldReturnFalse() {
        double value1 = quantityMeasurement.unitComparison(Units.FEET,0.0);
        Assert.assertNotNull(value1);
    }

    /*
       TC 1.3 to check equality of Two references
     */
    @Test
    public void givenSameReference_ShouldReturnTrue() {
        Assert.assertSame(quantityMeasurement,quantityMeasurement);
    }

    @Test
    public void givenNotSameReference_ShouldReturnTrue() {
        Assert.assertNotSame(quantityMeasurement,quantityMeasurement1);
    }

    /*
       TC 1.4 to check equality of 2 types
     */
    @Test
    public void giveSameTypes_shouldReturnEqual() {
        Assert.assertEquals(quantityMeasurement,quantityMeasurement);
    }

    @Test
    public void giveDifferentTypes_shouldReturnNotEqual() {
        Assert.assertNotEquals(quantityMeasurementTestRefactor,quantityMeasurement);
    }

    /*
       TC 1.5 to check equality of 2 values
     */
    @Test
    public void givenSameValues_shouldReturnEqual() {
        double value1 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
        double value2 = quantityMeasurement1.unitComparison(Units.FEET, 0.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenDifferentValues_shouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
        double value2 = quantityMeasurement1.unitComparison(Units.FEET, 1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    //test case for Inch
    /*
      TC 1.6 to check equality of 2 inch variables
    */
    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitComparison(Units.INCH, 0.0);
        double value2 = quantityMeasurement.unitComparison(Units.INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitComparison(Units.INCH, 0.0);
        double value2 = quantityMeasurement.unitComparison(Units.INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
     TC 1.7 to check equality of null
   */
    @Test
    public void givenNullInchValue_shouldReturnFalse() {
        double value1 = quantityMeasurement.unitComparison(Units.INCH,0.0);
        Assert.assertNotNull(value1);
    }

    /*
       TC 1.8 to check equality of Two references
     */
    @Test
    public void givenSameReferenceInch_ShouldReturnTrue() {
        Assert.assertSame(quantityMeasurement,quantityMeasurement);
    }

    @Test
    public void givenNotSameReferenceInch_ShouldReturnTrue() {
        Assert.assertNotSame(quantityMeasurement,quantityMeasurement1);
    }

    /*
        TC 1.10 to check equality of 2 values
      */
    @Test
    public void givenSameInchValues_shouldReturnEqual() {
        double value1 = quantityMeasurement.unitComparison(Units.INCH, 0.0);
        double value2 = quantityMeasurement1.unitComparison(Units.INCH, 0.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenDifferentInchValues_shouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitComparison(Units.INCH, 0.0);
        double value2 = quantityMeasurement1.unitComparison(Units.INCH, 1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }


    //UC2
    /*
      TC 1.11 for comparing lengths of 2 yard variables
     */

    @Test
    public void given0YardAnd0YardWhenCompared_shouldReturnTrue() {
        double value1 = quantityMeasurement.unitComparison(Units.YARD, 0.0);
        double value2 = quantityMeasurement1.unitComparison(Units.YARD, 0.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void given0YardAnd1YardWhenCompared_shouldReturnFalse() {
        double value1 = quantityMeasurement.unitComparison(Units.YARD, 0.0);
        double value2 = quantityMeasurement1.unitComparison(Units.YARD, 1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    /*
      TC 1.12 for comparing lengths 1: 3ft = 1yd
     */
    @Test
    public void given3FeetAnd1YardWhenCompared_shouldReturnTrue() {
        double value1 = quantityMeasurement.unitComparison(Units.FEET, 3.0);
        double value2 = quantityMeasurement1.unitComparison(Units.YARD, 1.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    /*
      TC 1.13 for comparing lengths 2: 1 ft != 1 yd
     */
    @Test
    public void given1FeetAnd1YardWhenCompared_shouldReturnFalse() {
        double value1 = quantityMeasurement.unitComparison(Units.FEET, 1.0);
        double value2 = quantityMeasurement1.unitComparison(Units.YARD, 1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    /*
      TC 1.13 for comparing lengths 3: 1 in != 1 yd
     */
    @Test
    public void given1InchAnd1YardWhenCompared_shouldReturnFalse() {
        double value1 = quantityMeasurement.unitComparison(Units.INCH, 1.0);
        double value2 = quantityMeasurement1.unitComparison(Units.YARD, 1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

}
