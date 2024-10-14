package org.algorithms.basic.algorithms;

public class ArraySum {
    public int getSumOfElements(int[] array) {
        int sum = 0;
        for(int i : array) {
            sum += i;
        }
        return sum;
    }
}
