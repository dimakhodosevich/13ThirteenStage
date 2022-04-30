package by.itstep.khodosevich.thirteenstage.task04.controller;

import by.itstep.khodosevich.thirteenstage.task04.module.logic.ParityOddNumber;
import by.itstep.khodosevich.thirteenstage.view.Printer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ControllerParity {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();
    public static final int MAX_VALUE = 10;
    public static final int MIN_VALUE = 0;

    public static void main(String[] args) {
        try {
            Printer.print("Input size of your array: ");
            int size = SCANNER.nextInt();

            if (size <= 1) {
                System.err.println("Your array has negative size or size=1!!!");
                return;
            }

            double[] array = new double[size];

            for (int i = 0; i < array.length; i++) {
                array[i] = RANDOM.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
            }

            String message = String.format("\nYour array is: %s.", Arrays.toString(array));
            Printer.print(message);
            Printer.print("\nInput which type of calculation do you want to make:");
            Printer.print("\n1 - Calculate all parity number;");
            Printer.print("\n2 - Calculate all odd number.\n");
            int type = SCANNER.nextInt();

            if (type != 1 && type != 2) {
                System.err.println("No type of menu!!!");
            }

            if (type == 1) {
                message = String.format("\nThe sum of parity numbers in your array is: %.2f.",
                        ParityOddNumber.calculateSumOfParityNumber(array));
                Printer.print(message);
            } else {
                message = String.format("\nThe sum of odd numbers in your array is: %.2f.",
                        ParityOddNumber.calculateSumOfOddNumber(array));
                Printer.print(message);
            }

        } catch (Exception exception) {
            System.err.println("\nSomething went wrong. Look at stack trace!!!");
            exception.getStackTrace();
        }
    }
}
