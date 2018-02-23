package by.epam.preTraining.task6.model.containers;

import by.epam.preTraining.task6.exception.TechnicalException;

public abstract class MyArrayContainer<T> {
    protected int size;
    protected T[] array;
    protected int top;

    public abstract T peek() throws TechnicalException;

    public int size() {
        return array.length;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

}
