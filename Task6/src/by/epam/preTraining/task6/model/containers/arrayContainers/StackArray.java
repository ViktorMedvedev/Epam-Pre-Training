package by.epam.preTraining.task6.model.containers.arrayContainers;


import by.epam.preTraining.task6.exception.EmptyContainerException;
import by.epam.preTraining.task6.exception.FullContainerException;

public abstract class StackArray<T> extends MyArrayContainer{

    public abstract void push(T element) throws EmptyContainerException, FullContainerException;
    public T pop() throws EmptyContainerException {
        if (top>-1) {
            return (T) array[top--];
        }throw new EmptyContainerException("Can not get element from empty container");
    }

    public T peek() throws EmptyContainerException {
        if (top>-1) {
            return (T) array[top];
        }throw new EmptyContainerException("Can not get element from empty array");
    }
}
