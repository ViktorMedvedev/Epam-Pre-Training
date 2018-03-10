package by.epam.preTraining.task9.controller;

import by.epam.preTraining.task9.model.MyFileReader;
import by.epam.preTraining.task9.model.entities.Text;
import by.epam.preTraining.task9.model.logic.TextWorker;
import by.epam.preTraining.task9.view.Printer;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        String path = "res/text.txt";
        // reading a file
        MyFileReader myFileReader = new MyFileReader(path);
        try {
            myFileReader.readText();

            // task5
            Text textForTask5 = myFileReader.parseText();
            Printer.print(TextWorker.swapWords(textForTask5));
            // Task 15

            Text textForTask15 = myFileReader.parseText();
            Printer.print(TextWorker.removeFirstLetterFromWordEverywere(textForTask15));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}