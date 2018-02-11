package by.epam.preTraining.task3.headsOrTails.controller;

import by.epam.preTraining.task3.InputNumberException;
import by.epam.preTraining.task3.headsOrTails.view.View;


public class Controller {
    public static void main(String[] args) {
        try {
            //task1
            int countOfTries = -1;
            View.printCountOfHeadsAndTails(countOfTries);

        } catch (InputNumberException e) {
            System.out.println("Task 3.1. HeadsOrTails. Error! Your input number less than 0");
        }
    }
}
