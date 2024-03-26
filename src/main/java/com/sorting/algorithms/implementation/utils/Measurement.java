package com.sorting.algorithms.implementation.utils;

import com.sorting.algorithms.implementation.modal.AlgorithmsType;
import com.sorting.algorithms.implementation.service.AlgorithmsApplication;

public class Measurement {

    public static long algorithmsTime(AlgorithmsType algorithm, int[] array) {
        long startTime = System.nanoTime();
        System.out.println("Start " + startTime + "s " + algorithm + " :" + array);

        AlgorithmsApplication.sorting(algorithm, array);

        long endTime = System.nanoTime();
        System.out.println("End " + endTime + "s " + algorithm + " :" + array);
        return (endTime - startTime) / 1000000;
    }
}
