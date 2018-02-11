package by.epam.preTraining.task3.mathematics.view;

import by.epam.preTraining.task3.InputNumberException;
import by.epam.preTraining.task3.mathematics.model.Mathematics;

public class View {
    public static void printTheBiggestDigitInNaturalNumber(int number) throws InputNumberException {
        System.out.println("The biggest digit in natural number "
                + number + " is " + Mathematics.theBiggestDigitInNaturalNumber(number));
    }

    public static void printIsPalindrome(int number) throws InputNumberException {
        System.out.println("The statement that "
                + number + " is palindrome is " + Mathematics.isPalindrome(number));
    }

    public static void printIsSimple(int number) throws InputNumberException {
        System.out.println("The statement that "
                + number + " is simple is " + Mathematics.isSimple(number));
    }

    public static void printSimpleDividers(int number) throws InputNumberException {
        System.out.println("The simple dividers of number "
                + number + " are " + Mathematics.findSimpleDividers(number));
    }

    public static void findLcmAndGcd(int a, int b) throws InputNumberException {
        System.out.println("The LCM is "
                + Mathematics.findLCM(a, b) + ", the GCD is " + Mathematics.findGCD(a, b));
    }

    public static void printCountOfDifferentDigits(int number) throws InputNumberException {
        System.out.println("The count of different digits of "
                + number + " is " + Mathematics.countOfDifferentDigits(number));
    }
}
