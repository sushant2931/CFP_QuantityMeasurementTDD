package com.bridgelabz;

public class Volume {

    enum Unit {GALLON, MILLI_LITER, LITER}
    private static final double GALLON_TO_LITER = 3.78;
    private static final double LITER_TO_ML = 1000.0;
    public final double value;
    public final Unit unit;
    public Volume(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Volume that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        if (this.unit.equals(Unit.GALLON) && that.unit.equals(Unit.LITER))
            return Double.compare(this.value * GALLON_TO_LITER, that.value) == 0;
        if (this.unit.equals(Unit.LITER) && that.unit.equals(Unit.GALLON))
            return Double.compare(this.value, that.value * GALLON_TO_LITER) == 0;
        if (this.unit.equals(Unit.LITER) && that.unit.equals(Unit.MILLI_LITER))
            return Double.compare(this.value * LITER_TO_ML, that.value) == 0;
        if (this.unit.equals(Unit.MILLI_LITER) && that.unit.equals(Unit.LITER))
            return Double.compare(this.value, that.value * LITER_TO_ML) == 0;
        return false;
    }

    public Volume sumOfVolume(Volume that) {
        double sumOfVolume = 0.0;
        if (this.unit.equals(Unit.GALLON) && that.unit.equals(Unit.LITER))
            sumOfVolume = this.value * GALLON_TO_LITER + that.value;
        if (this.unit.equals(Unit.LITER) && that.unit.equals(Unit.MILLI_LITER))
            sumOfVolume = this.value + that.value / LITER_TO_ML;
        return new Volume(Unit.LITER, sumOfVolume);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.value, value) == 0 && unit == volume.unit;

    }




}