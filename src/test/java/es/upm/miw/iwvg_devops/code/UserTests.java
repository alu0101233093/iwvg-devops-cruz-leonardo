package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User("44455566A", "Leonardo", "Cruz", new ArrayList<>());
    }

    @Test
    void getId() {
        assertEquals("44455566A", user.getId());
    }

    @Test
    void getName() {
        assertEquals("Leonardo", user.getName());
    }

    @Test
    void setName() {
        user.setName("Alfonso");
        assertEquals("Alfonso", user.getName());
    }

    @Test
    void getFamilyName() {
        assertEquals("Cruz", user.getFamilyName());
    }

    @Test
    void setFamilyName() {
        user.setFamilyName("Rodríguez");
        assertEquals("Rodríguez", user.getFamilyName());
    }

    @Test
    void getFractions() {
        ArrayList<Fraction> expectedFractions = new ArrayList<>();
        assertEquals(expectedFractions, user.getFractions());
    }

    @Test
    void setFractions() {
        ArrayList<Fraction> testFractions = new ArrayList<>();
        testFractions.add(new Fraction(1, 2));
        testFractions.add(new Fraction(3, 4));

        user.setFractions(testFractions);
        assertEquals(testFractions, user.getFractions());
    }

    @Test
    void addFraction() {
        Fraction fraction = new Fraction(1, 3);

        user.addFraction(fraction);

        assertEquals(1, user.getFractions().size());
        assertEquals(fraction, user.getFractions().get(0));
    }

    @Test
    void fullName() {
        assertEquals("Leonardo Cruz", user.fullName());
    }

    @Test
    void initials() {
        assertEquals("L.", user.initials());
    }

    @Test
    void testToString() {
        String expectedToString = "User{id='44455566A', name='Leonardo', familyName='Cruz', fractions=[]}";
        assertEquals(expectedToString, user.toString());
    }
}