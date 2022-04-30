package by.itstep.khodosevich.thirteenstage.task05.controller;

import by.itstep.khodosevich.thirteenstage.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

import static by.itstep.khodosevich.thirteenstage.task05.module.logic.AscendDescendArray.*;

public class ControllerAscendDescendArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            Printer.print("Input size of your array:\n");
            int size = scanner.nextInt();
            if (size <= 1) {
                System.err.println("Your array has negative size or size =1!!!");
                return;
            }
            double[] array = new double[size];
            for (int i = 0; i < array.length; i++) {
                System.out.printf("Your %d element: ", i + 1);
                array[i] = scanner.nextDouble();
            }

            Printer.print("Input type of examination your want to get:\n");
            Printer.print("1. Examine array for ascend;\n");
            Printer.print("2. Examine array for descend.\n");
            int typeOfMenu = scanner.nextInt();

            String message = "No type of menu\n";


            switch (typeOfMenu) {
                case 1: {
                    message = String.format("Is your array: %s ascend? \nAnswer: %b.\n",
                            Arrays.toString(array), isAscendArray(array));
                    break;
                }
                case 2: {
                    message = String.format("Is your array: %s descend? \nAnswer: %b.\n",
                            Arrays.toString(array), isDescendArray(array));
                    break;
                }
            }

            Printer.print(message);
        } catch (Exception exception) {
            Printer.print("Something went wrong. Look at stack trace!!!\n");
            exception.getStackTrace();
        } finally {
            scanner.close();
        }
    }
}
