package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'squares in the range',200,300,3",
            "'squares out of range, bottom bound',0,99,0",
            "'squares in the range, on the border',100,400,11",
            "'squares out of range, upper bound',10000,11000,0"})
    void squaresCalculator(String testname, int bottomBound, int upperBound, int expected) {
        SQRService service = new SQRService();


        int actual = service.squaresCalculator(bottomBound, upperBound);

        assertEquals(expected, actual);
    }
}