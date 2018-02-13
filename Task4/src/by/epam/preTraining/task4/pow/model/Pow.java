package by.epam.preTraining.task4.pow.model;

public class Pow {
    public static double pow(double x, int n) {
        double p = 1;
        if (n > 0) {
                p = pow(x, n - 1) * x;
        } else if (n < 0) {
                p = pow(x, n + 1) / x;
        }
        return p;
    }
}
