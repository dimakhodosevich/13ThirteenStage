package by.itstep.khodosevich.thirteenstage.task07.controller;

import by.itstep.khodosevich.thirteenstage.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

import static by.itstep.khodosevich.thirteenstage.task07.module.logic.SameArray.*;

public class ControllerSameArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Printer.print("Input size of your array:\n");
            int size = scanner.nextInt();
            if (size <= 1) {
                System.err.println("Your array has negative size or size = 1!!!");
                return;
            }
            double[] array = new double[size];
            for (int i = 0; i < array.length; i++) {
                System.out.printf("Your %d element: ", i + 1);
                array[i] = scanner.nextDouble();
            }

            String message = String.format("Does your array: %s has the same elements? \nAnswer: %b.\n",
                    Arrays.toString(array), isAllElementArrayTheSame(array));
            Printer.print(message);
        } catch (Exception exception) {
            Printer.printError("Something went wrong. Look at stack trace!!!");
            exception.getStackTrace();
        } finally {
            scanner.close();
        }
    }
}
