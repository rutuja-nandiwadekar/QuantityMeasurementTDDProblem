package com.blz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementLengthTest {

    private QuantityMeasurement quantityMeasurement;
    private QuantityMeasurement quantityMeasurement1;
    private QuantityMeasurementLengthTest quantityMeasurementTestRefactor;
    static double value1;
    static double value2;
    @Before
    public void init(){
        quantityMeasurement = new QuantityMeasurement();
        quantityMeasurement1 = new QuantityMeasurement();
        quantityMeasurementTestRefactor = new QuantityMeasurementLengthTest();
    }

    //UC1
    //test case for Feet
    /*
      TC 1.1 to check equality of 2 feet variables
    */
    @Test

    public void given0FeetAnd0Feet_ShouldReturnEqual()  {
        value1 = quantityMeasurement.unitConversion(LengthUnits.FEET, 0.0);
        value2 = quantityMeasurement.unitConversion(LengthUnits.FEET, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        value1 = quantityMeasurement.unitConversion(LengthUnits.FEET, 0.0);
        value2 = quantityMeasurement.unitConversion(LengthUnits.FEET, 1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    /*
      TC 1.2 to check equality of null
    */
    @Test
    public void givenNullFeetValue_shouldReturnFalse() {
        value1 = quantityMeasurement.unitConversion(LengthUnits.FEET,0.0);
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
        value1 = quantityMeasurement.unitConversion(LengthUnits.FEET, 0.0);
       value2 = quantityMeasurement1.unitConversion(LengthUnits.FEET, 0.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenDifferentValues_shouldReturnNotEqual() {
        value1 = quantityMeasurement.unitConversion(LengthUnits.FEET, 0.0);
        value2 = quantityMeasurement1.unitConversion(LengthUnits.FEET, 1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    //test case for Inch
    /*
      TC 1.6 to check equality of 2 inch variables
    */
    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        value1 = quantityMeasurement.unitConversion(LengthUnits.INCH, 0.0);
        value2 = quantityMeasurement.unitConversion(LengthUnits.INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        value1 = quantityMeasurement.unitConversion(LengthUnits.INCH, 0.0);
        value2 = quantityMeasurement.unitConversion(LengthUnits.INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
     TC 1.7 to check equality of null
   */
    @Test
    public void givenNullInchValue_shouldReturnFalse() {
        value1 = quantityMeasurement.unitConversion(LengthUnits.INCH,0.0);
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
        value1 = quantityMeasurement.unitConversion(LengthUnits.INCH, 0.0);
        value2 = quantityMeasurement1.unitConversion(LengthUnits.INCH, 0.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenDifferentInchValues_shouldReturnNotEqual() {
        value1 = quantityMeasurement.unitConversion(LengthUnits.INCH, 0.0);
        value2 = quantityMeasurement1.unitConversion(LengthUnits.INCH, 1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }


    //UC2
    /*
      TC 1.11 for comparing lengths of 2 yard variables
     */

    @Test
    public void given0YardAnd0YardWhenCompared_shouldReturnTrue() {
        value1 = quantityMeasurement.unitConversion(LengthUnits.YARD, 0.0);
        value2 = quantityMeasurement1.unitConversion(LengthUnits.YARD, 0.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void given0YardAnd1YardWhenCompared_shouldReturnFalse() {
        value1 = quantityMeasurement.unitConversion(LengthUnits.YARD, 0.0);
        value2 = quantityMeasurement1.unitConversion(LengthUnits.YARD, 1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    /*
      TC 1.12 for comparing lengths 1: 3ft = 1yd
     */
    @Test
    public void given3FeetAnd1YardWhenCompared_shouldReturnTrue() {
        value1 = quantityMeasurement.unitConversion(LengthUnits.FEET, 3.0);
        value2 = quantityMeasurement1.unitConversion(LengthUnits.YARD, 1.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    /*
      TC 1.13 for comparing lengths 2: 1 ft != 1 yd
     */
    @Test
    public void given1FeetAnd1YardWhenCompared_shouldReturnFalse() {
        value1 = quantityMeasurement.unitConversion(LengthUnits.FEET, 1.0);
        value2 = quantityMeasurement1.unitConversion(LengthUnits.YARD, 1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    /*
      TC 1.13 for comparing lengths 3: 1 in != 1 yd
     */
    @Test
    public void given1InchAnd1YardWhenCompared_shouldReturnFalse() {
        value1 = quantityMeasurement.unitConversion(LengthUnits.INCH, 1.0);
        value2 = quantityMeasurement1.unitConversion(LengthUnits.YARD, 1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    /*
      TC 1.14 for comparing lengths 4: 1 yd = 36 in
     */
    @Test
    public void given1YardAnd36InchWhenCompared_shouldReturnTrue() {
        value2 = quantityMeasurement1.unitConversion(LengthUnits.YARD, 1.0);
        value1 = quantityMeasurement.unitConversion(LengthUnits.INCH, 36.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    /*
      TC 1.15 for comparing lengths 5: 36 in = 1 yd
     */
    @Test
    public void given36InchAnd1YardWhenCompared_shouldReturnTrue() {
        value1 = quantityMeasurement.unitConversion(LengthUnits.INCH, 36.0);
        value2 = quantityMeasurement1.unitConversion(LengthUnits.YARD, 1.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    /*
      TC 1.16 for comparing lengths 6: 1 yd = 3 ft
     */
    @Test
    public void given1Yard3FeetWhenCompared_shouldReturnTrue() {
        value2 = quantityMeasurement1.unitConversion(LengthUnits.YARD, 1.0);
        value1 = quantityMeasurement.unitConversion(LengthUnits.FEET, 3.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    //UC3
    /*
      TC 1.17 for comparing lengths 2 cm variables
     */
    @Test
    public void given1CMAnd1CMWhenCompared_shouldReturnTrue() {
        value2 = quantityMeasurement1.unitConversion(LengthUnits.CM, 1.0);
        value1 = quantityMeasurement.unitConversion(LengthUnits.CM, 1.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void given1CMAnd0CMWhenCompared_shouldReturnFalse() {
        value1 = quantityMeasurement1.unitConversion(LengthUnits.CM, 0.0);
        value2 = quantityMeasurement.unitConversion(LengthUnits.CM, 1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    /*
       TC 1.18 for comparing lengths 1in != 1cm
     */
    @Test
    public void given1InchAnd1CMWhenCompared_shouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(LengthUnits.INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(LengthUnits.CM, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
       TC 1.19 for comparing lengths 2in = 5cm
     */
    @Test
    public void given2InchAnd5CMWhenCompared_shouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(LengthUnits.INCH, 2.0);
        double value2 = quantityMeasurement.unitConversion(LengthUnits.CM, 5.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /*
       TC 1.20 for comparing lengths 1yd != 1cm
     */
    @Test
    public void given1YardAnd1CMWhenCompared_shouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(LengthUnits.YARD, 1.0);
        double value2 = quantityMeasurement.unitConversion(LengthUnits.CM, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
       TC 1.21 for comparing lengths 1ft != 1cm
     */
    @Test
    public void given1FeetAnd1CMWhenCompared_shouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(LengthUnits.FEET, 1.0);
        double value2 = quantityMeasurement.unitConversion(LengthUnits.CM, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
       TC 1.22 for comparing lengths 1 ft = 30cm
     */
    @Test
    public void given1FeetAnd30CMWhenCompared_shouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(LengthUnits.FEET, 1.0);
        double value2 = quantityMeasurement.unitConversion(LengthUnits.CM, 30.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /*
       TC 1.23 for comparing lengths 1 yd = 90cm
     */
    @Test
    public void given1YardAnd90CMWhenCompared_shouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(LengthUnits.YARD, 1.0);
        double value2 = quantityMeasurement.unitConversion(LengthUnits.CM, 90.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //UC4
    /*
       TC 1.24 to add two lengths in inches 2 in + 2 in = 4 in
    */
    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturnCorrect() {
        value1 = quantityMeasurement.unitAddition(LengthUnits.INCH, 2.0, LengthUnits.INCH, 2.0);
        value2= quantityMeasurement.unitConversion(LengthUnits.INCH, 4);
        Assert.assertEquals(value1, value2,0.0);
    }

    /*
       TC 1.25 to add two lengths in inches 1 ft + 2 in = 14 in
    */
    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturnCorrect() {
        value1 = quantityMeasurement.unitAddition(LengthUnits.FEET, 1.0, LengthUnits.INCH, 2.0);
        value2= quantityMeasurement.unitConversion(LengthUnits.INCH, 14);
        Assert.assertEquals(value1, value2,0.0);
    }

    /*
       TC 1.26 to add two lengths in inches 1 ft + 1 ft = 24 in
    */
    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturnCorrect() {
        value1 = quantityMeasurement.unitAddition(LengthUnits.FEET, 1.0, LengthUnits.FEET, 1.0);
        value2= quantityMeasurement.unitConversion(LengthUnits.INCH, 24);
        Assert.assertEquals(value1, value2,0.0);
    }

    /*
       TC 1.27 to add two lengths in inches 2 in + 2.5 cm = 3 in
    */
    @Test
    public void given2InchAnd2CM_WhenAdded_ShouldReturnCorrect() {
        value1 = quantityMeasurement.unitAddition(LengthUnits.INCH, 2.0, LengthUnits.CM, 2.5);
        value2= quantityMeasurement.unitConversion(LengthUnits.INCH, 3);
        Assert.assertEquals(value1, value2,0.0);
    }
}
