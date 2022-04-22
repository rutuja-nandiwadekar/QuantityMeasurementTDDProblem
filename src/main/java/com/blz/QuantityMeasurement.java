package com.blz;

public class QuantityMeasurement {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    public double unitConversion(Units units, double value) {
        return units.unitConversion(value);
    }


    public double unitAddition(Units unit1, double value1, Units unit2, double value2) {
        return unit1.unitConversion(value1)+ unit2.unitConversion(value2);

    }
}
