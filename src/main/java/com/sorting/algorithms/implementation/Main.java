package com.sorting.algorithms.implementation;

import com.sorting.algorithms.implementation.modal.AlgorithmsType;
import com.sorting.algorithms.implementation.service.AlgorithmsApplication;
import com.sorting.algorithms.implementation.utils.FileUtil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String test_array_1M = "src/main/resources/test-array-1M.txt";
        String test_array_2M = "src/main/resources/test-array-2M.txt";
        String test_array_3M = "src/main/resources/test-array-3M.txt";

        int[] arrayTest = {99, 55, 1, 4};

        int[] integersArray = FileUtil.readIntegersFromFile(test_array_1M);


        System.out.println(Arrays.toString(AlgorithmsApplication.sorting(AlgorithmsType.SELECTION_SORT, arrayTest)));

    }
}