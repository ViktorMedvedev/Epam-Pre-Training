package by.epam.preTraining.task4.fibonacci.controller;

import by.epam.preTraining.task4.Validator;
import by.epam.preTraining.task4.fibonacci.model.Fibonacci;
import by.epam.preTraining.task4.view.Printer;

public class Main {
    public static void main(String[] args) {
        //task 4.4
        int index = 1;
        if (Validator.isNatural(index)) {
            Printer.print("The fibonacci number with index " + index
                    + " is " + Fibonacci.findFibonacciNumber(index));
        }
    }
}
