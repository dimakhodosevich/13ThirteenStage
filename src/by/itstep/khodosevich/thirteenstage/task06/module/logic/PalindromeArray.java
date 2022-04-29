package by.itstep.khodosevich.thirteenstage.task06.module.logic;

public class PalindromeArray {
    private PalindromeArray() {
    }

    public static boolean isPalindromeArray(double[] array) {
        if (array == null) {
            System.err.println("Your array is null!!!");
            return false;
        }

        if (array.length == 0) {
            System.err.println("Your array has zero size!!!");
            return false;
        }

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
