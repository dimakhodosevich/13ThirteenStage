package by.itstep.khodosevich.thirteenstage.task05.module.logic;

public class AscendDescendArray {

    private static String ERROR_WITH_NULL;
    private static String ERROR_WITH_ZERO;

    static {
        ERROR_WITH_NULL = "Your array is null!!!";
        ERROR_WITH_ZERO = "Your array has zero length!!!";
    }

    public static boolean isAscendArray(double[] array) {
        if (array == null) {
            System.err.println(ERROR_WITH_NULL);
            return false;
        }

        if (array.length == 0) {
            System.err.println(ERROR_WITH_ZERO);
            return false;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isDescendArray(double[] array) {
        if (array == null) {
            System.err.println(ERROR_WITH_NULL);
            return false;
        }

        if (array.length == 0) {
            System.err.println(ERROR_WITH_ZERO);
            return false;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
