package org.example.implementLinkedList;

public class Queue {

    private Node head;
    private Node tail;

    public void enqueue(String data) {
        Node dataToAdd = new Node(data);

        if (head == null) {
            head = dataToAdd;
            tail = dataToAdd;
        } else {
            dataToAdd.setPrev(tail);
            tail.setNext(dataToAdd);
            tail = dataToAdd;
        }
    }

    public void dequeue() {
        if (head == null) {
            throw new IndexOutOfBoundsException("Que is empty");
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
        }
    }
}
