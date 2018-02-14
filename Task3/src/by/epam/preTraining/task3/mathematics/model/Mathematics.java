package by.epam.preTraining.task3.mathematics.model;

import by.epam.preTraining.task3.InputNumberException;

public class Mathematics {
    public static int theBiggestDigitInNaturalNumber(int number) throws InputNumberException {
        int theBigOne = 0;
        if (number > 0) {
            while (number != 0) {
                if (number % 10 > theBigOne) {
                    theBigOne = number % 10;
                }
                number /= 10;
            }
        } else {
            throw new InputNumberException();
        }
        return theBigOne;
    }

    public static boolean isPalindrome(int number) throws InputNumberException {
        if (number > 0) {
            int originalNumber = number;
            int reversedNumber = 0;
            while (number > 0) {
                reversedNumber *= 10;
                reversedNumber += number % 10;
                number /= 10;
            }
            return originalNumber == reversedNumber;
        } else {
            throw new InputNumberException();
        }

    }

    public static boolean isSimple(int number) throws InputNumberException {
        if (number > 0) {
            int iterations = (int) Math.ceil(Math.sqrt(number));
            for (int i = 2; i < iterations; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            throw new InputNumberException();
        }
    }

    public static String findSimpleDividers(int number) throws InputNumberException {
        StringBuilder simpleDividers = new StringBuilder();
        if (number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0 && isSimple(i)) {
                    simpleDividers.append(i).append(" ");
                }
            }
            return simpleDividers.toString();
        } else {
            throw new InputNumberException();
        }

    }

    public static int findGCD(int a, int b) throws InputNumberException {
        if (a > 0 && b > 0) {
            while (a != 0) {
                int c = b % a;
                b = a;
                a = c;
            }
            return b;
        } else {
            throw new InputNumberException();
        }
    }

    public static int findLCM(int a, int b) throws InputNumberException {
        return a * b / findGCD(a, b);
    }


    public static int countDifferentDigits(int number) throws InputNumberException {
        if (number > 0) {
            int count = 0;
            String digitInString;
            StringBuilder differentDigits = new StringBuilder();
            while (number > 0) {
                digitInString = String.valueOf(number % 10);
                if (!differentDigits.toString().contains(digitInString)) {
                    differentDigits.append(digitInString);
                    count++;
                }
                number /= 10;
            }
            return differentDigits.length();
        } else {
            throw new InputNumberException();
        }
    }
}



