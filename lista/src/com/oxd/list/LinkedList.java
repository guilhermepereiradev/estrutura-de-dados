package com.oxd.list;

public class LinkedList<T extends Comparable<T>> extends List<T> {

    public void insertAtBeginning(T value) {
        Node<T> aux = new Node<>(value);
        aux.setNext(head);
        head = aux;
        size++;
    }

    public void insertAtEnd(T value) {
        if (head == null) {
            this.insertAtBeginning(value);
            return;
        }

        Node<T> last = null;
        for (Node<T> node = head; node != null; node = node.getNext()) {
            last = node;
        }

        last.setNext(new Node<>(value));
        size++;
    }
}
