package com.practice.leetcode.easy;

public class Sqrt {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int i = 1;
        while ((i * i) <= x) {
            i++;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        int res = sqrt.mySqrt(9);
    }
}
