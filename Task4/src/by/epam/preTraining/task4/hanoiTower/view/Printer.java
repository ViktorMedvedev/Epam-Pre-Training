package by.epam.preTraining.task4.hanoiTower.view;

import by.epam.preTraining.task4.hanoiTower.model.HanoiTower;

public class Printer {
    public static void printMovings(int n, char a, char b, char c) {
        System.out.println("The decision of task is:");
        HanoiTower.moveTower(n, a, b, c);
    }
}
