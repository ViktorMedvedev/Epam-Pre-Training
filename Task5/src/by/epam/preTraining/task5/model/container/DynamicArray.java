package by.epam.preTraining.task5.model.container;

import by.epam.preTraining.task5.model.exceptions.TechnicalException;

import java.util.Iterator;

public class DynamicArray<T> implements Iterable<T> {
    protected T[] arr;
    protected int cursor;

    public DynamicArray() {
        this.arr = (T[]) new Object[10];
        this.cursor = 0;
    }

    public DynamicArray(T... arr) {
        this.arr = arr;
        this.cursor = arr.length;
    }

    public DynamicArray(DynamicArray<T> array) {
        this.arr = array.arr;
        this.cursor = array.cursor;
    }

    public int countElements() {
        return arr.length;
    }

    public boolean isEmpty() {
        return arr.length == 0;
    }

    public T get(int index) throws TechnicalException {
        try {
            return arr[index];
        } catch (IndexOutOfBoundsException e) {
            throw new TechnicalException("No such index in borders of array", e);
        }
    }

    public void add(T obj) {
        int size = countElements();
        if (cursor >= size) {
            T[] temp = arr;
            arr = (T[]) new Object[size * 3 / 2 + 1];
            for (int i = 0; i < size; i++) {
                arr[i] = temp[i];
            }
        }
        arr[cursor++] = obj;
    }


    public void add(T... arr) {
        for (T obj : arr) {
            add(obj);
        }
    }

    public void remove(int index) throws TechnicalException {
        try {
            for (int i = index; i < countElements() - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[cursor--] = null;
        } catch (IndexOutOfBoundsException e) {
            throw new TechnicalException("No such index in borders of array", e);
        }
    }

    public void clear() {
        arr = (T[]) new Object[0];
        cursor = 0;

    }

    public boolean contains(T obj) {
        boolean result = false;
        if (obj == null) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == null) {
                    result = true;
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (obj.equals(arr[i])) {
                    result = true;
                }
            }
        }
        return result;
    }

    public boolean contains(T... arr) {
        for (T obj : arr) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < arr.length && arr[currentIndex] != null;
            }

            @Override
            public T next() {
                return arr[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
