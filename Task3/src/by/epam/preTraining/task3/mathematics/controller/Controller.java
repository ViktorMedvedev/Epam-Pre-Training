package by.epam.preTraining.task3.mathematics.controller;

import by.epam.preTraining.task3.InputNumberException;
import by.epam.preTraining.task3.mathematics.model.Mathematics;
import by.epam.preTraining.task3.view.Printer;

public class Controller {
    public static void main(String[] args) {
        try {
            int a = 12;
            int b = 18;
            int number = 8128;
            //task3.2.1
            Printer.print("The biggest digit in natural number "
                    + number + " is " + Mathematics.theBiggestDigitInNaturalNumber(number));
            //task3.2.2
            Printer.print("The statement that "
                    + number + " is palindrome is " + Mathematics.isPalindrome(number));
            //task3.2.3
            Printer.print("The statement that "
                    + number + " is simple is " + Mathematics.isSimple(number));
            //task3.2.4
            Printer.print("The simple dividers of number "
                    + number + " are " + Mathematics.findSimpleDividers(number));
            //task3.2.5
            Printer.print("The LCM is "
                    + Mathematics.findLCM(a, b) + ", the GCD is " + Mathematics.findGCD(a, b));
            //task3.2.6
            Printer.print("The count of different digits of "
                    + number + " is " + Mathematics.countDifferentDigits(number));

        } catch (InputNumberException e) {
            System.out.println("NATURAL numbers must be more than 0");
        }
    }
}
