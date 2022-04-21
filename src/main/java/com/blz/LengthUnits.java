package com.blz;

public enum LengthUnits implements Units{
    FEET(30), INCH(2.5), YARD(90), CM(1);

    public double unit;

    LengthUnits(double units) {

        this.unit = units;
    }

    @Override
    public double unitConversion(double value) {
        return unit*value;
    }
}
