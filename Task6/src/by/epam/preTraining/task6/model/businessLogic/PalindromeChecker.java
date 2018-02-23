package by.epam.preTraining.task6.model.businessLogic;

import by.epam.preTraining.task6.exception.TechnicalException;
import by.epam.preTraining.task6.model.containers.StackArrayFixed;

public class PalindromeChecker {
    public static boolean isPalindrome(String s) throws TechnicalException {
        int sizeFull = s.length();
        int sizeHalf = sizeFull / 2;
        StackArrayFixed<String> arrayFixed = new StackArrayFixed<>(sizeHalf);
        String array[] = s.split("");
        for (int i = 0; i + 1 < sizeFull; i++) {
            if (i < sizeHalf) {
                arrayFixed.push(array[i]);
            } else {
                if (s.length() % 2 == 0) {
                    if (!array[i].equals(arrayFixed.pop())) {
                        return false;
                    }
                } else {
                    if (!array[i + 1].equals(arrayFixed.pop())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
