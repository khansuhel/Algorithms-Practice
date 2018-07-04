package com.practice.ds.queue;

import com.practice.ds.stack.Stack;

public class QueueUsingTwoStacks {
    Stack s1 = new Stack();
    Stack s2 = new Stack();

    public void enQueue(int data){
        s1.push(data);
    }

    public int deQueue(){
        if(s1.isStackEmpty && s2.isStackEmpty)
            throw new IllegalStateException();
        else{
            if(s2.isStackEmpty){
                while (!s1.isStackEmpty){
                    s2.push(s1.pop());
                }
            }
            return (int) s2.pop();
        }
    }
}
