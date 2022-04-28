package by.itstep.khodosevich.thirteenstage.task04;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.thirteenstage.task04.module.logic.ParityOddNumber.*;

public class ParityOddNumberOddTest {
    private static double[] arrayWithAllOddNumber;
    private static double[] arrayWithoutOddNumber;
    private static double expectedAllOdd;
    private static double expectedWithoutOdd;
    private static double delta;
    private static double expectedWithNull;
    private static double expectedWithZero;


    static {
        arrayWithAllOddNumber = new double[]{3, 5, 7, 1, 11};
        arrayWithoutOddNumber = new double[]{2, 4, 6, 8, 10};
        expectedAllOdd = 27;
        expectedWithoutOdd = 0;
        delta = 0.001;
        expectedWithNull = Integer.MIN_VALUE;
        expectedWithZero = Integer.MIN_VALUE + 1;
    }

    @Test
    public void testCalculateSumOfParityNumberPositiveAllOdd() {
        double actual = calculateSumOfOddNumber(arrayWithAllOddNumber);
        assertEquals(expectedAllOdd, actual, delta);
    }

    @Test
    public void testCalculateSumOfParityNumberPositiveWithoutOdd() {
        double actual = calculateSumOfOddNumber(arrayWithoutOddNumber);
        assertEquals(expectedWithoutOdd, actual, delta);
    }

    @Test
    public void testCalculateSumOfParityNumberNegativeWithNull() {
        double actual = calculateSumOfOddNumber(null);
        assertEquals(expectedWithNull, actual, delta);
    }

    @Test
    public void testCalculateSumOfParityNumberNegativeWithZero() {
        double actual = calculateSumOfOddNumber(new double[0]);
        assertEquals(expectedWithZero, actual, delta);
    }

}
