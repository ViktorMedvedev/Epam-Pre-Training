package by.epam.preTraining.task4.sumOfDigits.controller;

import by.epam.preTraining.task4.sumOfDigits.model.SumCounter;
import by.epam.preTraining.task4.sumOfDigits.view.Printer;

public class Main {
    public static void main(String[] args) {
        //task4.1
        int number = -123;
        Printer.printSumOfDigits("Sum of digits of " + number
                + " is " + SumCounter.countSumOfDigits(number));
    }
}
