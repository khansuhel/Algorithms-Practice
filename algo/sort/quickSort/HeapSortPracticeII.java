package com.practice.algo.sort.quickSort;

public class HeapSortPracticeII {

    void max_heapify(int[] arr, int i, int n) {

        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = 0;

        if (left < n && arr[left] > arr[i]) {
            largest = left;
        } else {
            largest = i;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            max_heapify(arr, largest, n);
        }

    }

    private void swap(int[] arr, int i, int largest) {
        int c = arr[i];
        arr[i] = arr[largest];
        arr[largest] = c;
    }

}
