package by.epam.preTraining.task4.equals.model;

import by.epam.preTraining.task4.sumOfDigits.model.SumCounter;

public class EqualsChecker {
    public static boolean defineIfEquals(int n, int s){
        int sum = SumCounter.countSumOfDigits(n);
        return s == sum;
    }
}
