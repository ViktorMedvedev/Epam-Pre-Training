package by.epam.preTraining.task4.hanoiTower.controller;

import by.epam.preTraining.task4.exception.WrongNumberException;
import by.epam.preTraining.task4.hanoiTower.model.HanoiTower;
import by.epam.preTraining.task4.validator.Validator;
import by.epam.preTraining.task4.view.Printer;

public class Main {
    public static void main(String[] args) {
        //task4.5
        int n = 3;
        char a = 'A';
        char b = 'B';
        char c = 'C';
        try {
            Validator.isNatural(n);
            Printer.print("The decision of task is:" + "\r\n" + HanoiTower.moveTower(n, a, b, c));
        } catch (WrongNumberException e) {
            e.getMessage();
        }
    }
}
