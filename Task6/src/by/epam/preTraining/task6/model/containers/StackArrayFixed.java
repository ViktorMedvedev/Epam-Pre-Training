package by.epam.preTraining.task6.model.containers;

import by.epam.preTraining.task6.exception.TechnicalException;

import java.util.Arrays;

public class StackArrayFixed<T> extends StackArray {
    public StackArrayFixed(int maxSize) {
        size = maxSize;
        array = (T[])new Object[maxSize];
        top = -1;
    }

    @Override
    public void push(Object element) throws TechnicalException {
        if (top<size-1) {
            array[++top] = element;
        }else {
            throw new TechnicalException("Array size can't be negative");
        }
    }

    @Override
    public String toString() {
        return "StackArrayFixed{" +
                "size=" + size +
                ", stackArray=" + Arrays.toString(array) +
                '}';
    }

}
