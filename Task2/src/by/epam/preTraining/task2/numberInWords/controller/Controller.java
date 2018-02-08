package by.epam.preTraining.task2.numberInWords.controller;

import by.epam.preTraining.task2.dragon.view.View;
import by.epam.preTraining.task2.numberInWords.model.NumberInWords;

public class Controller {
    public static void main(String[] args) {
        //task5
        View.print("Task5: ");
        int number = 200;
        View.print(number + "");
        View.print(NumberInWords.parseNumberInString(number));
    }
}
