package by.epam.preTraining.task3.mathematics.controller;

import by.epam.preTraining.task3.InputNumberException;
import by.epam.preTraining.task3.mathematics.view.View;

public class Controller {
    public static void main(String[] args) {
        try {

            int a = 12;
            int b = 18;
            int number = 8128;
            //task3.2.1
            View.printTheBiggestDigitInNaturalNumber(number);
            //task3.2.2
            View.printIsPalindrome(number);
            //task3.2.3
            View.printIsSimple(number);
            //task3.2.4
            View.printSimpleDividers(number);
            //task3.2.5
            View.findLcmAndGcd(a, b);
            //task3.2.6
            View.printCountOfDifferentDigits(number);

        } catch (InputNumberException e) {
            System.out.println("NATURAL numbers must be more than 0");
        }
    }
}
