package org.example.implementLinkedList;

public class Node {

    private String data;
    private Node next;

    public Node(String data) {
        this.data = data;
    }

    public String getData(String data) {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
