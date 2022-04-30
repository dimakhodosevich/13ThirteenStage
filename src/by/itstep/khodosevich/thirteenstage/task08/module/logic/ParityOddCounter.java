package by.itstep.khodosevich.thirteenstage.task08.module.logic;

public class ParityOddCounter {
    private static String ERROR_WITH_NULL;
    private static String ERROR_WITH_ZERO_LENGTH;

    static {
        ERROR_WITH_NULL = "Your array is null!!!";
        ERROR_WITH_ZERO_LENGTH = "Your array has zero length!!!";
    }

    private ParityOddCounter() {
    }

    public static double getParitySumOfArray(double[] array) {
        if (array == null) {
            System.err.println();
            return Integer.MIN_VALUE;
        }

        if (array.length == 0) {
            System.err.println();
            return Integer.MIN_VALUE + 1;
        }

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static double getOddSumOfArray(double[] array) {
        if (array == null) {
            System.err.println();
            return Integer.MIN_VALUE;
        }

        if (array.length == 0) {
            System.err.println();
            return Integer.MIN_VALUE + 1;
        }
        return getSumOfArray(array) - getParitySumOfArray(array);
    }

    public static double getSumOfArray(double[] array) {
        if (array == null) {
            System.err.println();
            return Integer.MIN_VALUE;
        }

        if (array.length == 0) {
            System.err.println();
            return Integer.MIN_VALUE + 1;
        }

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
}
