package com.blz;

public class QuantityMeasurement {
    double feet;
    double inch;
    double yard;


    public double unitComparison(Units units, double value) {
        return value * units.unit;
    }




    public double unitAddition(Units unit1, double value1, Units unit2, double value2) {
        return unitComparison(unit1,value1)+ unitComparison(unit2,value2);

    }
}
