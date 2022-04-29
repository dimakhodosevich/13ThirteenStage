package by.itstep.khodosevich.thirteenstage.task06;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.thirteenstage.task06.module.logic.PalindromeArray.*;

public class PalindromeArrayTest {
    private static int[] arrayPalindromeOdd;
    private static int[] arrayPalindromeParity;
    private static int[] arrayBasic;
    private static String ERROR_MESSAGE;

    static {
        arrayPalindromeOdd = new int[]{1, 2, 3, 2, 1};
        arrayPalindromeParity = new int[]{1, 2, 3, 3, 2, 1};
        arrayBasic = new int[]{1, 2, 3, 4, 5};
        ERROR_MESSAGE = "Your method works bad!!!";
    }

    @Test
    public void testIsPalindromeArrayPositiveTrueOdd() {
        boolean actual = isPalindromeArray(arrayPalindromeOdd);
        assertTrue(ERROR_MESSAGE, actual);
    }

    @Test
    public void testIsPalindromeArrayPositiveTrueParity() {
        boolean actual = isPalindromeArray(arrayPalindromeParity);
        assertTrue(ERROR_MESSAGE, actual);
    }

    @Test
    public void testIsPalindromeArrayPositiveFalse() {
        boolean actual = isPalindromeArray(arrayBasic);
        assertFalse(ERROR_MESSAGE, actual);
    }

    @Test
    public void testIsPalindromeArrayNegativeWithNull() {
        boolean actual = isPalindromeArray(null);
        assertFalse(ERROR_MESSAGE, actual);
    }

    @Test
    public void testIsPalindromeArrayNegativeWithZero() {
        boolean actual = isPalindromeArray(new int[0]);
        assertFalse(ERROR_MESSAGE, actual);
    }
}
