package com.practice.algo.sort;

public class HeapSort {

    void max_heapify(int[] arr, int i, int n) {
        int largest = 0;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[i]) {
            largest = left;
        } else {
            largest = i;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, largest, i);
            max_heapify(arr, largest, n);
        }
    }

    void swap(int[] arr, int a, int b) {
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;

    }

    void heap_sort(int[] arr) {
        int indexLen = arr.length - 1;
        int m = indexLen / 2;

        while (m >= 0) {
            max_heapify(arr, m, indexLen);
            m--;
        }

        for (int i = indexLen; i >= 0; i--) {
            swap(arr, i, 0);
            max_heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{23, 12, 45, 6, 7, 12, 11, 0};
        HeapSort hs = new HeapSort();
        hs.heap_sort(input);

        for (int i : input)
            System.out.print(i + ",");
    }

}
