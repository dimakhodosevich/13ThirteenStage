package by.itstep.khodosevich.thirteenstage.task10.module.logic;

import by.itstep.khodosevich.thirteenstage.task08.module.logic.ParityOddCounter;

public class ParityAndPositiveNumber {
    private static final String ERROR_WITH_NULL;
    private static final String ERROR_WITH_ZERO_LENGTH;

    static {
        ERROR_WITH_NULL = "Your array is null!!!";
        ERROR_WITH_ZERO_LENGTH = "Your array has zero length!!!";
    }

    private ParityAndPositiveNumber() {
    }

    public static double getSumParityAndPositiveElementsInArray(double[] array) {
        if (array == null) {
            System.err.println(ERROR_WITH_NULL);
            return Integer.MIN_VALUE;
        }

        if (array.length == 0) {
            System.err.println(ERROR_WITH_ZERO_LENGTH);
            return Integer.MIN_VALUE + 1;
        }

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] > 0) {
                sum += array[i];
            }
        }

        return sum;
    }
}
