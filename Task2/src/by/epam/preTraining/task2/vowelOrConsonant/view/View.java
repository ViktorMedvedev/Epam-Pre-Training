package by.epam.preTraining.task2.vowelOrConsonant.view;

import by.epam.preTraining.task2.vowelOrConsonant.model.VowelOrConsonant;

public class View {
    public static void printVowelOrConsonant(char c) {
        System.out.println(c + " is " + VowelOrConsonant.defineVowelOrConsonant1(c));
    }
}
