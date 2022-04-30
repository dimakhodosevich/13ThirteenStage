package by.itstep.khodosevich.thirteenstage.task10;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.thirteenstage.task10.module.logic.ParityAndPositiveNumber.*;

public class ParityAndPositiveNumberTest {
    private static double[] array;
    private static double errorWIthNull;
    private static double errorWithZeroLength;
    private static double expected;
    private static double delta;


    static {
        array = new double[]{1, 2, -3, 4, 5, 6, 7};
        delta = 0.001;
        expected = 13.0;
        errorWIthNull = Integer.MIN_VALUE;
        errorWithZeroLength = Integer.MIN_VALUE + 1;
    }

    @Test
    public void testGetSumParityAndPositiveElementsInArray() {
        double actual = getSumParityAndPositiveElementsInArray(array);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testGetSumParityAndPositiveElementsInArrayNegativeWithNull() {
        double actual = getSumParityAndPositiveElementsInArray(null);
        assertEquals(errorWIthNull, actual, delta);
    }

    @Test
    public void testGetSumParityAndPositiveElementsInArrayNegativeWithZeroLength() {
        double actual = getSumParityAndPositiveElementsInArray(new double[0]);
        assertEquals(errorWithZeroLength, actual, delta);
    }

}
