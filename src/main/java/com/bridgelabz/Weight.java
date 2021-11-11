package com.bridgelabz;

public class Weight {
    enum Unit {KILOGRAM, TONNE, GRAM}

    private final Unit unit;
    private final double value;

    public Weight(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Weight weight = (Weight) that;
        return Double.compare(weight.value, value) == 0 && unit == weight.unit;
    }
}
