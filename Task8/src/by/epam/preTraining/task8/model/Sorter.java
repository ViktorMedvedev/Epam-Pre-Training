package by.epam.preTraining.task8.model;

import java.util.Arrays;
import java.util.Random;

public class Sorter<T extends Comparable<T>> {
    private static final Random RND = new Random();

    public T[] bubbleSort(T[] arr) {
        int size = arr.length;
        int i = 0;
        boolean flag;
        while (i < size - 1) {
            flag = false;
            for (int j = 1; j < size - i; j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    swap(arr, j, j - 1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
            i++;
        }
        return arr;
    }

    public T[] insertionSort(T[] arr) {
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    swap(arr, j, j - 1);
                }
            }
        }
        return arr;
    }

    public T[] selectionSort(T[] arr) {
        int size = arr.length;
        int min;
        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
        return arr;
    }

    public T[] sortMerge(T[] arr) {
        int size = arr.length;
        if (size < 2) return arr;
        int middle = size / 2;
        return merge(sortMerge(Arrays.copyOfRange(arr, 0, middle)),
                sortMerge(Arrays.copyOfRange(arr, middle, size)));
    }

    private T[] merge(T[] array1, T[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int counter1 = 0;
        int counter2 = 0;
        int length = length1 + length2;
        T[] result = (T[]) new Comparable[length];
        for (int i = 0; i < length; i++) {
            if (counter2 < length2 && counter1 < length1) {
                if (array1[counter1].compareTo(array2[counter2]) > 0) {
                    result[i] = array2[counter2++];
                } else result[i] = array1[counter1++];
            } else if (counter2 < length2) {
                result[i] = array2[counter2++];
            } else {
                result[i] = array1[counter1++];
            }
        }
        return result;
    }

    public T[] quickSort(T[] arr) {
        sortQuick(arr, 0, arr.length - 1);
        return arr;
    }

    private int partition(T arr[], int low, int high) {
        int index = low + RND.nextInt(high - low + 1);
        T pivot = arr[index];
        swap(arr, index, high);
        for (int i = index = low; i < high; ++i) {
            if (arr[i].compareTo(pivot) < 0) {
                swap(arr, index++, i);
            }
        }
        swap(arr, index, high);
        return (index);
    }

    private void sortQuick(T arr[], int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            sortQuick(arr, low, partitionIndex - 1);
            sortQuick(arr, partitionIndex + 1, high);
        }
    }

    private void swap(T[] array, int i, int j) {
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}