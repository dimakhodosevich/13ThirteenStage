package by.itstep.khodosevich.thirteenstage.task07.module.logic;

public class SameArray {
    private static String ERROR_WITH_NULL;
    private static String ERROR_WITH_ZERO_LENGTH;

    static {
        ERROR_WITH_NULL = "Your array is null!!!";
        ERROR_WITH_ZERO_LENGTH = "Your array has zero length!!!";
    }

    private SameArray() {
    }

    public static boolean isAllElementArrayTheSame(double[] array) {
        if (array == null) {
            System.err.println(ERROR_WITH_NULL);
            return false;
        }

        if (array.length == 0) {
            System.err.println(ERROR_WITH_ZERO_LENGTH);
            return false;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
