package by.itstep.khodosevich.thirteenstage.task10.controller;

import by.itstep.khodosevich.thirteenstage.view.Printer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static by.itstep.khodosevich.thirteenstage.task10.module.logic.ParityAndPositiveNumber.*;

public class ControllerParityAndPositiveNumber {
    private static int MAX_VALUE = 10;
    private static int MIN_VALUE = -5;

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

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
            }

            String message = String.format("\nYour array is: %s.", Arrays.toString(array));
            Printer.print(message);
            message = String.format("\nThe sum of parity index and positive elements of your array is %.2f.",
                    getSumParityAndPositiveElementsInArray(array));
            Printer.print(message);
        } catch (Exception exception) {
            System.err.println("\nSomething went wrong. Look at stack trace!!!");
            exception.getStackTrace();
        } finally {
            scanner.close();
        }
    }
}
