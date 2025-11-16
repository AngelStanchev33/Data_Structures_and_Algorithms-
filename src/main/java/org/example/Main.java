package org.example;

import org.example.implementArrayList.AList;
import org.example.practice.removeDuplicatesFromSortedArray;
import org.example.practice.removeElement;

public class Main {
    public static void main(String[] args) {

        AList newList = new AList();
        newList.add(2);
        newList.add(2);
        newList.add(3);
        newList.add(1,4);
        newList.add(4,5);
        newList.add(4,6);
        newList.delete(5);

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