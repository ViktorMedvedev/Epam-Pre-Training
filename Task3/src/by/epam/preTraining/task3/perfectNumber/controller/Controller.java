package by.epam.preTraining.task3.perfectNumber.controller;

import by.epam.preTraining.task3.InputNumberException;
import by.epam.preTraining.task3.perfectNumber.model.PerfectNumber;
import by.epam.preTraining.task3.view.Printer;

public class Controller {
    public static void main(String[] args) {
        try {
            //task3
            int number = 8128;
            Printer.print("The statement that " + number
                    + " is perfect is " + PerfectNumber.isPerfectNumber(number));

        } catch (InputNumberException e) {
            System.out.println("Error! Natural number must be more than 0");
        }
    }
}
