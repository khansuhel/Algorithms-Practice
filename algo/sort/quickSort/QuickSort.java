package com.practice.algo.sort.quickSort;

public class QuickSort {

    int partition(int[] arr, int l, int r) {
        int x = arr[r];
        int i = l - 1;

        for (int j = l; j < r; j++) {
            if (arr[j] <= x) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, r);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }

    void quicklySort(int[] arr, int l, int r) {
        if (l < r) {
            int q = partition(arr, l, r);
            quicklySort(arr, l, q-1);
            quicklySort(arr, q+1,r);
        }
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] input  = new int[]{12, 11, 13, 5, 6, 7};
        quickSort.quicklySort(input, 0, input.length-1);

        for(int i:input){
            System.out.print(i+" ");
        }
    }

}
