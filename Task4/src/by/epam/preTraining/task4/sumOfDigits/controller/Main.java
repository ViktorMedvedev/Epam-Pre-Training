package by.epam.preTraining.task4.sumOfDigits.controller;

import by.epam.preTraining.task4.Validator;
import by.epam.preTraining.task4.sumOfDigits.model.SumCounter;
import by.epam.preTraining.task4.view.Printer;

public class Main {
    public static void main(String[] args) {
        //task4.1
        int number = 123;
        if (Validator.isNatural(number)) {
            Printer.print("Sum of digits of " + number
                    + " is " + SumCounter.countSumOfDigits(number));
        }
    }
}
