package by.epam.preTraining.task4.equals.view;

import by.epam.preTraining.task4.equals.model.EqualsChecker;

public class Printer {
    public static void printIfEquals(int n, int s){
        System.out.println("The statement, that sum of digits of "
                + n + " and number " + s + " are equals is "
                + EqualsChecker.defineIfEquals(n, s));
    }
}
