package by.epam.preTraining.task5.controller;

import by.epam.preTraining.task5.model.exceptions.LogicExeption;
import by.epam.preTraining.task5.model.businessLogic.GuitarShopWorker;
import by.epam.preTraining.task5.model.container.DynamicArray;
import by.epam.preTraining.task5.model.guitarHierarchy.Guitar;
import by.epam.preTraining.task5.view.Printer;

public class Main {
    public static void main(String[] args) {
        try {
            DynamicArray<Guitar> guitarList = GuitarShopWorker.getGuitarList();
            for (Guitar guitar : guitarList) {
                Printer.print(guitar.toString());
            }
            System.out.println();
            Printer.print("The most expensive guitar in shop is "
                    + GuitarShopWorker.findMostExpensiveGuitar(guitarList).toString());
            Printer.print("The cheapest guitar in shop is "
                    + GuitarShopWorker.findCheapesrGuitar(guitarList).toString());
        } catch (LogicExeption e){
            e.getMessage();
        }
    }
}
