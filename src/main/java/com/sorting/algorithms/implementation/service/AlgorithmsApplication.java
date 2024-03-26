package com.sorting.algorithms.implementation.service;

import com.sorting.algorithms.implementation.interfaces.AlgorithmsStrategy;
import com.sorting.algorithms.implementation.modal.AlgorithmsType;
import com.sorting.algorithms.implementation.service.strategy.*;

import java.util.HashMap;
import java.util.Map;

/*

Implement the sorting algorithms:

        Bubble sort,
        selection sort,
        insertion sort,
        merge sort,
        quick sort, and
        counting sort.

*/

public class AlgorithmsApplication {

    private static final Map<AlgorithmsType, AlgorithmsStrategy> mapAlgorithms = new HashMap<AlgorithmsType, AlgorithmsStrategy>() {
        {
            //put(AlgorithmsType.BUBBLE_SORT, new BubbleSortStrategy());
            //put(AlgorithmsType.SELECTION_SORT, new SelectionSortStrategy());
            put(AlgorithmsType.INSERTION_SORT, new InsertionSortStrategy());
            put(AlgorithmsType.MERGE_SORT, new MergeSortStrategy());
            //put(AlgorithmsType.QUICK_SORT, new QuickSortStrategy());
//            put(AlgorithmsType.COUNTING_SORT, new CountingSortStrategy());
        }
    };

    public static int[] sorting(AlgorithmsType type, int[] array) {
        return mapAlgorithms.get(type).sorting(array);
    }
}
