package by.epam.preTraining.task4.fibonacci.controller;

import by.epam.preTraining.task4.fibonacci.model.Fibonacci;
import by.epam.preTraining.task4.fibonacci.view.Printer;

public class Main {
    public static void main(String[] args) {
        //task 4.4
        int index = 8;
        Printer.printFibonacciNumber("The fibonacci number with index " + index
                + " is " + Fibonacci.findFibonacciNumber(index));
    }
}
