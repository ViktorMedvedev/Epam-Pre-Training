package by.epam.preTraining.task2.moodDeterminer.view;

import by.epam.preTraining.task2.moodDeterminer.model.MoodDeterminer;

public class View {
    public static void printMood() {
        System.out.println("I think your mood is like "
                + MoodDeterminer.determineYourMood());
    }
}
