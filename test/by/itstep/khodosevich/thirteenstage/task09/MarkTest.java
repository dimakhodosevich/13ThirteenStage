package by.itstep.khodosevich.thirteenstage.task09;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.thirteenstage.task09.module.logic.Mark.*;


public class MarkTest {
    private static double[] marks;
    private static double[] expectedMarksStatus;
    private static double delta;
    private static final double ERROR_WITH_NULL;
    private static final double ERROR_WITH_ZERO_LENGTH;
    private static final double ERROR_WITH_BAD_MARK_SYSTEM;
    private static final int MARK_SYSTEM_TYPE;

    static {
        marks = new double[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        expectedMarksStatus = new double[]{0, 20, 20, 20, 20, 20};
        delta = 0.001;
        ERROR_WITH_NULL = Integer.MIN_VALUE;
        ERROR_WITH_ZERO_LENGTH = Integer.MIN_VALUE + 1;
        ERROR_WITH_BAD_MARK_SYSTEM = Integer.MIN_VALUE + 2;
        MARK_SYSTEM_TYPE = 5;
    }

    @Test
    public void testGetMarkStatusPositive() {
        double[] actual = getMarkStatus(marks, MARK_SYSTEM_TYPE);
        assertArrayEquals(expectedMarksStatus, actual, delta);
    }

    @Test
    public void testGetMarkStatusNegativeWithNull() {
        double[] actual = getMarkStatus(null, 0);
        assertEquals(ERROR_WITH_NULL, actual[0], delta);
    }

    @Test
    public void testGetMarkStatusNegativeWithZeroLength() {
        double[] actual = getMarkStatus(new double[0], 0);
        assertEquals(ERROR_WITH_ZERO_LENGTH, actual[0], delta);
    }

    @Test
    public void testGetMarkStatusNegativeWithBadMarkSystemType() {
        double[] actual = getMarkStatus(marks, -1);
        assertEquals(ERROR_WITH_BAD_MARK_SYSTEM, actual[0], delta);
    }
}
