package org.algorithms.basic.commands;

import org.algorithms.basic.algorithms.ArraySum;

import java.util.*;

public class ArraySumCommand implements Command {
    Scanner scanner;
    ArraySum algoArraySum;

    public ArraySumCommand(Scanner scanner) {
        this.scanner = scanner;
        algoArraySum = new ArraySum();
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
            System.out.println("The sum of the elements is " + algoArraySum.getSumOfElements(numbers.stream().mapToInt(Integer::intValue).toArray()));
            scanner.nextLine(); // consume the rest of the line
        }
    }
}
