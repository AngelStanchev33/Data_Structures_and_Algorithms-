package org.example.practice.Sorting;

public class SortAnArrayInsertionSort {

    public static int[] solution(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            int current = i;

            while (j >= 0 && nums[current] < nums[j]) {
                int temp = nums[j];
                nums[j] = nums[current];
                nums[current] = temp;
                j--;
                current--;
            }
        }

        return null;
    }


    public static int[] quickSOrt(int[] num, int s, int e) {
        return null;
    }

}
