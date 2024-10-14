package org.algorithms.basic.commands;

import org.algorithms.basic.algorithms.SumOfArray;

import java.util.*;

public class SumOfArrayCommand implements Command {
    Scanner scanner;
    SumOfArray algoSumOfArray;

    public SumOfArrayCommand(Scanner scanner) {
        this.scanner = scanner;
        algoSumOfArray = new SumOfArray();
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
            System.out.println("The sum of the elements is " + algoSumOfArray.getSumOfElements(numbers.stream().mapToInt(Integer::intValue).toArray()));
            scanner.nextLine(); // consume the rest of the line
        }
    }
}
