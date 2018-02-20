package by.epam.preTraining.task4.validator;

import by.epam.preTraining.task4.exception.WrongNumberException;

public class Validator {
    public static void isNatural(int... numbers) throws WrongNumberException {

        for (int number : numbers) {
            if (number <= 0) {
                throw new WrongNumberException(number + " is not a natural number!");
            }
        }
    }

    public static void isPositive(int... numbers) throws WrongNumberException {
        for (int number : numbers) {
            if (number < 0) {
                throw new WrongNumberException(number + " is not a positive number!");
            }
        }
    }

    public static void isZero(double... numbers) throws WrongNumberException {

        for (double number : numbers) {
            if (number == 0) {
                throw new WrongNumberException(number + " is equals 0!");
            }
        }
    }
}