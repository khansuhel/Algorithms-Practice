package com.practice.g4g;

import java.util.HashMap;

public class MinimumNumberOfJumps {
    static int minJumps(int[] input) {

        if (input.length == 0)
            return -1;
        if (input[0] == 0)
            return -1;

        int maxReach = input[0];
        int step = input[0];
        int jump = 1;

        for (int i = 0; i < input.length; i++) {

            if (i == input.length - 1)
                return jump;

            maxReach = Math.max(maxReach, i + input[i]);

            step--;

            if (step == 0) {
                jump++;
                step = maxReach - i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        HashMap map;

        int arr[] = new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        // calling minJumps method
        System.out.println(minJumps(arr));
    }
}
