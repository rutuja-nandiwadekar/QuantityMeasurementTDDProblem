package com.blz;

public class QuantityMeasurement {
    double feet;
    double inch;


    public double unitComparison(Units units, double value) {
        return value * units.unit;
    }
}
