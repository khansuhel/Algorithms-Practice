package com.practice.ds.queue;

public class App {
    public static void main(String[] args) {
//        Queue q = new Queue();
//
//        System.out.println("Is Queue Empty: "+q.isQueueEmpty());
//
//        for (int i =1; i < 9; i++){
//            q.enQueue(i);
//        }
//
//        System.out.println("Is Queue Empty: "+q.isQueueEmpty());
//
//        for (int i = 1; i<9; i++){
//            System.out.println(q.deQueue() + " ");
//        }

        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        for(int i=1;i<9;i++)
            queue.enQueue(i);

        for (int j=1;j<9;j++)
            System.out.println(queue.deQueue());
    }
}
