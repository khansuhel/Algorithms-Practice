package com.practice.leetcode.easy;

import java.util.Arrays;

public class LeetCodeWordDistance {
    public static int dist(String[] data, String a, String b) {
        int state=0; //tristate 0, 1, 2
        int length = data.length;
        int previous = 0;
        int distance = Integer.MAX_VALUE;

        for (int i=0; i<length; i++) {
            String str = data[i];
            if (str.equals(a)||str.equals(b)) {
                if (state==0) {
                    state= str.equals(a)? 1:2;
                    previous=i;
                }
                else if (state==1) {
                    if (str.equals(b)) //found b
                    {
                        if (distance>i-previous) distance = i-previous;
                        state=2;
                    }
                    previous=i;
                }
                else if (state==2) {
                    if (str.equals(a)) //found a
                    {
                        if (distance>i-previous) distance=i-previous;
                        state = 1;
                    }
                    previous=i;
                }
            }
        }
        if(state==0) throw new IllegalArgumentException("Not found");
        return distance;
    }

    public static void main(String[] args) {
       int res = dist(new String[]{"suhel","is","the","an","suhel","khan"},"suhel","khan");
        System.out.println(res);
    }
}
