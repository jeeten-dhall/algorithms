package org.algorithms.basic.commands;

import org.algorithms.basic.Problem;

import java.util.*;

public class CommandInvoker {
    private List<Problem> problems;
    Map<Integer, Command> indexToCommand;
    Scanner scanner;

    public CommandInvoker(Scanner scanner) {
        problems = new ArrayList<>();
        indexToCommand = new HashMap<Integer, Command>();
        this.scanner = scanner;
    }

    public void registerCommand(Problem problem, Command command) {
        problems.add(problem);
        indexToCommand.put(problem.getValue(), command);
    }

    public void printMenu() {
        System.out.println("Please type the serial number of the algorithm you want to run. Type any other number to exit.");
        problems.stream().forEach(problem -> System.out.println(problem.getValue() + ": " + problem.getName()));
    }

    public void executeCommand(int choice) {
        indexToCommand.get(choice).execute();
    }

    public boolean isCommandIndexValid(int index) {
        return indexToCommand.containsKey(index);
    }
}
