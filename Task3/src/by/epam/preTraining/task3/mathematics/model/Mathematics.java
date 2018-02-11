package by.epam.preTraining.task3.mathematics.model;

import by.epam.preTraining.task3.InputNumberException;

public class Mathematics {
    public static int theBiggestDigitInNaturalNumber(int number) throws InputNumberException {
        int theBigOne;
        if (number > 0) {
            theBigOne = number % 10;
            while (number != 0) {
                number /= 10;
                if (number % 10 > theBigOne) {
                    theBigOne = number % 10;
                }
            }
        } else {
            throw new InputNumberException();
        }
        return theBigOne;
    }

    public static boolean isPalindrome(int number)throws InputNumberException {
        return number == reverseNumber(number);
    }

    private static int reverseNumber(int number) throws InputNumberException {
        if (number > 0) {
            int reversedNumber = 0;
            while (number > 0) {
                reversedNumber *= 10;
                reversedNumber += number % 10;
                number /= 10;
            }
            return reversedNumber;
        } else {
            throw new InputNumberException();
        }

    }

    public static boolean isSimple(int number) throws InputNumberException {
        if (number > 0) {
            for (int i = 2; i < number; i++) {
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
        String simpleDividers = "";
        if (number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0 && isSimple(i)) {
                    simpleDividers += i + " ";
                }
            }
            return simpleDividers;
        } else {
            throw new InputNumberException();
        }

    }

    public static int findGCD(int a, int b) throws InputNumberException {
        if (a > 0 && b > 0) {
            int c;
            while (a != 0) {
                c = b % a;
                b = a;
                a = c;
            }
            return b;
        } else {
            throw new InputNumberException();
        }
    }

    public static int findLCM(int a, int b) throws InputNumberException {
        if (a > 0 && b > 0) {
            int max = a * b;
            for (int i = 2; i <= max; i++) {
                if (i % a == 0 && i % b == 0) {
                    max = i;
                }
            }
            return max;
        } else {
            throw new InputNumberException();
        }
    }


    public static int countOfDifferentDigits(int number) throws InputNumberException {
        if (number > 0) {
            boolean willRepeat;
            int counter = 0;
            int lastDigit;
            int remain;
            while (number > 0) {
                willRepeat = false;
                lastDigit = number % 10;
                number /= 10;
                remain = number;
                while (remain > 0) {
                    if (lastDigit == remain % 10) {
                        willRepeat = true;
                        break;
                    }
                    remain /= 10;
                }
                if (!willRepeat) {
                    counter++;
                }
            }
            return counter;
        } else {
            throw new InputNumberException();
        }
    }
}



