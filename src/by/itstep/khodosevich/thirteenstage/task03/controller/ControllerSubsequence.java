package by.itstep.khodosevich.thirteenstage.task03.controller;

import by.itstep.khodosevich.thirteenstage.task01.module.logic.Extreme;
import by.itstep.khodosevich.thirteenstage.view.Printer;

import static by.itstep.khodosevich.thirteenstage.task03.module.logic.Subsequence.*;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ControllerSubsequence {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();
    public static final int MAX = 25;
    public static final int MIN = -25;


    public static void main(String[] args) {

        try {
            Printer.print("Input size of your array: ");
            int size = SCANNER.nextInt();

            if (size <= 1) {
                System.err.println("Your array has negative size or size =1!!!");
                return;
            }

            double[] array = new double[size];

            for (int i = 0; i < array.length; i++) {
                array[i] = RANDOM.nextDouble(MAX - MIN + 1) + MIN;
            }

            String message = String.format("Your array is: %s.\n", Arrays.toString(array));
            Printer.print(message);
            message = String.format("Average value of your array is: %.2f.\n", Extreme.getAverageValue(array));
            Printer.print(message);
            message = String.format("The sum subsequence of your array lower than average value is:   %s.\n",
                    getSumSubsequence(array));
            Printer.print(message);

        } catch (Exception e) {
            System.err.println("Something went wrong. Catch for unexpected exception!!!");
            e.getStackTrace();
        }

    }
}
