package by.epam.preTraining.task4.pow.model;

public class Pow {
    public static double powRecursion(double x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * powRecursion(x, n - 1);
    }

    public static double powIteration(double x, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
}
