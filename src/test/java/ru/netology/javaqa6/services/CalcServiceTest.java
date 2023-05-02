package ru.netology.javaqa6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcServiceTest {
    @Test
    public void testCalculationCase1() {
        CalcService service = new CalcService();

        Assertions.assertEquals(3, service.calculate(10_000, 3_000, 20_000));
    }
    @Test
    public void testCalculationCase2() {
        CalcService service = new CalcService();

        Assertions.assertEquals(2, service.calculate(100_000, 60_000, 150_000));
    }

}
