package by.epam.preTraining.task4.equals.model;

public class EqualsChecker {
    public static boolean defineIfEqualsRecursive(int n, int s) {
        if (n != 0) {
            s -= n % 10;
            n /= 10;
            return defineIfEqualsRecursive(n, s);
        }
        return s == 0;

    }

    public static boolean defineIfEqualsIteration(int n, int s) {
        while (n != 0) {
            s -= n % 10;
            n /= 10;
        }
        return s == 0;
    }
}

