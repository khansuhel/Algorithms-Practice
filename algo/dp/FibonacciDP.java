package com.practice.algo.dp;

public class FibonacciDP {


    static Integer[] arr = new Integer[11];

    int fibNormal(int n) {
        if (n <= 1)
            return n;
        return fibNormal(n - 1) + fibNormal(n - 2);
    }

    int fibDP(int n) {
        if (n <= 1)
            return n;
        if (arr[n - 1] != null) {
            return arr[n - 1];
        } else {
            int answer = fibDP(n - 1) + fibDP(n - 2);
            arr[n-1] = answer;
            return answer;
        }
    }

    public static void main(String[] args) {
        FibonacciDP fdp = new FibonacciDP();
        long startTime = System.nanoTime();
        int answerDP = fdp.fibDP(10);
        long endTime = System.nanoTime();
        System.out.println(answerDP + " ran in : " + (endTime - startTime)+"ns");
//        startTime = System.nanoTime();
//        int answer = fdp.fibNormal(10);
//        endTime = System.nanoTime();
//        System.out.println(answer + " ran in : " + (endTime - startTime)+"ns");

        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }

    }
}
