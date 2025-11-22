package org.example;

import org.example.implementLinkedList.LinkedList;
import org.example.practice.removeDuplicatesFromSortedArray;
import org.example.practice.removeElement;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add("Angel");
        linkedList.add("Dani");
        linkedList.add("Blago");

        System.out.println(linkedList);

        linkedList.delete(0);

        //Remove Duplicates from Sorted Array
        removeDuplicatesFromSortedArray();

        //Remove Element
        removeElement();

    }

    public static void removeDuplicatesFromSortedArray() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        removeDuplicatesFromSortedArray.solution(nums);
    }

    public static void removeElement() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        removeElement.solution(nums, val);
    }
}