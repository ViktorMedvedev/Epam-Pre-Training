package by.epam.preTraining.task4.fibonacci.model;

public class Fibonacci {
    public static int findFibonacciNumberRecursive(int index) {
        if (index == 1 || index == 2) {
            return index - 1;
        }
        if (index > 2) {
            return findFibonacciNumberRecursive(index - 1) + findFibonacciNumberRecursive(index - 2);
        }
        return -1;
    }

    public static int findFibonacciNumberIteration(int index) {
        int result = -1;
        if (index == 1 || index == 2) {
            result = index - 1;
        }
        if (index > 2) {
            int fibonacciFirst = 0;
            int fibonacciSecond = 1;
            for (int i = 3; i <= index; i++) {
                result = fibonacciFirst + fibonacciSecond;
                fibonacciFirst = fibonacciSecond;
                fibonacciSecond = result;
            }
        }
        return result;
    }
}
