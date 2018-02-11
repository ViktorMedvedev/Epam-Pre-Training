package by.epam.preTraining.task3.headsOrTails.view;

import by.epam.preTraining.task3.InputNumberException;
import by.epam.preTraining.task3.headsOrTails.model.HeadsOrTails;

public class View {
    public static void printCountOfHeadsAndTails(int number)throws InputNumberException{
        int countOfHeads = HeadsOrTails.countHeads(number);
        int countOfTails = number - countOfHeads;
        System.out.println("There are " + number + " attempts, number of heads is "
                + countOfHeads + ", number of tails is " + countOfTails);
    }
}
