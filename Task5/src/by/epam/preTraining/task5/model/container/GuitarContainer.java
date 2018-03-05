package by.epam.preTraining.task5.model.container;

public class GuitarContainer<T> extends DynamicArray<T> {
    public GuitarContainer() {
        this.arr = (T[]) new Object[10];
        this.cursor = 0;
    }

    public GuitarContainer(T... arr) {
        this.arr = arr;
        this.cursor = arr.length;
    }

    public GuitarContainer(DynamicArray<T> array) {
        this.arr = array.arr;
        this.cursor = array.cursor;
    }
}
