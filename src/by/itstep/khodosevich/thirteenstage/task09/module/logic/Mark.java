package by.itstep.khodosevich.thirteenstage.task09.module.logic;

public class Mark {
    private static final String ERROR_WITH_NULL;
    private static final String ERROR_WITH_ZERO_LENGTH;
    private static final String ERROR_WITH_MARK_SYSTEM;

    static {
        ERROR_WITH_NULL = "Your array of marks is null!!!";
        ERROR_WITH_ZERO_LENGTH = "Your array has zero length!!!";
        ERROR_WITH_MARK_SYSTEM = "Your mark system doesn't exist!!!";
    }

    private Mark() {
    }

    public static double[] getMarkStatus(double[] marks, int markSystemType) {
        if (marks == null) {
            System.err.println(ERROR_WITH_NULL);
            double[] err = new double[1];
            err[0] = Integer.MIN_VALUE;
            return err;
        }

        if (marks.length == 0) {
            System.err.println(ERROR_WITH_ZERO_LENGTH);
            double[] err = new double[1];
            err[0] = Integer.MIN_VALUE + 1;
            return err;
        }

        if (markSystemType < 0) {
            System.err.println(ERROR_WITH_MARK_SYSTEM);
            double[] err = new double[1];
            err[0] = Integer.MIN_VALUE + 2;
            return err;
        }

        double[] marksStatus = new double[markSystemType + 1];

        for (int j = 0; j <= markSystemType; j++) {
            int markCounter = 0;

            for (int i = 0; i < marks.length; i++) {
                if (j == marks[i]) {
                    markCounter++;
                }
            }

            marksStatus[j] = (double) markCounter / marks.length * 100;
        }

        return marksStatus;
    }


}
