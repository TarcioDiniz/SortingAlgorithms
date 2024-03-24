package com.sorting.algorithms.implementation.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static int[] readIntegersFromFile(String filePath) {
        List<Integer> integersList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");
                for (String part : parts) {
                    try {
                        int num = Integer.parseInt(part);
                        integersList.add(num);
                    } catch (NumberFormatException e) {
                        System.err.println("Ignoring non-integer value: " + part);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        int[] integersArray = new int[integersList.size()];
        for (int i = 0; i < integersList.size(); i++) {
            integersArray[i] = integersList.get(i);
        }

        return integersArray;
    }
}
