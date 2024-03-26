package com.sorting.algorithms.implementation.utils;

import com.sorting.algorithms.implementation.modal.AlgorithmsType;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Save {

    private final String filePath;

    public Save(String filePath) {
        this.filePath = filePath;
    }

    public void txt(Map<AlgorithmsType, Map<String, Long>> executionTimes) {

        try {
            File file = new File(filePath);

            if (!file.exists()) {
                boolean created = file.createNewFile();
                if (!created) {
                    System.err.println("Failed to create the file.");
                    return;
                }
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (AlgorithmsType algorithm : executionTimes.keySet()) {
                bw.write(algorithm + ":");
                bw.newLine();
                Map<String, Long> timesPerArray = executionTimes.get(algorithm);
                for (String array : timesPerArray.keySet()) {
                    long time = timesPerArray.get(array);
                    bw.write(array + ": " + time + "ms");
                    bw.newLine();
                }
                bw.newLine();
            }
            bw.close();

            System.out.println("The results have been saved to '" + filePath + "'.");

        } catch (IOException e) {
            Logger.getLogger(Save.class.getName()).log(Level.SEVERE, "An error occurred while saving results to file.", e);
        }
    }
}
