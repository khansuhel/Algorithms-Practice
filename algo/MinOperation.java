package com.practice.algo;

public class MinOperation {
    int[][] prepareTable(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();

        int[][] temp = new int[aLength + 1][aLength + 1];

        for (int i = 0; i < aLength + 1; i++) {
            temp[0][i] = i;
        }

        for (int i = 0; i < bLength + 1; i++) {
            temp[i][0] = i;
        }

        for (int i = 1; i < aLength + 1; i++) {
            for (int j = 1; j < bLength + 1; j++) {
                if (aChar[i - 1] == bChar[j - 1]) {
                    temp[i][j] = temp[i - 1][j - 1];
                } else {
                    temp[i][j] = 1 + min(temp[i - 1][j], temp[i - 1][j - 1], temp[i][j - 1]);
                }
            }
        }
        return temp;
    }

    int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public void tellMeTheOperations(String a, String b) {
        int[][] temp = prepareTable(a, b);
        int i = temp[0].length-1;
        int j = temp.length-1;

        while (true) {
            if (i == 0 || j == 0) {
                break;
            }
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                System.out.println(a.charAt(i - 1) + " will remain " + b.charAt(j - 1));
                i--;
                j--;
            } else if (temp[i][j] == temp[i - 1][j - 1] + 1) {
                System.out.println("Replace, " + b.charAt(j - 1) + " with " + a.charAt(i - 1));
                i--;
                j--;

            } else if (temp[i][j] == temp[i - 1][j] + 1) {
                System.out.println("Delete " + a.charAt(i - 1) + " from String a");
                i--;
            } else if (temp[i][j] == temp[i][j - 1]) {
                System.out.println("Delete, " + b.charAt(j - 1) + " from String b");
                j--;
            } else {
                System.out.println("Algo nahi chal raha");
            }


        }

    }

    public static void main(String[] args) {
        MinOperation minOperation = new MinOperation();
        minOperation.tellMeTheOperations("suhel", "fuhrl");
    }
}
