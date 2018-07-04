package com.practice.ds.binaryheaps;

import java.util.Arrays;

public class Max_Heapify {

    public void justDoIt(HeapNode[] nodes, int i, int length){
        int left = 2*i +1;
        int right = 2*i+2;

        int largest;

        if(left<length && nodes[left].data>nodes[i].data){
            largest = left;
        }
        else{
            largest = i;
        }
        if(right<=length && nodes[right].data > nodes[largest].data){
            largest = right;
        }

        if(largest!=i){
            swap(nodes[largest], nodes[i]);
            justDoIt(nodes, largest, length );
        }
    }

    void swap(HeapNode node1, HeapNode node2){
        int temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
    }

}
