package by.epam.preTraining.task4.fibonacci.view;

import by.epam.preTraining.task4.fibonacci.model.Fibonacci;

public class Printer {
    public static void printFibonacciNumber(int index){
        System.out.println("The fibonacci number with index " + index
                + " is " + Fibonacci.findFibonacciNumber(index));
    }
}
