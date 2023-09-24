package es.upm.miw.iwvg_devops.code;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    @Test
    void getNumerator() {
        Fraction fraction = new Fraction(3, 4);
        assertEquals(3, fraction.getNumerator());
    }

    @Test
    void setNumerator() {
        Fraction fraction = new Fraction(2, 5);
        fraction.setNumerator(7);
        assertEquals(7, fraction.getNumerator());
    }

    @Test
    void getDenominator() {
        Fraction fraction = new Fraction(2, 3);
        assertEquals(3, fraction.getDenominator());
    }

    @Test
    void setDenominator() {
        Fraction fraction = new Fraction(4, 7);
        fraction.setDenominator(9);
        assertEquals(9, fraction.getDenominator());
    }

    @Test
    void decimal() {
        Fraction fraction = new Fraction(1, 2);
        assertEquals(0.5, fraction.decimal(), 0.0001);
    }

    @Test
    void isProper() {
        Fraction properFraction = new Fraction(3, 4);
        Fraction improperFraction = new Fraction(5, 3);

        assertTrue(properFraction.isProper());
        assertFalse(improperFraction.isProper());
    }

    @Test
    void isImproper() {
        Fraction properFraction = new Fraction(3, 4);
        Fraction improperFraction = new Fraction(5, 3);

        assertFalse(properFraction.isImproper());
        assertTrue(improperFraction.isImproper());
    }

    @Test
    void isEquivalent() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(2, 4);
        Fraction fraction3 = new Fraction(3, 5);

        assertTrue(fraction1.isEquivalent(fraction2));
        assertFalse(fraction1.isEquivalent(fraction3));
    }

    @Test
    void add() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction result = fraction1.add(fraction2);

        assertEquals(5, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @Test
    void multiply() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction result = fraction1.multiply(fraction2);

        assertEquals(3, result.getNumerator());
        assertEquals(8, result.getDenominator());
    }

    @Test
    void divide() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction result = fraction1.divide(fraction2);

        assertEquals(2, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test
    void testToString() {
        Fraction fraction = new Fraction(3, 4);
        assertEquals("Fraction{numerator=3, denominator=4}", fraction.toString());
    }
}
