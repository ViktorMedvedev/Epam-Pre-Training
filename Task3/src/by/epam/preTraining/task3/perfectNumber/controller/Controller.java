package by.epam.preTraining.task3.perfectNumber.controller;

import by.epam.preTraining.task3.InputNumberException;
import by.epam.preTraining.task3.perfectNumber.view.View;

public class Controller {
    public static void main(String[] args) {
        try {
            //task3
            int perfectNumber = 8128;
            View.printIsPerfect(perfectNumber);

        } catch (InputNumberException e) {
            System.out.println("Error! Natural number must be more than 0");
        }
    }
}
