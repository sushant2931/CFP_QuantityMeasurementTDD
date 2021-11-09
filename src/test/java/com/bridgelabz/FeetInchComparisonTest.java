package com.bridgelabz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FeetInchComparisonTest {

    @Test
    public void given1FeetAnd12InchFromDiffType_ShouldReturnNotEqual() {
        Feet feet = new Feet(1.0);
        Inch inch = new Inch(12.0);
        Assertions.assertNotEquals(feet, inch);
    }
}
