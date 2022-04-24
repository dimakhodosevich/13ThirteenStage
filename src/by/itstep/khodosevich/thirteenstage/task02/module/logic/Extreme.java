package by.itstep.khodosevich.thirteenstage.task02.module.logic;

import static by.itstep.khodosevich.thirteenstage.task01.module.logic.Extreme.*;

public class Extreme {
    private static final String ERROR_NULL_ARRAY;
    private static final String ERROR_ZERO_LENGTH_ARRAY;

    static {
        ERROR_NULL_ARRAY = "Your array is null!!!";
        ERROR_ZERO_LENGTH_ARRAY = "Your array has zero size!!!";
    }

    private Extreme() {
    }

    public static int swapFirstMaxMinElement(double[] array) {
        if (array == null) {
            System.err.println(ERROR_NULL_ARRAY);
            return Integer.MIN_VALUE;
        }

        if (array.length == 0) {
            System.err.println(ERROR_ZERO_LENGTH_ARRAY);
            return Integer.MIN_VALUE + 1;
        }

        int maxIndex = findIndexMaxElement(array);
        int minIndex = findIndexMinElement(array);

        double temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;
        return 0;
    }
}
