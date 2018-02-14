package by.epam.preTraining.task4.pow.controller;

import by.epam.preTraining.task4.pow.model.Pow;
import by.epam.preTraining.task4.view.Printer;

public class Main {
    public static void main(String[] args) {
        //task4.2
        double x = -0.5;
        int n = -3;
        Printer.print("Result of x^n = " + Pow.pow(x, n));

    }
}
