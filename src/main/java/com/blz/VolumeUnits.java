package com.blz;

public enum VolumeUnits implements Units {
    GALLON(3.78*1000), LITRE(1000), MILLILITER(1);

   public double unit;


    VolumeUnits(double units) {
        this.unit=units;
    }


    @Override
    public double unitConversion(double value) {
        return unit*value;
    }
}
