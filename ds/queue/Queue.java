package com.practice.ds.queue;

public class Queue<E> {
    private Node head;
    private Node tail;
    private boolean isQueueEmpty = true;

    public void enQueue(E data){
        if(head==null){
            head = tail = new Node(data);
            isQueueEmpty = false;
        }
        else{
            Node nextNode = new Node(data);
            tail.next = nextNode;
            tail = tail.next;
        }
    }

    public E deQueue(){
        E data;
        if(isQueueEmpty){
            throw new IllegalStateException();
        }else{
            data = (E) head.data;
            if(head == tail){
                isQueueEmpty = true;
                head = tail = null;
            }else{
                head = head.next;
            }
        }
        return data;
    }

    public E top(){
        if(!isQueueEmpty)
            return (E) head.data;
        else
            throw new IllegalStateException();
    }

    public boolean isQueueEmpty(){
        return this.isQueueEmpty;
    }

}
