package by.epam.preTraining.task6.controller;

import by.epam.preTraining.task6.exception.TechnicalException;
import by.epam.preTraining.task6.model.businessLogic.PalindromeChecker;
import by.epam.preTraining.task6.view.Printer;

public class Main {
    public static void main(String[] args) {
        String s = "abcdcba";
        try {
            Printer.print(PalindromeChecker.isPalindrome(s));
        } catch (TechnicalException e) {
            Printer.print(e.getMessage());
        }
    }
}
