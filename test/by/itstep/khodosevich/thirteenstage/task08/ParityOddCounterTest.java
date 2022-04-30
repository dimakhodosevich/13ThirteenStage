package by.itstep.khodosevich.thirteenstage.task08;

import by.itstep.khodosevich.thirteenstage.task08.module.logic.ParityOddCounter;
import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.thirteenstage.task08.module.logic.ParityOddCounter.*;

public class ParityOddCounterTest {
    private static double[] array;
    private static double expectedParity;
    private static double expectedAll;
    private static double expectedOdd;
    private static double delta;
    private static double ERROR_WITH_NULL;
    private static double ERROR_WITH_ZERO_LENGTH;


    static {
        array = new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        expectedParity = 9.0;
        expectedAll = 21.0;
        expectedOdd = 12.0;
        delta = 0.001;
        ERROR_WITH_NULL = Integer.MIN_VALUE;
        ERROR_WITH_ZERO_LENGTH = Integer.MIN_VALUE + 1;
    }

    @Test
    public void getSumOfArrayPositive() {
        double actual = ParityOddCounter.getSumOfArray(array);
        assertEquals(expectedAll, actual, delta);
    }

    @Test
    public void getSumOfArrayNegativeWithNull() {
        double actual = ParityOddCounter.getSumOfArray(null);
        assertEquals(ERROR_WITH_NULL, actual, delta);
    }

    @Test
    public void getSumOfArrayNegativeWithZero() {
        double actual = ParityOddCounter.getSumOfArray(new double[0]);
        assertEquals(ERROR_WITH_ZERO_LENGTH, actual, delta);
    }

    @Test
    public void getParitySumOfArrayPositive() {
        double actual = getParitySumOfArray(array);
        assertEquals(expectedParity, actual, delta);
    }

    @Test
    public void getParitySumOfArrayNegativeWithNull() {
        double actual = getParitySumOfArray(null);
        assertEquals(ERROR_WITH_NULL, actual, delta);
    }

    @Test
    public void getParitySumOfArrayNegativeWIthZero() {
        double actual = getParitySumOfArray(new double[0]);
        assertEquals(ERROR_WITH_ZERO_LENGTH, actual, delta);
    }

    @Test
    public void getOddSumOfArrayPositive() {
        double actual = getOddSumOfArray(array);
        assertEquals(expectedOdd, actual, delta);
    }

    @Test
    public void getOddSumOfArrayNegativeWithNull() {
        double actual = getOddSumOfArray(null);
        assertEquals(ERROR_WITH_NULL, actual, delta);
    }

    @Test
    public void getOddSumOfArrayNegativeWithZero() {
        double actual = getOddSumOfArray(new double[0]);
        assertEquals(ERROR_WITH_ZERO_LENGTH, actual, delta);
    }
}
