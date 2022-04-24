package by.itstep.khodosevich.thirteenstage.task01;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.thirteenstage.task01.module.logic.Extreme.*;

public class ExtremeFindMaxTest {
    private static double[] actual_arrayDifNumbers;
    private static double[] actual_arraySameNumbers;
    private static double expected_difNumber;
    private static double expected_sameNumber;
    private static int expected_null;
    private static int expected_zero;
    private static double delta;

    static {
        actual_arrayDifNumbers = new double[]{3.5, -1.4, 17.0, 7.2, -1, 9, -2};
        actual_arraySameNumbers = new double[]{7, 7, 7, 7, 7, 7};
        expected_difNumber = 17.0;
        expected_sameNumber = 7.0;
        expected_null = Integer.MIN_VALUE;
        expected_zero = Integer.MIN_VALUE + 1;
        delta = 0.001;
    }

    @Test
    public void testFindIndexMaxElementPositiveDifNumbers() {
        int actual_maxIndex = findIndexMaxElement(actual_arrayDifNumbers);
        assertEquals(expected_difNumber, actual_arrayDifNumbers[actual_maxIndex], delta);
    }

    @Test
    public void testFindIndexMaxElementPositiveSameNumbers() {
        int actual_maxIndex = findIndexMaxElement(actual_arraySameNumbers);
        assertEquals(expected_sameNumber, actual_arraySameNumbers[actual_maxIndex], delta);
    }

    @Test
    public void testFindIndexMaxElementNegativeWithNull() {
        int actual_maxIndex = findIndexMaxElement(null);
        assertEquals(expected_null, actual_maxIndex);
    }

    @Test
    public void testFindIndexMaxElementNegativeWithZeroLength() {
        int actual_maxIndex = findIndexMaxElement(new double[0]);
        assertEquals(expected_zero, actual_maxIndex);
    }

}
