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
            insertAtBeginning(value);
            return;
        }

        Node<T> last = null;
        for (Node<T> node = head; node != null; node = node.getNext()) {
            last = node;
        }

        last.setNext(new Node<>(value));
        size++;
    }

    public void change(Integer index, T newValue) {
        Node<T> target = head;

        for (int i = 0; i < index; i++) {
            if (target.getNext() == null) {
                throw new RuntimeException("Elemento nâo encontrado");
            }
            target = target.getNext();
        }

        target.setValue(newValue);
    }

    public void insertAt(Integer index, T value) {
        if (index >= size) throw new RuntimeException("Index fora do tamanho da lista");

        if (index == 0) {
            insertAtBeginning(value);
            return;
        }

        if (index == size - 1) {
            insertAtEnd(value);
            return;
        }

        Node<T> node = head;

        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }

        Node<T> newNode = new Node<>(value);
        newNode.setNext(node.getNext());
        node.setNext(newNode);
    }

    public void removeAt(Integer index) {
        if (index >= size) throw new RuntimeException("Index fora do tamanho da lista");

        if (index == 0) {
            removeFirst();
            return;
        }

        if (index == size - 1) {
            removeLast();
            return;
        }

        Node<T> node = head;

        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }

        node.setNext(node.getNext().getNext());
    }
}
