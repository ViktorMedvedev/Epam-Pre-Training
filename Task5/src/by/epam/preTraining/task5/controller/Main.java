package by.epam.preTraining.task5.controller;

import by.epam.preTraining.task5.model.exceptions.LogicExeption;
import by.epam.preTraining.task5.model.exceptions.TechnicalException;
import by.epam.preTraining.task5.model.businessLogic.GuitarShopWorker;
import by.epam.preTraining.task5.model.container.DynamicArray;
import by.epam.preTraining.task5.model.guitarHierarchy.Guitar;
import by.epam.preTraining.task5.view.Printer;

public class Main {
    public static void main(String[] args) throws TechnicalException, LogicExeption {
        GuitarShopWorker worker = new GuitarShopWorker();
        DynamicArray<Guitar> guitarList = worker.getGuitarList();
        for (Guitar guitar : guitarList) {
            Printer.print(guitar.toString());
        }
        System.out.println();
        Printer.print("The most expensive guitar in shop is "
                + worker.findMostExpensiveGuitar(guitarList).toString());
        Printer.print("The cheapest guitar in shop is "
                + worker.findCheapesrGuitar(guitarList).toString());
    }
}
