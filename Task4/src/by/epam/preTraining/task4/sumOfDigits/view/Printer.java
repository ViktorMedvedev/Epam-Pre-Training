package by.epam.preTraining.task4.sumOfDigits.view;

import by.epam.preTraining.task4.sumOfDigits.model.SumCounter;

public class Printer {
    public static void printSumOfDigits(int number){
        System.out.println("Sum of digits of " + number
                + " is " + SumCounter.countSumOfDigits(number));
    }
}
