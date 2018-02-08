package by.epam.preTraining.task2.numberInWords.view;

import by.epam.preTraining.task2.numberInWords.model.NumberInWords;

public class View {
    public static void printNumberInWords(int number){
        System.out.println("Your number is " + number + "."
                + " Number in words is " + NumberInWords.parseNumberInString(number));
    }
}
