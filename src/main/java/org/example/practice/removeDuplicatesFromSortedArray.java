package org.example.practice;

public class removeDuplicatesFromSortedArray {

    public static int solution(int[] num) {
        int n = num.length;

        int leftPointer = 1;

        for (int i = 1; i < n; i++) {
            int previousValue = i - 1;

            if (num[i] != num[previousValue]) {
                num[leftPointer] = num[i];
                leftPointer++;
            }
        }

        return leftPointer;
    }


}


