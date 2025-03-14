package com.oxd.list;

public class Stack<T extends Comparable<T>> {
    protected Node<T> head;
    protected Integer size;

    public Stack() {
        head = null;
        size = 0;
    }

    public void deflate() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Integer size() {
        return this.size;
    }

    public void stack(T value) {
        Node<T> aux = new Node<>(value);
        if (head == null) {
            aux.setNext(head);
            head = aux;
            size++;
            return;
        }

        for (Node<T> node = head; node != null; node = node.getNext()) {
            aux = node;
        }

        aux.setNext(new Node<>(value));
        size++;
    }

    public T unstack() {
        Node<T> aux = new Node<>();
        if (head == null) return null;

        if (head.getNext() == null) {
            aux = head;
            head = null;
            size--;
            return aux.getValue();
        }

        for (Node<T> node = head; node != null; node = node.getNext()) {
            if (node.getNext().getNext() == null) {
                aux = node.getNext();
                node.setNext(null);
            }
        }
        size--;
        return aux.getValue();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" [ ");

        if (head == null) {
            sb.append(" ] ");
            return sb.toString();
        }

        for (Node<T> node = head; node != null; node = node.getNext()) {
            sb.append(node);
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append(" ]");
        return sb.toString();
    }
}
