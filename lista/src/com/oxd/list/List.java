package com.oxd.list;

public abstract class List<T extends Comparable<T>> {

    protected Node<T> head;
    protected Integer size;

    protected List() {
        head = null;
        size = 0;
    }

    public Integer size() {
        return this.size;
    }

    public void removeFirst() {
        if (head == null) return;
        head = head.getNext();
        size--;
    }

    public void removeLast() {
        if (head == null) return;

        if (head.getNext() == null) {
            head = null;
            size--;
            return;
        }

        for (Node<T> node = head; node != null; node = node.getNext()) {
            if (node.getNext().getNext() == null) {
                node.setNext(null);
            }
        }
        size--;
    }

    public T get(Integer index) {
        Node<T> target = head;

        for (int i = 0; i < index; i++) {
            target = target.getNext();
        }

        return target.getValue();
    }

    public void remove(T obj) {
        if (head == null) return;

        if (head.getValue().equals(obj)) {
            head = head.getNext();
            size--;
            return;
        }

        for (Node<T> node = head; node != null; node = node.getNext()) {
            if (node.getNext().getValue().equals(obj)) {
                node.setNext(node.getNext().getNext());
                break;
            }
        }
        size--;
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
