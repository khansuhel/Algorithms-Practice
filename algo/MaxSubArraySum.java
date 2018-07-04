package com.practice.algo;

public class MaxSubArraySum {

    static int mxSubArraySum(int[] input){
        int max_sum = input[0];
        int num=0;
        int i=0;
        while(i<input.length){
            num = num + input[i];

            if(num > max_sum){
                max_sum = num;
            }

            if(num<0){
                num = 0;
            }
            i++;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(mxSubArraySum(new int[]{1, -2, 3}));
    }

}
