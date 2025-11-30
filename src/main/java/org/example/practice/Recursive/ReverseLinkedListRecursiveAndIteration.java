package org.example.practice.Recursive;

import org.example.practice.LinkedLIst.ListNode;

public class ReverseLinkedListRecursiveAndIteration {

    public static ListNode<Integer> solution(ListNode<Integer> head) {
        if (head.getNext() == null) {
            return head;
        }

        ListNode<Integer> last = solution(head.getNext());

        head.getNext().setNext(head);
        head.setNext(null);

        return last;
    }
}
