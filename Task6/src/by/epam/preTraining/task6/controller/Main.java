package by.epam.preTraining.task6.controller;

import by.epam.preTraining.task6.exception.EmptyContainerException;
import by.epam.preTraining.task6.exception.FullContainerException;
import by.epam.preTraining.task6.model.businessLogic.PalindromeChecker;
import by.epam.preTraining.task6.view.Printer;

public class Main {
    public static void main(String[] args) {
        String s = "abcba";
        try {
            Printer.print(PalindromeChecker.isPalindrome(s));
        } catch (EmptyContainerException | FullContainerException e) {
            Printer.print(e.getMessage());
        }
    }
}
