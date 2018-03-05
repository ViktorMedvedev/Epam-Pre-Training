package by.epam.preTraining.task8.model;

public class Searcher<T extends Comparable<T>> {

    public int linearSearch(T[] array, T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(value) == 0) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearchIterative(T[] array, T value) {
        return binarySearchIteration(array, value, 0, array.length - 1);
    }

    private int binarySearchIteration(T[] array, T value, int low, int high) {

        while (low <= high) {
            int mid = Math.round((low + high) / 2);
            if (array[mid].compareTo(value) < 0) {
                low = mid + 1;
            } else if (array[mid].compareTo(value) > 0) {
                high = mid - 1;
            } else if (array[mid].compareTo(value) == 0) {
                return mid;
            }
        }
        return -1;
    }

    public int binarySearchRecursive(T[] array, T value) {
        return binarySearchRecurse(array, value, 0, array.length - 1);
    }

    private int binarySearchRecurse(T[] arr, T value, int low, int high) {
        int mid = Math.round((low + high) / 2);

        if (high < low) {
            return -1;
        }
        if (value.compareTo(arr[mid]) == 0) {
            return mid;
        } else if (value.compareTo(arr[mid]) < 0) {
            return binarySearchRecurse(arr, value, low, mid - 1);
        } else {
            return binarySearchRecurse(arr, value, mid + 1, high);
        }
    }
}