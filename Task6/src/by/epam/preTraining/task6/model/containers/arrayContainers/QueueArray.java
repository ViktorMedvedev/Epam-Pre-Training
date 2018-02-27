package by.epam.preTraining.task6.model.containers.arrayContainers;

import by.epam.preTraining.task6.exception.EmptyContainerException;

public abstract class QueueArray<T> extends MyArrayContainer {
    public abstract void enqueue(T element) throws EmptyContainerException;
    public T dequeue() throws EmptyContainerException {
        if (top > -1) {
            T result = (T) array[0];
            for (int i = 1; i < size; i++) {
                array[i - 1] = array[i];
            }
            array[size - 1] = null;
            top--;
            return result;
        }
        throw new EmptyContainerException("Can not get element from empty container");
    }
    public T peek() throws EmptyContainerException{
        if (top > -1) {
            return (T) array[0];
        }
        throw new EmptyContainerException("Can not get element from empty container");
    }
}

