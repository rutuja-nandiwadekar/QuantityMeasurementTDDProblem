package com.blz;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    /*
      TC 1.1 to check equality of 2 feet variables
    */
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    /*
      TC 1.2 to check equality of null
    */
    @Test
    public void givenNullFeetValue_shouldReturnFalse() {
        Feet feet = new Feet(0.0);
        Assert.assertNotNull(feet);
    }


    /*
       TC 1.3 to check equality of Two references
     */
    @Test
    public void givenSameReference_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0) ;
        Assert.assertSame(feet1,feet1);
    }

    @Test
    public void givenNotSameReference_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0) ;
        Assert.assertNotSame(feet2,feet1);
    }

    /*
       TC 1.4 to check equality of 2 types
     */
    @Test
    public void giveSameTypes_shouldReturnEqual() {
        Feet feet1 = new Feet();
        Feet feet2 = new Feet();
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void giveDifferentTypes_shouldReturnNotEqual() {
        Feet feet = new Feet();
        Inch inch = new Inch();
        Assert.assertNotEquals(feet,inch);
    }

    /*
       TC 1.5 to check equality of 2 values
     */
    @Test
    public void givenSameValues_shouldReturnEqual() {
        Feet feet1 = new Feet();
        feet1.setValue(50);
        Feet feet2 = new Feet();
        feet2.setValue(50);
        Assert.assertEquals(feet1.getValue(),feet2.getValue(),0.0);
    }
    @Test
    public void givenDifferentValues_shouldReturnNotEqual() {
        Feet feet1 = new Feet();
        feet1.setValue(9);
        Feet feet2 = new Feet();
        feet2.setValue(10);
        Assert.assertNotEquals(feet1.getValue(),feet2.getValue(),0.0);
    }
}

