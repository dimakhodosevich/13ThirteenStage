package by.itstep.khodosevich.thirteenstage.task09.controller;

import static by.itstep.khodosevich.thirteenstage.task09.module.logic.Mark.*;

import by.itstep.khodosevich.thirteenstage.view.Printer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ControllerMark {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        try {
            Printer.print("Input size of your array: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                Printer.printError("Your array has negative size or size=0!!!");
                return;
            }
            double[] array = new double[size];

            Printer.print("Input type of mark system - for instance: 5 (0,1,2,3,4,5): ");
            int systemType = scanner.nextInt();

            int maxValue = systemType;
            int minValue = 0;

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(maxValue - minValue + 1) + minValue;
            }

            String message = String.format("\nYour mark array is: %s.", Arrays.toString(array));
            Printer.print(message);

            double[] marksStatus = getMarkStatus(array, systemType);

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < marksStatus.length; i++) {
                stringBuilder.append(String.format("\n%d - has %.2f percent in your array.",
                        i, marksStatus[i]));
            }
            Printer.print(stringBuilder + "");
        } catch (Exception exception) {
            System.err.println("\nSomething went wrong. Look at stack trace!!!");
            exception.getStackTrace();
        } finally {
            scanner.close();
        }
    }
}
