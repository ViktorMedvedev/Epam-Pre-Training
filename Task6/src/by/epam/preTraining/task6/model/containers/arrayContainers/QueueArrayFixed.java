package by.epam.preTraining.task6.model.containers.arrayContainers;

import by.epam.preTraining.task6.exception.EmptyContainerException;

import java.util.Arrays;

public class QueueArrayFixed<T> extends QueueArray {
    public QueueArrayFixed(int maxSize) {
        size = maxSize;
        array = (T[]) new Object[maxSize];
        top = -1;
    }

    @Override
    public void enqueue(Object element) throws EmptyContainerException {
        if (top < size - 1) {
            for (int i = size - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            top++;
            array[0] = element;
        } else {
            throw new EmptyContainerException("Container is full");
        }
    }

    @Override
    public String toString() {
        return "QueueArrayFixed{" +
                "size=" + size +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
