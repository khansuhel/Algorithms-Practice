package com.practice.ds.stack;

public class  Stack<E> {

    Node head;
    Node tail;
    public boolean isStackEmpty=true;

    public void push(E data){
        if(head == null){
            head = tail = new Node(data);
            this.isStackEmpty = false;
        }else{
            Node newNode = new Node(data);
            newNode.prev = head;
            head = newNode;
        }
    }

    public E pop(){
        E retData;
        if(this.isStackEmpty){
            throw new IllegalStateException();
        }else{
            retData = (E) head.data;
            if(head == tail){
                head = tail = null;
                this.isStackEmpty = true;
            }else {
                head = head.prev;
            }
        }
        return retData;
    }

    public E top(){
        if(isStackEmpty){
            throw  new IllegalStateException();
        }else{
            return (E) head.data;
        }
    }
}
