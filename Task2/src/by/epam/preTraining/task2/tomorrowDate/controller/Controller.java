package by.epam.preTraining.task2.tomorrowDate.controller;

import by.epam.preTraining.task2.tomorrowDate.model.TomorrowDate;
import by.epam.preTraining.task2.tomorrowDate.view.View;

public class Controller {
    public static void main(String[] args) {
        //task4
        View.print("Task4: ");
        int day = 23;
        int month = 12;
        int year = 1997;
        View.print("Today is " + day + "." + month + "." + year);
        View.print("Tomorrow is " + TomorrowDate.determineTomorrowDate(day, month, year));

    }
}
