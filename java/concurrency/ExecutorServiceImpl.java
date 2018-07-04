package com.practice.java.concurrency;

import java.util.concurrent.*;

public class ExecutorServiceImpl {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newSingleThreadExecutor();

        Future result10 = es.submit(new FactorialCalculator((long)10));

        long result = (long) result10.get();

        System.out.println(result);

        if(!es.awaitTermination(800, TimeUnit.MILLISECONDS))
            es.shutdown();

    }


}
