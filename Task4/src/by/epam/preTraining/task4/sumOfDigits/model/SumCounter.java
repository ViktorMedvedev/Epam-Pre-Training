package by.epam.preTraining.task4.sumOfDigits.model;

public class SumCounter {
    public static int countSumOfDigits(int number) {
        int sumOfDigits;
        if (number > 0) {
            sumOfDigits = countSumOfDigits(number / 10) + number % 10;
        } else {
            sumOfDigits = 0;
        }
        return sumOfDigits;
    }
}
