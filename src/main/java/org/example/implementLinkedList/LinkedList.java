package org.example.implementLinkedList;

public class LinkedList {

    private Node head;

    public LinkedList() {
    }

    public void add(String data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node nodeToAdd = new Node(data);
            nodeToAdd.setNext(head);
            head = nodeToAdd;
        }
    }

    public void delete(int index) {
        if (index == 0) {
            head = head.getNext();
            return;
        }

        int count = 0;

        Node current = head;

        while (count <= index - 1 && current.getNext() != null) {
            count++;
            current = current.getNext();
        }

        if (current.getNext() == null) {
            return;
        }

        current.setNext(current.getNext().getNext());
    }

    public String get(int index) {
        if (index == 0) {
            return head.toString();
        }

        Node current = head;

        int count = 0;

        while (count <= index && current != null) {
            count++;
            current = current.getNext();
        }

        if (current == null) {
            throw new IndexOutOfBoundsException(STR."Index out of bounds: \{index}");
        }

        return current.toString();
    }
}
