package by.epam.preTraining.task2.vowelOrConsonant.controller;

import by.epam.preTraining.task2.tomorrowDate.view.View;
import by.epam.preTraining.task2.vowelOrConsonant.model.VowelOrConsonant;

public class Controller {
    public static void main(String[] args) {
        //task2
        View.print("Task2: ");
        char c1 = 'a';
        View.print(c1 + " is " + VowelOrConsonant.defineVowelOrConsonant1(c1));
        char c2 = 'b';
        View.print(c2 + " is " + VowelOrConsonant.defineVowelOrConsonant2(c2));
        char c3 = 'c';
        View.print(c3 + " is " + VowelOrConsonant.defineVowelOrConsonant3(c3));
        char c4 = 'y';
        View.print(c4 + " is " + VowelOrConsonant.defineVowelOrConsonant4(c4));
    }
}
