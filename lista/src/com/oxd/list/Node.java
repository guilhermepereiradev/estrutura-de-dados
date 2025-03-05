package com.oxd.list;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {

    private T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public int compareTo(Node<T> o) {
        return this.value.compareTo(o.value);
    }
}
