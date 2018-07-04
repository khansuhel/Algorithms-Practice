package com.practice.java.concurrency;

public class Executor {
    public static void main(String[] args) throws InterruptedException {
        EvenOddPrinter eop = new EvenOddPrinter();

        Thread t1 = new Thread(eop);
        Thread t2 = new Thread(eop);

        t1.start();
        t2.start();
    }
}
