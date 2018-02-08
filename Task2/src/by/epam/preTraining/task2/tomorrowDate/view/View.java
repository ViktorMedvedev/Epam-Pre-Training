package by.epam.preTraining.task2.tomorrowDate.view;

import by.epam.preTraining.task2.tomorrowDate.model.TomorrowDate;

public class View {
    public static void printTomorrowsDate(int day, int month, int year ){
        System.out.println("Today is " + day + "." + month + "." + year + "." + "\r\n"
                + "Tomorrow is " + TomorrowDate.determineTomorrowDate(day, month, year));
    }
}
