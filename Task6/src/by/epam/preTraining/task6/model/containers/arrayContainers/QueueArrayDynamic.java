package by.epam.preTraining.task6.model.containers.arrayContainers;

import java.util.Arrays;

public class QueueArrayDynamic<T> extends QueueArray {
    public QueueArrayDynamic() {
        size = 5;
        array = (T[]) new Object[size];
        top = -1;
    }

    @Override
    public void enqueue(Object element) {
        if (top == size - 1) {
            T[] temp = (T[]) array;
            array = (T[]) new Object[size * 3 / 2 + 1];
            for (int i = 0; i < size; i++) {
                array[i] = temp[i];
            }
            size = size * 3 / 2 + 1;
        }

        for (int i = size - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        top++;
        array[0] = element;
    }

    @Override
    public String toString() {
        return "QueueArrayDynamic{" +
                "size=" + size +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
