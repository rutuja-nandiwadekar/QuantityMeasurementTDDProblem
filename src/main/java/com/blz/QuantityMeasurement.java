package com.blz;

public class QuantityMeasurement {
    double feet;
    double inch;
    double yard;


    public double unitComparison(Units units, double value) {
        return value * units.unit;
    }
}
