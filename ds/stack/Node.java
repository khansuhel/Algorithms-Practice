package com.practice.ds.stack;

public class Node<E> {
    E data;
    Node prev;

    Node(E data){
        this.data = data;
        prev = null;
    }
}
