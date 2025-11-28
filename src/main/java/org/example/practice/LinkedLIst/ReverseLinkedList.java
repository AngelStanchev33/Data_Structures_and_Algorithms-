package org.example.practice.LinkedLIst;


import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {

    public static <T> ListNode<T> solution(ListNode<T> head) {
        ListNode<T> current = head;
        ListNode<T> prev = null;

        while (current != null) {
            ListNode<T> temp = current.getNext();
            current.setNext(prev);
            prev = current;
            current = temp;

        }

        return prev;
    }
}


