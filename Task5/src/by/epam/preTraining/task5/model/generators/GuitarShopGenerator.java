package by.epam.preTraining.task5.model.generators;

import by.epam.preTraining.task5.model.container.DynamicArray;
import by.epam.preTraining.task5.model.exceptions.WrongCostException;
import by.epam.preTraining.task5.model.exceptions.WrongNumberOfStringsException;
import by.epam.preTraining.task5.model.guitarHierarchy.Guitar;

import java.util.Random;

public class GuitarShopGenerator {
    public static final int MAX_QUANTITY = 200;
    public static final int MIN_QUANTITY = 20;

    public static DynamicArray<Guitar> generateGuitarShop() throws WrongCostException, WrongNumberOfStringsException {
        DynamicArray<Guitar> guitarList = new DynamicArray<>();
        Random random = new Random();
        GuitarGenerator generator = GuitarGenerator.getInstance();
        int size = random.nextInt(MAX_QUANTITY - MIN_QUANTITY + 1) + MIN_QUANTITY;
        for (int i = 0; i <= size; i++) {
            guitarList.add(generator.generateGuitar());
        }
        return guitarList;
    }
}
