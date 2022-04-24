package by.itstep.khodosevich.thirteenstage.task03.module.logic;

import static by.itstep.khodosevich.thirteenstage.task01.module.logic.Extreme.*;

public class Subsequence {
    private static final String ERROR_NULL_ARRAY;
    private static final String ERROR_ZERO_LENGTH_ARRAY;
    private static final String ERROR_WITH_SAME_ELEMENTS;

    static {
        ERROR_NULL_ARRAY = "Your array is null!!!";
        ERROR_ZERO_LENGTH_ARRAY = "Your array has zero size!!!";
        ERROR_WITH_SAME_ELEMENTS = "Your array has same numbers!!!";
    }

    public static double getSumSubsequence(double[] array) {
        if (array == null) {
            System.err.println(ERROR_NULL_ARRAY);
            return Integer.MIN_VALUE;
        }

        if (array.length == 0) {
            System.err.println(ERROR_ZERO_LENGTH_ARRAY);
            return Integer.MIN_VALUE + 1;
        }

        double averageValue = getAverageValue(array);
        double result = 0;

        for (int i = 0; i < array.length; i++) {
            double sum = 0;
            for (int j = i; j < array.length; j++) {

                sum += array[j];
                if (sum > averageValue) {
                    sum -= array[j];
                    break;
                }
            }

            if ((sum > result || result == 0) && sum != 0) {
                result = sum;
            }
        }

        if (result == averageValue) {
            System.err.println(ERROR_WITH_SAME_ELEMENTS);
            return Integer.MIN_VALUE + 2;
        }

        return result;
    }
}
