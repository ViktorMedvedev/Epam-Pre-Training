package by.epam.preTraining.task8.controller;

import by.epam.preTraining.task8.model.Searcher;
import by.epam.preTraining.task8.model.Sorter;
import by.epam.preTraining.task8.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorter<Integer> sorter = new Sorter<>();
        Searcher<Integer> searcher = new Searcher<>();
        Integer arr1[] = {3, 0, 9, 19, 422, 12, 3, 4, 665, 42, 11};
        Integer arr2[] = {31, 10, 19, 119, 4122, 112, 13, 14, 1665, 142, 111};
        Integer arr3[] = {3, 20, 90, 109, 42, 120, 3, 0, 66, 4, 1};
        Integer arr4[] = {31, 50, 39, 19, 422, 12, 3, 4, 665, 42, 11};
        Integer arr5[] = {32, 20, 69, 19, 22, 152, 33, 42, 65, 422, 111};
        Printer.print(searcher.linearSearch(arr1, 19));
        Printer.print(searcher.binarySearchIterative(arr2, 11));
        Printer.print(searcher.binarySearchRecursive(arr3, 11));
        Printer.print(Arrays.toString(sorter.bubbleSort(arr1)));
        Printer.print(Arrays.toString(sorter.insertionSort(arr2)));
        Printer.print(Arrays.toString(sorter.selectionSort(arr3)));
        Printer.print(Arrays.toString(sorter.sortMerge(arr4)));
        Printer.print(Arrays.toString(sorter.quickSort(arr5)));

    }
}
