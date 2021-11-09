package com.bridgelabz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FeetInchComparisonTest {

    @Test
    public void givenFeetAndInch_WhenEqual_ShouldReturnTrue() {
        Feet feetToInch = new Feet();
        boolean result = feetToInch.lengthComparison(1.0, 12.0);
        Assertions.assertTrue(result);
    }
}
