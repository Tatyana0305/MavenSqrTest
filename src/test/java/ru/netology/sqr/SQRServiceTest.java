package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"'bottom, ceil', 300, 500, 5", "'bottom, ceil', 200, 300, 3"})
    void shouldCounter(String testName, int bottom, int ceil, int expected) {
        SQRService SQRService = new SQRService();
        int actual = SQRService.counter(bottom, ceil);

        assertEquals(expected, actual);
    }
}