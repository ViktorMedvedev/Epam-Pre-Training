package by.epam.preTraining.task6.model.containers.linkedListContainers;


import by.epam.preTraining.task6.exception.EmptyContainerException;

public class LinkedStack<T> extends MyLinkedContainer {

    public LinkedStack() {
        top = null;
        size = 0;
    }

    public void push(T object) {
        Node temp = top;
        top = new Node();
        top.object = object;
        top.next = temp;
        size++;
    }

    public T pop() throws EmptyContainerException {
        if (isEmpty()) {
            throw new EmptyContainerException("Container is empty!");
        }
        T object = (T) top.object;
        top = top.next;
        size--;
        return object;
    }
}

