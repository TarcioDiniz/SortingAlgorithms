package com.sorting.algorithms.implementation.service.strategy;

import com.sorting.algorithms.implementation.interfaces.AlgorithmsStrategy;

public class CountingSortStrategy implements AlgorithmsStrategy {
    @Override
    public int[] sorting(int[] array) {
        int max = getMaxValue(array);
        int[] count = new int[max + 1];
        int[] sortedArray = new int[array.length];
        for (int value : array) {
            count[value]++;
        }
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        for (int i = array.length - 1; i >= 0; i--) {
            sortedArray[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        return sortedArray;
    }

    private int getMaxValue(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
