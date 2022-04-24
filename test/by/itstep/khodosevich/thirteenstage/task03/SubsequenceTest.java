package by.itstep.khodosevich.thirteenstage.task03;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.thirteenstage.task03.module.logic.Subsequence.*;
import static by.itstep.khodosevich.thirteenstage.task01.module.logic.Extreme.*;

public class SubsequenceTest {

    private static double[] actual_arrayDifNumbers;
    private static double[] actual_arraySameNumbers;
    private static double expected_difNumber;
    private static int expected_null;
    private static int expected_zero;
    private static int expected_sameNumbers;
    private static double delta;

    static {
        actual_arrayDifNumbers = new double[]{3.5, -1.4, 17.0, 7.2, -1, 9, -2};
        actual_arraySameNumbers = new double[]{7, 7, 7, 7, 7, 7};
        expected_difNumber = 2.1;
        expected_null = Integer.MIN_VALUE;
        expected_zero = Integer.MIN_VALUE + 1;
        expected_sameNumbers = Integer.MIN_VALUE + 2;
        delta = 0.001;
    }

    @Test
    public void testGetSumSubsequencePositiveWithDifElement() {
        double actual = getSumSubsequence(actual_arrayDifNumbers);
        assertEquals(expected_difNumber, actual, delta);
    }

    @Test
    public void testGetSumSubsequencePositiveWithSameElement() {
        double actual = getSumSubsequence(actual_arraySameNumbers);
        assertEquals(expected_sameNumbers, actual, delta);
    }

    @Test
    public void testGetSumSubsequenceNegativeWithNull() {
        double actual = getSumSubsequence(null);
        assertEquals(expected_null, actual, delta);
    }

    @Test
    public void testGetSumSubsequenceNegativeWithZero() {
        double actual = getSumSubsequence(new double[0]);
        assertEquals(expected_zero, actual, delta);
    }

}
