package by.itstep.khodosevich.thirteenstage.task07;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.thirteenstage.task07.module.logic.SameArray.*;

public class SameArrayTest {
    private static double[] arraySameElement;
    private static double[] arrayNotSameElement;
    private static String ERROR_MESSAGE;

    static {
        arraySameElement = new double[]{7, 7, 7, 7, 7, 7};
        arrayNotSameElement = new double[]{1, 2, 3, 4, 5, 6, 7};
        ERROR_MESSAGE = "Your method works bad!!!";
    }

    @Test
    public void testIsAllElementArrayTheSamePositiveTrue() {
        boolean actual = isAllElementArrayTheSame(arraySameElement);
        assertTrue(ERROR_MESSAGE, actual);
    }

    @Test
    public void testIsAllElementArrayTheSamePositiveFalse() {
        boolean actual = isAllElementArrayTheSame(arrayNotSameElement);
        assertFalse(ERROR_MESSAGE, actual);
    }

    @Test
    public void testIsAllElementArrayTheSameNegativeWithNull() {
        boolean actual = isAllElementArrayTheSame(null);
        assertFalse(ERROR_MESSAGE, actual);
    }

    @Test
    public void testIsAllElementArrayTheSameNegativeWithZeroLength() {
        boolean actual = isAllElementArrayTheSame(new double[0]);
        assertFalse(ERROR_MESSAGE, actual);
    }
}
