package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class VacationTest {
    @ParameterizedTest
    @CsvSource({
            "10000,3000,20000,3",
            "100000,60000,150000,2"
    })
    public void TestVacation(int income, int expenses, int threshold, int months) {
        Vacation service = new Vacation();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(months, actual);


    }
}