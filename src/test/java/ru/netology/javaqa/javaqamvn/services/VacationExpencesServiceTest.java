package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationExpencesServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/money.csv")
    public void shouldCalculateVacationAmount(int income, int expenses, int threshold, int expected) {
        VacationExpencesService service = new VacationExpencesService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
