package by.epam.preTraining.task4.fibonacci.controller;
import by.epam.preTraining.task4.fibonacci.model.Fibonacci;
import by.epam.preTraining.task4.view.Printer;

public class Main {
    public static void main(String[] args) {
        //task 4.4
        int index = 10;
        Printer.print("The fibonacci number with index " + index
                + " is " + Fibonacci.findFibonacciNumberRecursive(index));
        Printer.print("The fibonacci number with index " + index
                + " is " + Fibonacci.findFibonacciNumberIteration (index));
    }
}

