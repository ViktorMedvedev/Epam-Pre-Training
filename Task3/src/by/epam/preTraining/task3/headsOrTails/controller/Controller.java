package by.epam.preTraining.task3.headsOrTails.controller;

import by.epam.preTraining.task3.InputNumberException;
import by.epam.preTraining.task3.headsOrTails.model.HeadsOrTails;
import by.epam.preTraining.task3.view.Printer;


public class Controller {
    public static void main(String[] args) {
        try {
            //task1
            int countOfTries = 1000;
            Printer.print("There are " + countOfTries + " attempts, number of heads is "
                    + HeadsOrTails.countHeads(countOfTries));

        } catch (InputNumberException e) {
            System.out.println("Task 3.1. HeadsOrTails. Error! Your input number less than 0");
        }
    }
}
