package by.epam.preTraining.task9.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MyFileReader {
    public static String readFile(String path) {
        StringBuilder line = new StringBuilder();
        try {
            Scanner scn = new Scanner(new FileReader(path));
            while (scn.hasNextLine()) {
                line.append(scn.nextLine()).append("\r\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return line.toString();
    }
}
