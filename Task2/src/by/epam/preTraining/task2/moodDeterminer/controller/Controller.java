package by.epam.preTraining.task2.moodDeterminer.controller;


import by.epam.preTraining.task2.moodDeterminer.model.MoodDeterminer;
import by.epam.preTraining.task2.tomorrowDate.view.View;

public class Controller {
    public static void main(String[] args) {
        //task3
        View.print("Task3: ");
        View.print("I think your mood is like " + MoodDeterminer.determineYourMood());
    }
}
