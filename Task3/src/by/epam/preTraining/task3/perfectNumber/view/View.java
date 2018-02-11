package by.epam.preTraining.task3.perfectNumber.view;

import by.epam.preTraining.task3.InputNumberException;
import by.epam.preTraining.task3.perfectNumber.model.PerfectNumber;

public class View {
    public static void printIsPerfect(int number) throws InputNumberException {
        System.out.println("The statement that " + number
                + " is perfect is " + PerfectNumber.isPerfectNumber(number));
    }
}
