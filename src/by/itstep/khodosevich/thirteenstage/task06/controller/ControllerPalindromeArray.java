package by.itstep.khodosevich.thirteenstage.task06.controller;

import by.itstep.khodosevich.thirteenstage.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

import static by.itstep.khodosevich.thirteenstage.task06.module.logic.PalindromeArray.*;

public class ControllerPalindromeArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            Printer.print("Input size of your array:\n");
            int size = scanner.nextInt();
            if (size < 0) {
                System.err.println("Your array has negative size!!!");
                return;
            }
            double[] array = new double[size];
            for (int i = 0; i < array.length; i++) {
                System.out.printf("Your %d element: ", i + 1);
                array[i] = scanner.nextDouble();
            }

            String message = String.format("Is your array: %s palindrome? \nAnswer: %b.\n",
                    Arrays.toString(array), isPalindromeArray(array));
            Printer.print(message);

        } catch (Exception exception) {
            Printer.print("Something went wrong. Look at stack trace!!!\n");
            exception.getStackTrace();
        } finally {
            scanner.close();
        }
    }
}
