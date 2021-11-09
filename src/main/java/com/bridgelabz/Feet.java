package com.bridgelabz;

public class Feet {
    public double value;

    public Feet(double value) {
        this.value = value;
    }

    public Feet() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }

    public boolean lengthComparison(double ft, double in) {
        ft = 12 * ft;
        return ft == in;
    }
}
