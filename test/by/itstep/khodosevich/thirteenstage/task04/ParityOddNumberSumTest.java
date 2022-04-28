package by.itstep.khodosevich.thirteenstage.task04;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.thirteenstage.task04.module.logic.ParityOddNumber.*;

public class ParityOddNumberSumTest {
    private static double[] array;
    private static double expected;
    private static double delta;
    private static double expectedWithNull;
    private static double expectedWithZero;


    static {
        array = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        expected = 45;
        delta = 0.001;
        expectedWithNull = Integer.MIN_VALUE;
        expectedWithZero = Integer.MIN_VALUE + 1;
    }


    @Test
    public void testCalculateSumOfArrayPositive() {
        double actual = calculateSumOfArray(array);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculateSumOfArrayNegativeWithNull() {
        double actual = calculateSumOfArray(null);
        assertEquals(expectedWithNull, actual, delta);
    }

    @Test
    public void testCalculateSumOfArrayNegativeWithZero() {
        double actual = calculateSumOfArray(new double[0]);
        assertEquals(expectedWithZero, actual, delta);
    }
}
