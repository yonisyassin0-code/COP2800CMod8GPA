// CSVReader.java
// D. Singletary
// 2/22/25
// Reads a CSV file line-by-line

package edu.fscj.cop2800c.penguin;

import java.io.*;
import java.util.*;

public class CSVReader {
    /**
     * Reads a file line by line, extracts the specified column from
     * each line, and returns an array containing the extracted values.
     *
     * The file is expected to be delimited by commas. If a line does not contain
     * the requested column, an empty string is added for that line.
     *
     * @param FILE_NAME the name (or path) of the file to be read
     * @param column the zero-based index of the column to extract from each line
     * @return an array of strings containing the extracted column values from each row.
     */
     public static String[] readFile(String FILE_NAME, int column) {
        List<String> columnValues = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (column >= 0 && column < tokens.length) {
                    columnValues.add(tokens[column]);
                } else {
                    columnValues.add("");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return new String[0];
        }
        return columnValues.toArray(new String[0]);
    }
}
