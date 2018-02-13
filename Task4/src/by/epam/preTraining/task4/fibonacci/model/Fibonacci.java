package by.epam.preTraining.task4.fibonacci.model;

public class Fibonacci {
    public static int findFibonacciNumber(int index) {
        int fib;
        if (index == 1) {
            fib = 0;
        } else if (index == 2) {
            fib = 1;
        } else {
            fib = findFibonacciNumber(index-1) + findFibonacciNumber(index -2 );
        }return fib;
    }
}
