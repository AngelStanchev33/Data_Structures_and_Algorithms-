package org.example.practice.LinkedLIst;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists {

    public static <T extends Comparable<T>> ListNode<T> solution(ListNode<T> list1, ListNode<T> list2) {
        ListNode<T> dummy = new ListNode<>(null);
        ListNode<T> current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.getData().compareTo(list2.getData()) <= 0) {
                current.setNext(list1);
                list1 = list1.getNext();
            } else {
                current.setNext(list2);
                list2 = list2.getNext();
            }
            current = current.getNext();
        }

        if (list1 != null) {
            current.setNext(list1);
        } else if (list2 != null) {
            current.setNext(list2);
        }

        return dummy.getNext();
    }
}
