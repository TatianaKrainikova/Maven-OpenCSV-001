package org.example.app.services;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class ReadService {

    public void readData(String path) {

        try {
            CSVReader reader = new CSVReader(new FileReader(path));

            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {
                for (String str : nextLine) {
                    System.out.print(str);
                }
                System.out.print("\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
