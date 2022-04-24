package by.itstep.khodosevich.thirteenstage.task01.module.logic;

public class Extreme {
    private static final String ERROR_NULL_ARRAY;
    private static final String ERROR_ZERO_LENGTH_ARRAY;

    static {
        ERROR_NULL_ARRAY = "Your array is null!!!";
        ERROR_ZERO_LENGTH_ARRAY = "Your array has zero size!!!";
    }

    private Extreme(){}

    public static int findIndexMaxElement(double[] array) {
        if (array == null) {
            System.err.println(ERROR_NULL_ARRAY);
            return Integer.MIN_VALUE;
        }

        if (array.length == 0) {
            System.err.println(ERROR_ZERO_LENGTH_ARRAY);
            return Integer.MIN_VALUE + 1;
        }

        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static int findIndexMinElement(double[] array) {
        if (array == null) {
            System.err.println(ERROR_NULL_ARRAY);
            return Integer.MIN_VALUE;
        }

        if (array.length == 0) {
            System.err.println(ERROR_ZERO_LENGTH_ARRAY);
            return Integer.MIN_VALUE + 1;
        }

        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static double getAverageValue(double[] array) {
        if (array == null) {
            System.err.println(ERROR_NULL_ARRAY);
            return Integer.MIN_VALUE;
        }

        if (array.length == 0) {
            System.err.println(ERROR_ZERO_LENGTH_ARRAY);
            return Integer.MIN_VALUE + 1;
        }

        double averageValue = 0;

        for (int i = 0; i < array.length; i++) {
            averageValue += array[i];
        }

        return averageValue / array.length;
    }
}
