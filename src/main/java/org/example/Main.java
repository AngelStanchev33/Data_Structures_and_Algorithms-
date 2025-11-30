package org.example;

import org.example.practice.ArrayList.RemoveDuplicatesFromSortedArray;
import org.example.practice.ArrayList.RemoveElement;
import org.example.practice.LinkedLIst.BrowserHistory;
import org.example.practice.LinkedLIst.ListNode;
import org.example.practice.LinkedLIst.MergeTwoSortedLists;
import org.example.practice.LinkedLIst.ReverseLinkedList;
import org.example.practice.Queue.NumberOfStudentsUnableToEatLunch;
import org.example.practice.Recursive.ReverseLinkedListRecursiveAndIteration;


public class Main {
    public static void main(String[] args) {

        removeDuplicatesFromSortedArray();

        removeElement();

        reverseLinkedList();

        mergeTwoSortedLists();

        browserHistory();

        numberOfStudentsUnableToEatLunch();

        reverseLinkedListRecursiveAndIteration();
    }

    public static void removeDuplicatesFromSortedArray() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        RemoveDuplicatesFromSortedArray.solution(nums);
    }

    public static void removeElement() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        RemoveElement.solution(nums, val);
    }

    public static void reverseLinkedList() {
        ListNode<Integer> head = new ListNode<>(1);
        head.setNext(new ListNode<>(2));
        head.getNext().setNext(new ListNode<>(3));
        head.getNext().getNext().setNext(new ListNode<>(4));
        head.getNext().getNext().getNext().setNext(new ListNode<>(5));

        ReverseLinkedList.solution(head);
    }

    public static void mergeTwoSortedLists() {
        ListNode<Integer> list1Head = new ListNode<>(1);
        list1Head.setNext(new ListNode<>(2));
        list1Head.getNext().setNext(new ListNode<>(4));

        ListNode<Integer> list2Head = new ListNode<>(1);
        list2Head.setNext(new ListNode<>(3));
        list2Head.getNext().setNext(new ListNode<>(4));

        MergeTwoSortedLists.solution(list1Head, list2Head);

    }

    public static void browserHistory() {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");
        browserHistory.visit("facebook.com");
        browserHistory.visit("youtube.com");
        browserHistory.back(1);
        browserHistory.visit("linkedin.com");
        browserHistory.forward(2);
        browserHistory.back(2);
        browserHistory.back(7);
    }

    public static void numberOfStudentsUnableToEatLunch() {
        int[] students = {1, 1, 1, 0, 0, 1};
        int[] sandwiches = {1, 0, 0, 0, 1, 1};

        NumberOfStudentsUnableToEatLunch.solution(students, sandwiches);
        NumberOfStudentsUnableToEatLunch.solution2(students, sandwiches);
    }

    public static void reverseLinkedListRecursiveAndIteration() {
        ListNode<Integer> head = new ListNode<>(1);
        ListNode<Integer> current = head;

        for (int i = head.getData() + 1; i <= 5; i++) {
            ListNode<Integer> noteToAdd = new ListNode<>(i);

            current.setNext(noteToAdd);
            current = noteToAdd;
        }

        ListNode<Integer> lastNode = ReverseLinkedListRecursiveAndIteration.solution(head);
        System.out.println();
    }


}