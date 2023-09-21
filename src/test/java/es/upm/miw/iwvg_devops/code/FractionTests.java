package es.upm.miw.iwvg_devops.code;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void testToString() {
        Fraction fraction = new Fraction(3, 4);
        assertEquals("Fraction{numerator=3, denominator=4}", fraction.toString());
    }
}
