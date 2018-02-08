package by.epam.preTraining.task2.dragon.view;

import by.epam.preTraining.task2.dragon.model.Dragon;

public class View {
    public static void printCountOfHeadsAndEyes(int age){
        System.out.println("Number of heads of dragon with age of " + age
                + " is " + Dragon.countHeadsOgDragon(age)
                + "; number of eyes is " + Dragon.countEyesOfDragon(age));
    }
}
