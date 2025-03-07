package com.oxd.list;

public class OrderedList<T extends Comparable<T>> extends List<T> {

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            return;
        }

        if(head.compareTo(newNode) > 0) {
            newNode.setNext(head);
            head = newNode;
            size++;
            return;
        }

        for (Node<T> node = head; node != null; node = node.getNext()) {

            if(node.getNext() == null) {
                node.setNext(newNode);
                break;
            }

            if (node.getNext().compareTo(newNode) > 0 || node.getNext().compareTo(newNode) == 0) {
                newNode.setNext(node.getNext());
                node.setNext(newNode);
                break;
            }
        }

        size++;
    }
}
