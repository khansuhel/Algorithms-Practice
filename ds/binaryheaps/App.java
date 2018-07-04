package com.practice.ds.binaryheaps;

public class App {
    public static void main(String[] args) {
        Max_Heapify max_heapify = new Max_Heapify();
        App app = new App();
        HeapNode[] nodes = app.createHeap(10);
        System.out.println("Before Operation: ");
        for (HeapNode n : nodes ){
            System.out.print(n.data+" ");
        }
        for(int x = 0; x<10;x++)
            max_heapify.justDoIt(nodes, x, 10);
        System.out.println("After Operation: ");
        for (HeapNode n : nodes ){
            System.out.print(n.data+" ");
        }

    }

    public HeapNode[] createHeap(int length){
        HeapNode[] heap = new HeapNode[length];
        int j =1;
        for(int i =0; i<length;i++){
            HeapNode n = new HeapNode();
            n.data = j;
            heap[i] = n;
            j++;
        }
        return heap;
    }
}
