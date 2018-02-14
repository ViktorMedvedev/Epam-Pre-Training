package by.epam.preTraining.task4.equals.controller;

import by.epam.preTraining.task4.equals.model.EqualsChecker;
import by.epam.preTraining.task4.view.Printer;

public class Main {
    public static void main(String[] args) {
        //task4.3
        int n = 12345;
        int s = 15;
        Printer.print("The statement, that sum of digits of "
                + n + " and number " + s + " are equals is "
                + EqualsChecker.defineIfEquals(n, s));
    }
}
