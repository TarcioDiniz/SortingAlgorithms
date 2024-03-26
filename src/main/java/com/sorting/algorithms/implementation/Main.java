package com.sorting.algorithms.implementation;

import com.sorting.algorithms.implementation.modal.AlgorithmsType;
import com.sorting.algorithms.implementation.utils.FileUtil;
import com.sorting.algorithms.implementation.utils.Measurement;
import com.sorting.algorithms.implementation.utils.Save;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String test_array_1M = "src/main/resources/test-array-1M.txt";
        String test_array_2M = "src/main/resources/test-array-2M.txt";
        String test_array_3M = "src/main/resources/test-array-3M.txt";

        int[] array1M = FileUtil.readIntegersFromFile(test_array_1M);
        int[] array2M = FileUtil.readIntegersFromFile(test_array_2M);
        int[] array3M = FileUtil.readIntegersFromFile(test_array_3M);

        Map<AlgorithmsType, Map<String, Long>> runtime = new HashMap<>();

        for (AlgorithmsType algoritmo : AlgorithmsType.values()) {
            Map<String, Long> temposPorArray = new HashMap<>();
            temposPorArray.put("Array 1M", Measurement.algorithmsTime(algoritmo, array1M));
            temposPorArray.put("Array 2M", Measurement.algorithmsTime(algoritmo, array2M));
            temposPorArray.put("Array 3M", Measurement.algorithmsTime(algoritmo, array3M));
            runtime.put(algoritmo, temposPorArray);
        }


        Save save = new Save("result.txt");
        save.txt(runtime);
    }


}