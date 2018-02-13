package by.epam.preTraining.task4.pow.view;

import by.epam.preTraining.task4.pow.model.Pow;

public class Printer {
    public static void printPow(double x, int n){
        System.out.println("Result of x^n = " + Pow.pow(x, n));
    }
}
