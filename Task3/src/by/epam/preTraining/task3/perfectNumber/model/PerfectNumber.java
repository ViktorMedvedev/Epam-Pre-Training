package by.epam.preTraining.task3.perfectNumber.model;

import by.epam.preTraining.task3.InputNumberException;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) throws InputNumberException {
        if (number > 0) {
            int sum = 1;
            int iterations = number / 2;
            for (int i = 2; i <= iterations; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            return number == sum;
        } else {
            throw new InputNumberException();
        }
    }
}

