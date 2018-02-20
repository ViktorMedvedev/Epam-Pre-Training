package by.epam.preTraining.task4.pow.controller;

import by.epam.preTraining.task4.exception.WrongNumberException;
import by.epam.preTraining.task4.pow.model.Pow;
import by.epam.preTraining.task4.validator.Validator;
import by.epam.preTraining.task4.view.Printer;

public class Main {
    public static void main(String[] args) {
        //task4.2
        double x = -0.5;
        int n = -3;
        try {
            Validator.isZero(x);
            Printer.print("Result of x^n = " + Pow.powRecursion(x, n));
            Printer.print("Result of x^n = " + Pow.powIteration(x, n));
        }catch (WrongNumberException e){
            e.getMessage();
        }

    }
}
