package com.blz;

public enum Units {
    FEET(12), INCH(1);

    public double unit;

    Units(double units) {
        this.unit = units;
    }
}
