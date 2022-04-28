package by.itstep.khodosevich.thirteenstage.task04.module.logic;

public class ParityOddNumber {

    private static final String ERROR_WITH_NULL;
    private static final String ERROR_WITH_ZERO;

    static {
        ERROR_WITH_NULL = "Your array equals null!!!";
        ERROR_WITH_ZERO = "Your array has zero length!!!";
    }

    private ParityOddNumber() {
    }

    public static double calculateSumOfParityNumber(double[] array) {
        if (array == null) {
            System.err.println(ERROR_WITH_NULL);
            return Integer.MIN_VALUE;
        }

        if (array.length == 0) {
            System.err.println(ERROR_WITH_ZERO);
            return Integer.MIN_VALUE + 1;
        }

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }

        return sum;
    }

    public static double calculateSumOfOddNumber(double[] array) {
        if (array == null) {
            System.err.println(ERROR_WITH_NULL);
            return Integer.MIN_VALUE;
        }

        if (array.length == 0) {
            System.err.println(ERROR_WITH_ZERO);
            return Integer.MIN_VALUE + 1;
        }

        return calculateSumOfArray(array) - calculateSumOfParityNumber(array);
    }

    public static double calculateSumOfArray(double[] array) {
        if (array == null) {
            System.err.println(ERROR_WITH_NULL);
            return Integer.MIN_VALUE;
        }

        if (array.length == 0) {
            System.err.println(ERROR_WITH_ZERO);
            return Integer.MIN_VALUE + 1;
        }

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

}
