package by.itstep.khodosevich.thirteenstage.task04;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.thirteenstage.task04.module.logic.ParityOddNumber.*;

public class ParityOddNumberParityTest {
    private static double[] arrayWithAllParityNumber;
    private static double[] arrayWithoutParityNumber;
    private static double expectedAllParity;
    private static double expectedWithoutParity;
    private static double delta;
    private static double expectedWithNull;
    private static double expectedWithZero;


    static {
        arrayWithAllParityNumber = new double[]{2, 4, 6, 8, 12, 14};
        arrayWithoutParityNumber = new double[]{3, 5, 7, 1, 11};
        expectedAllParity = 46;
        expectedWithoutParity = 0;
        delta = 0.001;
        expectedWithNull = Integer.MIN_VALUE;
        expectedWithZero = Integer.MIN_VALUE + 1;
    }

    @Test
    public void testCalculateSumOfParityNumberPositiveAllParity() {
        double actual = calculateSumOfParityNumber(arrayWithAllParityNumber);
        assertEquals(expectedAllParity, actual, delta);
    }

    @Test
    public void testCalculateSumOfParityNumberPositiveWithoutParity() {
        double actual = calculateSumOfParityNumber(arrayWithoutParityNumber);
        assertEquals(expectedWithoutParity, actual, delta);
    }

    @Test
    public void testCalculateSumOfParityNumberNegativeWithNull() {
        double actual = calculateSumOfParityNumber(null);
        assertEquals(expectedWithNull, actual, delta);
    }

    @Test
    public void testCalculateSumOfParityNumberNegativeWithZero() {
        double actual = calculateSumOfParityNumber(new double[0]);
        assertEquals(expectedWithZero, actual, delta);
    }

}
