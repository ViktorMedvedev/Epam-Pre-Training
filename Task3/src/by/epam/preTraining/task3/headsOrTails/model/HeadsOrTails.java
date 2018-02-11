package by.epam.preTraining.task3.headsOrTails.model;

import by.epam.preTraining.task3.InputNumberException;

import java.util.Random;

public class HeadsOrTails {

    public static int countHeads(int countOfTries) throws InputNumberException {
        if (countOfTries >= 0) {
            int counter = 0;
            Random random = new Random();
            for (int i = 0; i < countOfTries; i++) {
                if (random.nextBoolean()) {
                    counter++;
                }
            }
            return counter;
        } else {
            throw new InputNumberException();
        }
    }
}
