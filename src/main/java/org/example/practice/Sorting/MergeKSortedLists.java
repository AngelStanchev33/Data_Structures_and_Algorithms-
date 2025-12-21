package org.example.practice.Sorting;

import org.example.practice.LinkedLIst.ListNode;

public class MergeKSortedLists {

    public static ListNode<Integer> solution(ListNode<Integer>[] lists, int l, int r) {
        if (l == r) {
            return lists[l]; // базов случай – един списък
        }

        int m = l + (r - l) / 2;

        ListNode<Integer> left = solution(lists, l, m);
        ListNode<Integer> right = solution(lists, m + 1, r);

        return mergeTwoLists(left, right);
    }

    private static ListNode<Integer> mergeTwoLists(ListNode<Integer> left, ListNode<Integer> right) {
        return null;
    }


}
