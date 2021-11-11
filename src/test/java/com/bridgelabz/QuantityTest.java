package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.junit.Test;

public class QuantityTest {
    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotSame(feet1, feet2);
    }

    @Test
    public void given0FeetandNullFeet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assert.assertNotSame(feet1, feet2);
    }

    @Test
    public void givenFeetandFeetFromSameRef_WhenEqual_ShouldReturnTrue() {
        Feet feet1 = new Feet(0);
        boolean result = feet1 == feet1;
        Assert.assertTrue(result);
    }

    @Test
    public void given0Feetand0FeetFromDifferentType_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0);
        Assert.assertNotSame(feet1, feet2);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotSame(inch1, inch2);
    }

    @Test
    public void given0InchandNullInch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = null;
        Assert.assertNotSame(inch1, inch2);
    }

    @Test
    public void givenInchandInchFromSameRef_WhenEqual_ShouldReturnTrue() {
        Inch inch1 = new Inch(0);
        boolean result = inch1 == inch1;
        Assert.assertTrue(result);
    }

    @Test
    public void given0Inchand0InchFromDifferentType_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0);
        Assert.assertNotSame(inch1, inch2);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET, 3.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturnTrue() {
        Length inch = new Length(Length.Unit.INCH, 36.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnTrue() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length inch = new Length(Length.Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnTrue() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length feet = new Length(Length.Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5Cm_WhenCompared_ShouldReturnEqualLength() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length cm = new Length(Length.Unit.CENTI_METER, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        Length inch1 = new Length(Length.Unit.INCH, 2.0);
        Length inch2 = new Length(Length.Unit.INCH, 2.0);
        Length expectedSum = new Length(Length.Unit.INCH, 4.0);
        Length actualSum = inch1.sumOfLength(inch2);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length expectedSum = new Length(Length.Unit.INCH, 14.0);
        Length actualSum = feet.sumOfLength(inch);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Length expectedSum = new Length(Length.Unit.INCH, 24.0);
        Length actualSum = feet1.sumOfLength(feet2);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given2Inch2$5Cm_WhenAdded_ShouldReturn3Inch() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length cm = new Length(Length.Unit.CENTI_METER, 2.5);
        Length expectedSum = new Length(Length.Unit.INCH, 3.0);
        Length actualSum = inch.sumOfLength(cm);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given0GallonAnd0Gallon_ShouldReturnEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    public void given1GallonAnd2Gallon_ShouldReturnNotEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 2.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given1GallonAndNull_ShouldReturnNotEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given1GallonAnd1GallonFromDiffRef_ShouldReturnNotEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 1.0);
        Assertions.assertNotSame(gallon1, gallon2);
    }

    @Test
    public void give0LiterAnd0Liter_ShouldReturnEqualVolume() {
        Volume liter1 = new Volume(Volume.Unit.LITER, 0.0);
        Volume liter2 = new Volume(Volume.Unit.LITER, 0.0);
        Assertions.assertEquals(liter1, liter2);
    }

    @Test
    public void give1LiterAnd2Liter_ShouldReturnNotEqualVolume() {
        Volume liter1 = new Volume(Volume.Unit.LITER, 1.0);
        Volume liter2 = new Volume(Volume.Unit.LITER, 2.0);
        Assertions.assertNotEquals(liter1, liter2);
    }

    @Test
    public void given1LitreAndNull_ShouldReturnNotEqualVolume() {
        Volume litre1 = new Volume(Volume.Unit.LITER, 1.0);
        Volume litre2 = null;
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void given0GallonAnd0Liter_WhenCompared_ShouldReturnEqualVolume() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 0.0);
        Volume liter = new Volume(Volume.Unit.LITER, 0.0);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd1Liter_WhenCompared_ShouldReturnNotEqualVolume() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1GallonAnd3$78Liter_WhenCompared_ShouldReturnEqualVolume() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        Volume liter = new Volume(Volume.Unit.LITER, 3.78);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given3$78LiterAnd1Gallon_WhenCompared_ShouldReturnEqualVolume() {
        Volume liter = new Volume(Volume.Unit.LITER, 3.78);
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        boolean compareCheck = liter.compare(gallon);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1LiterAnd1000MilliLiter_WhenCompared_ShouldReturnEqualVolume() {
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        Volume ml = new Volume(Volume.Unit.MILLI_LITER, 1000.0);
        boolean compareCheck = liter.compare(ml);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1000MilliLiterAnd1Liter_WhenCompared_ShouldReturnEqualVolume() {
        Volume ml = new Volume(Volume.Unit.MILLI_LITER, 1000.0);
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        boolean compareCheck = ml.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3$78Liter_WhenAdded_ShouldReturn7$57Liter() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        Volume liter = new Volume(Volume.Unit.LITER, 3.78);
        Volume expectedSum = new Volume(Volume.Unit.LITER, 7.56);
        Volume actualSum = gallon.sumOfVolume(liter);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given1LiterAnd1000MilliLiter_WhenAdded_ShouldReturn2Liter() {
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        Volume ml = new Volume(Volume.Unit.MILLI_LITER, 1000.0);
        Volume expectedSum = new Volume(Volume.Unit.LITER, 2.0);
        Volume actualSum = liter.sumOfVolume(ml);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given0GramAnd0Gram_ShouldReturnEqualWeight() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM, 0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    public void given0GramAnd1Gram_ShouldReturnNotEqualWeight() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given1KGAnd1000Gram_WhenCompared_ShouldReturnEqualWeight() {
        Weight kg = new Weight(Weight.Unit.KILOGRAM, 1.0);
        Weight gram = new Weight(Weight.Unit.GRAM, 1000.0);
        boolean compareCheck = kg.compare(gram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000KG_WhenCompared_ShouldReturnEqualWeight() {
        Weight tonne = new Weight(Weight.Unit.TONNE, 1.0);
        Weight kg = new Weight(Weight.Unit.KILOGRAM, 1000.0);
        boolean compareCheck = tonne.compare(kg);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Gram_WhenAdded_ShouldReturn1001KG() {
        Weight tonne = new Weight(Weight.Unit.TONNE, 1.0);
        Weight gram = new Weight(Weight.Unit.GRAM, 1000.0);
        Weight expectedSum = new Weight(Weight.Unit.KILOGRAM, 1001.0);
        Weight actualSum = tonne.sumOfWeight(gram);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given0FahrenheitAnd0Fahrenheit_ShouldReturnEqualTemperature() {
        Temperature temp1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temp2 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Assertions.assertEquals(temp1, temp2);
    }

}
