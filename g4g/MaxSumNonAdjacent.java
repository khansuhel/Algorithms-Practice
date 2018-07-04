package com.practice.g4g;

public class MaxSumNonAdjacent {

    int max_sum(int[] input) {
        int incl = input[0];
        int excl = 0;

        for (int i = 1; i < input.length; i++) {
            int excl2 = Math.max(incl, excl);
            incl = input[i] + excl;
            excl = excl2;
        }

        return Math.max(incl,excl);
    }

    public static void main(String[] args) {
        MaxSumNonAdjacent maxSumNonAdjacent = new MaxSumNonAdjacent();
        int result = maxSumNonAdjacent.max_sum(new int[]{5, 5, 10, 100, 10, 5});
        System.out.println(result);
    }
}
