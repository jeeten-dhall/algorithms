package org.algorithms.basic;

public enum Problem {
    PALINDROME("Palindrome", 1),
    SUM_OF_DIGITS("Sum of digits", 2),
    ARRAY_MAX("Find the maximum element of an array", 3),
    FIBONACCI("Generate a sequence of fibonacci numbers", 4),
    FACTORIAL("Find the factorial of a number", 5);

    private String name;
    private int value;

    Problem(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
