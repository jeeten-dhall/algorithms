package org.algorithms.basic.commands;

import org.algorithms.basic.algorithms.Palindrome;

import java.util.Scanner;

public class PalindromeCommand implements Command {
    Scanner scanner;
    Palindrome algoPalindrome;

    public PalindromeCommand(Scanner scanner) {
        this.scanner = scanner;
        algoPalindrome = new Palindrome();
    }

    @Override
    public void execute() {
        System.out.println("-----Palindrome-----");
        System.out.println("Type some text to check if it is a palindrome. Press 'Enter' when done.");
        String input = scanner.nextLine();
        if(algoPalindrome.isPalindrome(input))
            System.out.println("The text you entered is a palindrome!");
        else
            System.out.println("The text you entered is not a palindrome.");
    }
}
