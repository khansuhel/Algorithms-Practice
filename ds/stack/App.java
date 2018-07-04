package com.practice.ds.stack;

public class App {
    public static void main(String[] args) {
        Stack s  = new Stack();

        System.out.println("is Stack Empty: "+ s.isStackEmpty);

        for(int i =1;i<9;i++){
            s.push(i);
        }

        System.out.println("is Stack Empty: "+ s.isStackEmpty);

        for (int i =1;i<9;i++){
            System.out.println(s.pop());
        }


    }
}
