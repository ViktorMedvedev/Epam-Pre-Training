package by.epam.preTraining.task4.hanoiTower.controller;

import by.epam.preTraining.task4.hanoiTower.model.HanoiTower;
import by.epam.preTraining.task4.hanoiTower.view.Printer;

public class Main {
    public static void main(String[] args) {
        //task4.5
        int n = 3;
        char a = 'A';
        char b = 'B';
        char c = 'C';
        Printer.printMovings("The decision of task is:");
        HanoiTower.moveTower(n, a, b, c);
    }
}
