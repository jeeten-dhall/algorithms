package org.algorithms.basic.commands;

import org.algorithms.basic.algorithms.SumOfDigits;

import java.util.*;

public class SumOfDigitsCommand implements Command {
    Scanner scanner;
    SumOfDigits algoSumOfDigits;

    public SumOfDigitsCommand(Scanner scanner) {
        this.scanner = scanner;
        algoSumOfDigits = new SumOfDigits();
    }

    @Override
    public void execute() {
        System.out.println("-----Sum the elements of an array-----");
        System.out.println("Type some numbers for which you want to compute the sum. Press 'Enter' after each number.  Type any non-numeric character to compute the sum.");
        List<Integer> numbers = new ArrayList<>();
        try {
            while (true){
                int num = scanner.nextInt();
                scanner.nextLine(); // consume the rest of the line
                numbers.add(num);
            }
        } catch(InputMismatchException ex) {
            System.out.println("The sum of the elements is " + algoSumOfDigits.getSumOfElements(numbers.stream().mapToInt(Integer::intValue).toArray()));
            scanner.nextLine(); // consume the rest of the line
        }
    }
}
