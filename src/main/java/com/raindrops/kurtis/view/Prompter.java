package com.raindrops.kurtis.view;

import com.raindrops.kurtis.raindrops.Raindrops;

import java.util.Scanner;

/**
 * Takes user input and prints out the string
 * <p>obtained from {@link Raindrops}
 */
public class Prompter {
    public static void promptUser() {
        Scanner scanner = new Scanner(System.in);
        Printer.printMessageOneLine("Welcome to Raindrops!\n\nPlease enter an integer: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            Printer.printMessageOneLine("that wasn't a number, please try again: ");

        }

        int num = scanner.nextInt();
        Printer.printMessage("\nResult: " + Raindrops.raindrops(num));

    }
}
