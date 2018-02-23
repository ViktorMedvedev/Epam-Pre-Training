package by.epam.preTraining.task6.model.containers;

import by.epam.preTraining.task6.exception.TechnicalException;

public abstract class StackArray<T> extends MyArrayContainer{

    public abstract void push(T element) throws TechnicalException;
    public T pop() throws TechnicalException {
        if (top>-1) {
            return (T) array[top--];
        }throw new TechnicalException("Can not get element from empty array");
    }

    public T peek() throws TechnicalException {
        if (top>-1) {
            return (T) array[top];
        }throw new TechnicalException("Can not get element from empty array");
    }

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
