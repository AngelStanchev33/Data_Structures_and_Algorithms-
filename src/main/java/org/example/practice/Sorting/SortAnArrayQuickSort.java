package org.example.practice.Sorting;

public class SortAnArrayQuickSort {

    public static int[] solution(int[] arr, int s, int e) {
        int left = s;

        if (s >= e) {
            return arr;
        }

        for (int i = s; i < e; i++) {
            if (arr[i] < arr[e]) {
                int temp = arr[i];
                arr[i] = arr[s];
                arr[s] = temp;
                s++;
            }
        }
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        solution(arr, left, s - 1);
        solution(arr, s + 1, e);

        return arr;
    }
}
