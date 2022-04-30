package by.itstep.khodosevich.thirteenstage.task08.controller;

import by.itstep.khodosevich.thirteenstage.view.Printer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static by.itstep.khodosevich.thirteenstage.task08.module.logic.ParityOddCounter.*;

public class ControllerParityOddCounter {
    private static double MAX_VALUE = 10;
    private static double MIN_VALUE = 0;

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
                array[i] = random.nextDouble(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
            }

            String message = String.format("\nYour array is: %s.", Arrays.toString(array));
            Printer.print(message);
            Printer.print("\nInput which type of calculation do you want to make:");
            Printer.print("\n1 - Calculate all parity index;");
            Printer.print("\n2 - Calculate all odd index.\n");
            int type = scanner.nextInt();

            if (type != 1 && type != 2) {
                System.err.println("No type of menu!!!");
            }

            if (type == 1) {
                message = String.format("\nThe sum of parity index in your array is: %.2f.",
                        getParitySumOfArray(array));
                Printer.print(message);
            } else {
                message = String.format("\nThe sum of odd index in your array is: %.2f.",
                        getOddSumOfArray(array));
                Printer.print(message);
            }

        } catch (Exception exception) {
            System.err.println("\nSomething went wrong. Look at stack trace!!!");
            exception.getStackTrace();
        } finally {
            scanner.close();
        }
    }
}
