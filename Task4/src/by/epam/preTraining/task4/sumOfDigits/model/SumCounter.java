package by.epam.preTraining.task4.sumOfDigits.model;

public class SumCounter {
    public static int countSumOfDigitsRecursive(int number) {
        if (number < 10) {
            return number;
        }
        return countSumOfDigitsRecursive(number / 10) + number % 10;
    }

    public static int countSumOfDigitsIteration(int number) {
        int sumOfDigits = 0;
        while (number > 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        return sumOfDigits;
    }
}

