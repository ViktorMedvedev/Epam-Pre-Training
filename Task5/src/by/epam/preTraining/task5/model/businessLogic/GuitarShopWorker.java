package by.epam.preTraining.task5.model.businessLogic;

import by.epam.preTraining.task5.model.container.GuitarContainer;
import by.epam.preTraining.task5.model.exceptions.WrongCostException;
import by.epam.preTraining.task5.model.exceptions.WrongNumberOfStringsException;
import by.epam.preTraining.task5.model.generators.GuitarGenerator;
import by.epam.preTraining.task5.model.generators.GuitarShopGenerator;
import by.epam.preTraining.task5.model.guitarHierarchy.Guitar;

public class GuitarShopWorker {
    public Guitar findMostExpensiveGuitar(GuitarContainer<Guitar> guitarList) {
        Guitar expensiveGuitar = null;
        int maxCost = 0;
        for (Guitar guitar : guitarList) {
            if (guitar.getCost() > maxCost) {
                maxCost = guitar.getCost();
                expensiveGuitar = guitar;
            }
        }
        return expensiveGuitar;
    }

    public Guitar findCheapesrGuitar(GuitarContainer<Guitar> guitarList) {
        Guitar cheapGuitar = null;
        int minCost = GuitarGenerator.MAX_COST;
        for (Guitar guitar : guitarList) {
            if (guitar.getCost() < minCost) {
                minCost = guitar.getCost();
                cheapGuitar = guitar;
            }
        }
        return cheapGuitar;
    }

    public GuitarContainer<Guitar> getGuitarList() throws WrongCostException, WrongNumberOfStringsException {
        return new GuitarContainer<>(GuitarShopGenerator.generateGuitarShop());
    }
}
