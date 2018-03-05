package by.epam.preTraining.task7.model;

import by.epam.preTraining.task7.exceptions.NoSuchValueException;

public class BinaryTree<T extends Comparable> {
    private Node root;
    private int nodeCount;

    public class Node<T2 extends Comparable> implements Comparable<T2> {
        Node left;
        Node right;
        T2 value;

        Node(T2 value) {
            this.value = value;
        }

        @Override
        public int compareTo(T2 o) {
            return value.compareTo(o);
        }
    }

    public void add(T value) {
        if (root == null) {
            root = new Node(value);
        } else {
            addRecursive(root, value);
        }
        nodeCount++;
    }

    private void addRecursive(Node node, T value) {
        if (value.compareTo(node.value) < 0) {
            if (node.left == null) {
                node.left = new Node(value);
            } else {
                addRecursive(node.left, value);
            }
        } else {
            if (node.right == null) {
                node.right = new Node(value);
            } else {
                addRecursive(node.right, value);
            }
        }
    }

    public boolean contains(T value) {
        return containsRecursive(root, value);
    }

    private boolean containsRecursive(Node current, T value) {
        if (current == null) {
            return false;
        }
        int result = value.compareTo(current.value);
        if (result == 0) {
            return true;
        }
        return result < 0 ? containsRecursive(current.left, value) : containsRecursive(current.right, value);
    }

    public void remove(T value) throws NoSuchValueException {
        removeRecursive(root, value);
    }

    private Node removeRecursive(Node current, T value) throws NoSuchValueException{
        if (current == null) {
            throw new NoSuchValueException("There is no such value in tree!");
        }
        int result = value.compareTo(current.value);
        if (result == 0) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
            T smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = removeRecursive(current.right, smallestValue);
            return current;
        }
        if (result < 0) {
            current.left = removeRecursive(current.left, value);
            return current;
        }
        current.right = removeRecursive(current.right, value);
        return current;
    }

    private T findSmallestValue(Node root) {
        return root.left == null ? (T) root.value : findSmallestValue(root.left);
    }

    public void clear() {
        root = null;
        nodeCount = 0;
    }

    public int size() {
        return nodeCount;
    }

    private StringBuilder traversePreOrderRecursive(Node node, StringBuilder s) {
        if (node != null) {
            s.append(node.value).append(" ");
            traversePreOrderRecursive(node.left, s);
            traversePreOrderRecursive(node.right, s);
        }
        return s;
    }

    private StringBuilder traversePostOrderRecursive(Node node, StringBuilder s) {
        if (node != null) {
            traversePostOrderRecursive(node.left, s);
            traversePostOrderRecursive(node.right, s);
            s.append(node.value).append(" ");
        }
        return s;
    }

    private StringBuilder traverseInOrderRecursive(Node node, StringBuilder s) {
        if (node != null) {
            traverseInOrderRecursive(node.left, s);
            s.append(node.value).append(" ");
            traverseInOrderRecursive(node.right, s);
        }
        return s;
    }

    public StringBuilder traversePreOrder() {
        return traversePreOrderRecursive(root, new StringBuilder());
    }

    public StringBuilder traversePostOrder() {
        return traversePostOrderRecursive(root, new StringBuilder());
    }

    public StringBuilder traverseInOrder() {
        return traverseInOrderRecursive(root, new StringBuilder());
    }

}

