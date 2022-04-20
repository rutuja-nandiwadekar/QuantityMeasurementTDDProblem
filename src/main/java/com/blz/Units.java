package com.blz;

public enum Units {
    FEET(30.48), INCH(2.5), YARD(90), CM(1);

    public double unit;

    Units(double units) {
        this.unit = units;
    }
}
