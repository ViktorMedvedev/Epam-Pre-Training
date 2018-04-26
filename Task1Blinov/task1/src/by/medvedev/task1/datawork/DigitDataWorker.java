package by.medvedev.task1.datawork;

import by.medvedev.task1.entity.Cone;
import by.medvedev.task1.factory.ShapeFactory;
import by.medvedev.task1.validator.Validator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DigitDataWorker {
    private Logger logger = LogManager.getLogger();
    private final static String SPACE_DELIMITER = "\\s+";

    public List<String> readDataLines(String path) {
        List<String> list = new ArrayList<>();
        try {
            list = Files.lines(Paths.get(path)).collect(Collectors.toList());
            logger.log(Level.INFO, "File reading success");
        } catch (IOException e) {
            logger.log(Level.FATAL, "File is not found");
            throw new RuntimeException("Error. File is not found", e);
        }
        if (list.isEmpty()) {
            logger.log(Level.FATAL, "File is Empty");
            throw new RuntimeException("Error. File is empty");
        }
        return list;

    }

    public ArrayList<String> takeCorrectData(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String line = list.get(i);
            int numberOfString = i + 1;
            if (Validator.isCorrectDataFormat(line)) {
                arrayList.add(line);
            } else {
                if (Validator.notEnoughData(line)) {
                    logger.log(Level.ERROR, "Not enough data in line " + numberOfString + ". ");
                } else if (Validator.containWrongSymbols(line)) {
                    logger.log(Level.ERROR, "Wrong symbols in line " + numberOfString + ". ");
                } else if (Validator.checkWrongRadius(line)) {
                    logger.log(Level.ERROR, "Radius must not be negative in line " + numberOfString + ". ");
                } else if (Validator.checkWrongCost(line)) {
                    logger.log(Level.ERROR, "Cost must not be negative in line " + numberOfString + ". ");
                } else {
                    logger.log(Level.ERROR, "Wrong format in line " + numberOfString + ". ");
                }
            }
        }
        if (size > arrayList.size()) {
            logger.log(Level.INFO, "File contains wrong data. Please, input data in format like:" + "\r\n" +
                    "\"R(Positive base radius) X Y Z(circle center coordinates) X1 Y1 Z1(top coordinates) C(cost)\"");
        }
        return arrayList;
    }

    public Cone parseStringIntoCone(String line) {
        String[] spaceSeparatedArray = line.split(SPACE_DELIMITER);
        double radius = Double.parseDouble(spaceSeparatedArray[0]);
        double baseCenterX = Double.parseDouble(spaceSeparatedArray[1]);
        double baseCenterY = Double.parseDouble(spaceSeparatedArray[2]);
        double baseCenterZ = Double.parseDouble(spaceSeparatedArray[3]);
        double topX = Double.parseDouble(spaceSeparatedArray[4]);
        double topY = Double.parseDouble(spaceSeparatedArray[5]);
        double topZ = Double.parseDouble(spaceSeparatedArray[6]);
        double cost = Double.parseDouble(spaceSeparatedArray[7]);
        Cone cone = ShapeFactory.createCone(radius, ShapeFactory.createPoint(baseCenterX, baseCenterY, baseCenterZ), ShapeFactory.createPoint(topX, topY, topZ), cost);
        logger.log(Level.INFO, "Got the cone");
        return cone;
    }

}