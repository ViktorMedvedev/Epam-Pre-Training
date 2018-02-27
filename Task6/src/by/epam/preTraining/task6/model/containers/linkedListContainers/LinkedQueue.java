package by.epam.preTraining.task6.model.containers.linkedListContainers;

import by.epam.preTraining.task6.exception.EmptyContainerException;

public class LinkedQueue<T> extends MyLinkedContainer {
    private Node last;

    public LinkedQueue() {
        top = null;
        last = null;
        size = 0;
    }

    public void enqueue(T object) {
        Node temp = last;
        last = new Node();
        last.object = object;
        last.next = null;
        if (isEmpty()) {
            top = last;
        } else {
            temp.next = last;
        }
        size++;
    }

    public T dequeue() throws EmptyContainerException {
        if (isEmpty()) {
            throw new EmptyContainerException("Queue underflow");
        }
        T object = (T) top.object;
        top = top.next;
        size--;
        return object;
    }
}
