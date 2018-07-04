package com.practice.ds.trees;

import com.practice.ds.queue.Queue;

public class DiagnolTraversal {

    Queue q = new Queue<Node>();

    void traverseDiagnolly(Node root){
        enQueueRightMostNodes(root);
        while (!q.isQueueEmpty()){
            Node n = (Node) q.deQueue();
            System.out.println(n.data);
            enQueueRightMostNodes(n.left);
        }
    }

    private void enQueueRightMostNodes(Node node) {
        while (node != null) {
            q.enQueue(node);
            node = (node.right);
        }
    }


}
