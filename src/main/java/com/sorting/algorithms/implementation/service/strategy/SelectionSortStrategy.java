package com.sorting.algorithms.implementation.service.strategy;

import com.sorting.algorithms.implementation.interfaces.AlgorithmsStrategy;

public class SelectionSortStrategy implements AlgorithmsStrategy {
    @Override
    public int[] sorting(int[] array) {
        for (int i = 0; i < array.length; i++) {

            int minIndex = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[minIndex])
                    minIndex = j;

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

        }
        return array;
    }
}
