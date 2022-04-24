package by.itstep.khodosevich.thirteenstage.task02.controller;

import by.itstep.khodosevich.thirteenstage.view.Printer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static by.itstep.khodosevich.thirteenstage.task01.module.logic.Extreme.*;
import static by.itstep.khodosevich.thirteenstage.task02.module.logic.Extreme.*;

public class ControllerExtreme {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();
    public static final int MAX = 25;
    public static final int MIN = -25;


    public static void main(String[] args) {

        try {
            Printer.print("Input size of your array: ");
            int size = SCANNER.nextInt();

            if (size < 0) {
                System.err.println("Your array has negative size!!!");
            }

            double[] array = new double[size];

            for (int i = 0; i < array.length; i++) {
                array[i] = RANDOM.nextDouble(MAX - MIN + 1) + MIN;
            }

            String message = String.format("Your array is: %s.\n", Arrays.toString(array));
            Printer.print(message);
            message = String.format("Max element in your array is: %.2f.\n",
                    array[findIndexMaxElement(array)]);
            Printer.print(message);
            message = String.format("Min element in your array is: %.2f.\n",
                    array[findIndexMinElement(array)]);
            Printer.print(message);
            //phantom calling method (return two types of error and zero when all work well)
            swapFirstMaxMinElement(array);

            message = String.format("Your array is: %s.\n", Arrays.toString(array));
            Printer.print(message);

        } catch (Exception e) {
            System.err.println("Something went wrong. Catch for unexpected exception!!!");
            e.getStackTrace();
        }

    }
}
