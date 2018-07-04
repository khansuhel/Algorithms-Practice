package com.practice.algo.sort.quickSort;

public class HeapSortPractice {

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
            swap(arr, largest, i);
            max_heapify(arr, largest, n);
        }
    }

    private void swap(int[] arr, int largest, int i) {
        int c = arr[largest];
        arr[largest] = arr[i];
        arr[i] = c;
    }

    void sort(int[] arr) {
        int len = arr.length-1;

        for (int j = (len) / 2; j >= 0; j--) {
            max_heapify(arr, j, len);
        }

        for(int i=len;i>0;i--){
            swap(arr, 0, i);
            max_heapify(arr, 0,i);
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{23, 12, 45, 6, 7, 12, 11, 0};
        HeapSortPractice heapSortPractice = new HeapSortPractice();
        heapSortPractice.sort(input);

        for(int i: input)
            System.out.print(i+" ");
    }

}
