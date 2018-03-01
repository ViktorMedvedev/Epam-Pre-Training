package by.epam.preTraining.task6.model.containers.arrayContainers;

import java.util.Arrays;

public class StackArrayDynamic<T> extends StackArray<T> {
    public StackArrayDynamic() {
        size = 10;
        array = (T[])new Object[size];
        top = -1;
    }

    @Override
    public void push(T element) {
        if (top == size - 1) {
            T[] temp = (T[]) array;

            array = (T[])new Object[size * 3 / 2 + 1];
            for (int i = 0; i < size; i++) {
                array[i] = temp[i];
            } size = size * 3 / 2 + 1;
        }
        array[++top] = element;
    }

    @Override
    public String toString() {
        return "StackArrayDynamic{" +
                "size=" + size +
                ", stackArray=" + Arrays.toString(array) +
                '}';
    }
}


