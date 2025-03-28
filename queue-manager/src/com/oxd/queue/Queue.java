package com.oxd.queue;

public class Queue<T extends Comparable<T>> {
    protected Node<T> head;
    protected Integer size;

    public Queue() {
        head = null;
        size = 0;
    }

    public Integer size() {
        return this.size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node<T> last = null;
        for (Node<T> node = head; node != null; node = node.getNext()) {
            last = node;
        }

        last.setNext(newNode);
        size++;
    }

    public T dequeue() {
        if (head == null) return null;

        Node<T> aux = head;
        head = head.getNext();
        size--;
        return aux.getValue();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (head == null) {

            sb.append("[ ]");
            return sb.toString();
        }

        for (Node<T> node = head; node != null; node = node.getNext()) {
            sb.append(node);
            sb.append("\n");
        }

        return sb.toString();
    }
}
