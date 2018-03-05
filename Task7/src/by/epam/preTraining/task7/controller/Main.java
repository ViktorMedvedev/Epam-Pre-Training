package by.epam.preTraining.task7.controller;

import by.epam.preTraining.task7.exceptions.NoSuchValueException;
import by.epam.preTraining.task7.model.BinaryTree;
import by.epam.preTraining.task7.view.Printer;

public class Main {

    public static void main(String[] args) {
        try {
            BinaryTree<Integer> tree = new BinaryTree<>();
            tree.add(0);
            tree.add(2);
            tree.add(3);
            tree.add(4);
            tree.add(5);
            tree.add(1);
            tree.add(8);
            tree.add(6);
            tree.add(7);
            Printer.print(tree.size());
            Printer.print(tree.traversePreOrder());
            Printer.print(tree.traverseInOrder());
            Printer.print(tree.traversePostOrder());
            Printer.print(tree.contains(2));
            tree.remove(2);
            Printer.print(tree.traversePreOrder());
            Printer.print(tree.contains(2));
            tree.remove(3);
            Printer.print(tree.traverseInOrder());
            tree.remove(1);
            Printer.print(tree.traverseInOrder());
            tree.clear();
            Printer.print(tree.size());
        } catch (NoSuchValueException e) {
            e.getMessage();
        }
    }
}

