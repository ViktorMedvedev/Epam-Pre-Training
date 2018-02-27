package by.epam.preTraining.task6.model.containers.arrayContainers;

import by.epam.preTraining.task6.exception.EmptyContainerException;

public abstract class MyArrayContainer<T> {
    protected int size;
    protected T[] array;
    protected int top;

    public abstract T peek() throws EmptyContainerException;

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
