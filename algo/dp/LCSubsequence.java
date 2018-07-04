package com.practice.algo.dp;

public class LCSubsequence {

    public static void lengthOfLCS(char[] a, char[] b) {
        int rowLen = a.length + 1;
        int columnLen = b.length + 1;

        int[][] dp = new int[columnLen][rowLen];

        for (int i = 1; i < columnLen; i++) {
            for (int j = 1; j < rowLen; j++) {
                if (b[i - 1] == a[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        for (int i = 0; i < columnLen; i++) {
            for (int j = 0; j < rowLen; j++) {
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }

        System.out.println("Length of LCS is: " + dp[columnLen - 1][rowLen - 1]);


        int i =a.length;
        int j = b.length;

        while(i>0 && j>0){
            if(a[i-1]==b[j-1]){
                System.out.println(a[i-1]);
                i--;j--;
            }else if(dp[j][i] == dp[j][i-1]){
                i--;
            }else {
                j--;
            }
        }
    }

    public static int max(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

    public static void main(String[] args) {
        lengthOfLCS("abcdaf".toCharArray(), "acbcf".toCharArray());
    }
}
