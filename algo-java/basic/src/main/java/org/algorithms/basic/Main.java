package org.algorithms.basic;

import org.algorithms.basic.commands.SumOfDigitsCommand;
import org.algorithms.basic.commands.CommandInvoker;
import org.algorithms.basic.commands.PalindromeCommand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        System.out.println("Welcome to Algorithmic Problem Solving! Let us start with some basic problems.");

        // Create the invoker
        Scanner scanner = new Scanner(System.in);
        CommandInvoker invoker = new CommandInvoker(scanner);

        // Register the commands
        invoker.registerCommand(Problem.PALINDROME, new PalindromeCommand(scanner));
        invoker.registerCommand(Problem.SUM_OF_DIGITS, new SumOfDigitsCommand(scanner));

        boolean exit = false;
        try {
            while (!exit) {
                invoker.printMenu();
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume the rest of the line
                if (!invoker.isCommandIndexValid(choice)) {
                    exit = true;
                } else {
                    invoker.executeCommand(choice);
                }
                System.out.println("--------------------");
            }
        } catch (InputMismatchException ex) {
        }
        System.out.println("Exiting...");
    }
}
