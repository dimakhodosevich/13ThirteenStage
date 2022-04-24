package by.itstep.khodosevich.thirteenstage.task02;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.thirteenstage.task02.module.logic.Extreme.*;

public class ExtremeTest {

    private double[] actual_arrayDifNumbers;
    private double[] actual_arraySameNumbers;
    private static double[] expected_arrayDifNumbers;
    private static double[] expected_arraySameNumbers;
    private static int expected_null;
    private static int expected_zero;
    private static double delta;

    static {
        delta = 0.001;
        expected_null = Integer.MIN_VALUE;
        expected_zero = Integer.MIN_VALUE + 1;
        expected_arrayDifNumbers = new double[]{3.5, -1.4, -2, 7.2, -1, 9, 17};
        expected_arraySameNumbers = new double[]{7, 7, 7, 7, 7, 7};
    }

    {
        actual_arrayDifNumbers = new double[]{3.5, -1.4, 17.0, 7.2, -1, 9, -2};
        actual_arraySameNumbers = new double[]{7, 7, 7, 7, 7, 7};
    }

    @Test
    public void testSwapFirstMaxMinElementPositiveDifElement() {
        swapFirstMaxMinElement(actual_arrayDifNumbers);
        assertArrayEquals(expected_arrayDifNumbers, actual_arrayDifNumbers, delta);
    }

    @Test
    public void testSwapFirstMaxMinElementPositiveSameElement() {
        swapFirstMaxMinElement(actual_arraySameNumbers);
        assertArrayEquals(expected_arraySameNumbers, actual_arraySameNumbers, delta);
    }

    @Test
    public void testSwapFirstMaxMinElementNegativeWithNull() {
        int actualError = swapFirstMaxMinElement(null);
        assertEquals(expected_null, actualError);
    }

    @Test
    public void testSwapFirstMaxMinElementNegativeWithZeroLength() {
        int actualError = swapFirstMaxMinElement(new double[0]);
        assertEquals(expected_zero, actualError);
    }
}
