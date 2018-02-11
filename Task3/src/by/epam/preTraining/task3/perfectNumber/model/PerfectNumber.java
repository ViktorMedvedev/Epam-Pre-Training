package by.epam.preTraining.task3.perfectNumber.model;

import by.epam.preTraining.task3.InputNumberException;

public class PerfectNumber {

    private static int findSumOfDividers(int number) throws InputNumberException {
        if (number > 0) {
            int sum = 1;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            return sum;
        } else {
            throw new InputNumberException();
        }
    }

    public static boolean isPerfectNumber(int number) throws InputNumberException {
        return number == findSumOfDividers(number);

    }
}

