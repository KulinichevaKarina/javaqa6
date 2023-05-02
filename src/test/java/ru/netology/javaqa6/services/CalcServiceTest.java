package ru.netology.javaqa6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/CalcServiseTestResource.csv")
    public void testCalculationCase1(int income, int expenses, int threshold, int result) {
        CalcService service = new CalcService();

        Assertions.assertEquals(result, service.calculate(income, expenses, threshold));
    }

}
