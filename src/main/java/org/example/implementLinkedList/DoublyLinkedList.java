package org.example.implementLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.size = 0;
    }

    public void add(String data) {
        Node noteToAdd = new Node(data);

        if (head == null) {
            head = noteToAdd;
            tail = noteToAdd;

            size++;
        } else {

            // Закачаме новия елемент след tail
            noteToAdd.setPrev(tail); // новият сочи назад
            tail.setNext(noteToAdd);  // старият tail сочи напред към новия

            tail = noteToAdd;

            size++;
        }
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Out of bounds");
        }

        Node current;
        if (index == 0) { // премахваме head
            current = head;
            head = head.getNext();
            if (head != null) head.setPrev(null);
        } else if (index == size - 1) { // премахваме tail
            current = tail;
            tail = tail.getPrev();
            if (tail != null) tail.setNext(null);
        } else if (index <= size / 2) { // по-близо до head
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            Node prev = current.getPrev();
            Node next = current.getNext();
            prev.setNext(next);
            next.setPrev(prev);
        } else { // по-близо до tail
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.getPrev();
            }
            Node prev = current.getPrev();
            Node next = current.getNext();
            prev.setNext(next);
            next.setPrev(prev);
        }

        size--;
    }

}



