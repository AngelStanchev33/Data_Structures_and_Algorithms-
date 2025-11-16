package org.example.practice;

import java.util.Arrays;

public class removeElement {

    public static int solution(int[] nums, int val) {
        int n = nums.length;

        int leftPointer = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[leftPointer] = nums[i];
                leftPointer++;
            }
        }

        return leftPointer;
    }
}
