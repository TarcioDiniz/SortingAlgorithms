package com.sorting.algorithms.implementation.service.strategy;

import com.sorting.algorithms.implementation.interfaces.AlgorithmsStrategy;

public class BubbleSortStrategy implements AlgorithmsStrategy {
    @Override
    public int[] sorting(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;

                }
            }
        }

        return array;
    }
}
