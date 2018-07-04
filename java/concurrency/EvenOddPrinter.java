package com.practice.java.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenOddPrinter  implements Runnable{

    private int num = 0;
    private static Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock){
            while (num++<10){
                System.out.println(num + " - "+Thread.currentThread().getName());
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lock.notifyAll();
        }
    }
}
