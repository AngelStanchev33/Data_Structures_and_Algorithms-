package org.example.practice.LinkedLIst;

public class ListNode<T> {

    private T data;
    private ListNode<T> next;

    private ListNode<T> prev;

    public ListNode(T data) {
        this.data = data;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public ListNode<T> getPrev() {
        return prev;
    }

    public void setPrev(ListNode<T> prev) {
        this.prev = prev;
    }

    public void setData(T data) {
        this.data = data;
    }
}
