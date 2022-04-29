package by.itstep.khodosevich.thirteenstage.task05;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.thirteenstage.task05.module.logic.AscendDescendArray.*;

public class AscendDescendArrayTest {
    private static double[] arrayAscend;
    private static double[] arrayDescend;
    private static double[] arrayBasic;
    private static String messageError;

    static {
        arrayAscend = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrayDescend = new double[]{9, 8, 7, 6, 6, 5, 4, 3, 2, 1};
        arrayBasic = new double[]{1, 6, 7, 3, 8, 2, 5};
        messageError = "Your method works bad!!!";
    }

    @Test
    public void testIsAscendArrayPositiveTrue() {
        boolean actual = isAscendArray(arrayAscend);
        assertTrue(messageError, actual);
    }

    @Test
    public void testIsAscendArrayPositiveFalse() {
        boolean actual = isAscendArray(arrayBasic);
        assertFalse(messageError, actual);
    }

    @Test
    public void testIsAscendArrayNegativeWithNull() {
        boolean actual = isAscendArray(null);
        assertFalse(messageError, actual);
    }

    @Test
    public void testIsAscendArrayNegativeWithZero() {
        boolean actual = isAscendArray(new double[0]);
        assertFalse(messageError, actual);
    }

    @Test
    public void testIsDescendArrayPositiveTrue() {
        boolean actual = isDescendArray(arrayDescend);
        assertTrue(messageError, actual);
    }

    @Test
    public void testIsDescendArrayPositiveFalse() {
        boolean actual = isDescendArray(arrayBasic);
        assertFalse(messageError, actual);
    }

    @Test
    public void testIsDescendArrayNegativeWithNull() {
        boolean actual = isDescendArray(null);
        assertFalse(messageError, actual);
    }

    @Test
    public void testIsDescendArrayNegativeWithZero() {
        boolean actual = isDescendArray(new double[0]);
        assertFalse(messageError, actual);
    }

}
