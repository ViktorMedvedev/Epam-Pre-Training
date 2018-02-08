package by.epam.preTraining.task2.dragon.controller;

import by.epam.preTraining.task2.dragon.model.Dragon;
import by.epam.preTraining.task2.tomorrowDate.view.View;

public class Controller {
    public static void main(String[] args) {
        //task1
        View.print("Task1: ");
        int age = 400;
        View.print("Number of heads of dragon with age of " + age
                + " is " + Dragon.countHeadsOgDragon(age)
                + "; number of eyes is " + Dragon.countEyesOfDragon(age));

    }
}
