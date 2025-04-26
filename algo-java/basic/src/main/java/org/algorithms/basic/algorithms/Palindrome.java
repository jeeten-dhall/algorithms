package org.algorithms.basic.algorithms;

public class Palindrome {
    public boolean isPalindrome(String input) {
        int length = input.length();
        for(int i = 0; i < length/2; i++) {
            if (input.charAt(i) != input.charAt(length-i-1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome palin = new Palindrome();
        boolean isPalin = palin.isPalindrome("madame");
        System.out.println(isPalin);
    }
}
