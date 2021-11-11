package com.bridgelabz;

public class Temperature {
    public enum Unit {CELSIUS, FAHRENHEIT}
    private final Unit unit;
    private final double temp;
    public Temperature(Unit unit, double temp) {
        this.unit = unit;
        this.temp = temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(that.temp, temp) == 0 && unit == that.unit;
    }

}
