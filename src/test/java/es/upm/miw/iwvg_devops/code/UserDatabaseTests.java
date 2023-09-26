package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserDatabaseTests {

    private UsersDatabase database;

    @BeforeEach
    void before() {
        database = new UsersDatabase();
    }

    @Test
    void testFindUserIdBySomeProperFraction() {
        List<String> result = database.findUserIdBySomeProperFraction()
                .collect(Collectors.toList());

        assertEquals(List.of("1", "2", "3", "5"), result);
    }

    @Test
    void testfindDecimalImproperFractionByUserName() {
        List<Double> result = database.findDecimalImproperFractionByUserName("Ana")
                .collect(Collectors.toList());

        assertEquals(List.of(2.0, (double) 4/3), result);
    }

    @Test
    void findDecimalFractionByUserName() {
        List<Double> result = database.findDecimalFractionByUserName("Oscar")
                .collect(Collectors.toList());

        assertEquals(List.of(0.0, 1.0, 2.0, 0.2, -0.5, 0.5, 1.0), result);
    }

    @Test
    void testFindUserIdByAllProperFraction() {
        List<String> result = database.findUserIdByAllProperFraction()
                .collect(Collectors.toList());

        assertEquals(List.of(), result);
    }

}
