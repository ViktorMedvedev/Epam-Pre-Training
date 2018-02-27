package by.epam.preTraining.task6.model.containers.linkedListContainers;

import by.epam.preTraining.task6.exception.EmptyContainerException;

public class MyLinkedContainer<T> {
    protected int size;
    protected Node top;

    // helper linked list class
    protected class Node {
        protected T object;
        protected Node next;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public T peek() throws EmptyContainerException {
        if (isEmpty()) throw new EmptyContainerException("Container is empty");
        return top.object;
    }
}

