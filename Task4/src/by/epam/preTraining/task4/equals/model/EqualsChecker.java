package by.epam.preTraining.task4.equals.model;

import by.epam.preTraining.task4.Validator;
import by.epam.preTraining.task4.sumOfDigits.model.SumCounter;

public class EqualsChecker {
    public static boolean defineIfEquals(int n, int s) {
        if (Validator.isNonNegative(n) && Validator.isNonNegative(s)) {
            int sum = SumCounter.countSumOfDigits(n);
            return s == sum;
        }
        return false;
    }
}
