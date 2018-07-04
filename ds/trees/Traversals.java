package com.practice.ds.trees;

import com.practice.ds.queue.Queue;
import com.practice.ds.stack.Stack;

public class Traversals {

    public static void inorderTraversal(Node root){
        if(root==null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.data+ " ");
        inorderTraversal(root.right);
    }

    public static void preOrder(Node root){
        if(root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null)
            return;
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data+ " ");
    }

    public static void levelOrder(Node root){
        Queue q = new Queue<Node>();
        q.enQueue(root);
        while (!q.isQueueEmpty()){
            Node temp = (Node) q.deQueue();

            System.out.print(temp.data+" ");

            if(temp.left!=null)
                q.enQueue(temp.left);
            if(temp.right!=null)
                q.enQueue(temp.right);
        }
    }

    public static void inorder(Node root) {
        Node current = root;
        while(current != null) {
            //left is null then print the node and go to right
            if (current.left == null) {
                System.out.print(current.data + " ");
                current = current.right;
            }
            else {
                //find the predecessor.
                Node predecessor = current.left;
                //To find predecessor keep going right till right node is not null or right node is not current.
                while(predecessor.right != current && predecessor.right != null){
                    predecessor = predecessor.right;
                }
                //if right node is null then go left after establishing link from predecessor to current.
                if(predecessor.right == null){
                    predecessor.right = current;
                    current = current.left;
                }else{ //left is already visit. Go rigth after visiting current.
                    predecessor.right = null;
                    System.out.print(current.data + " ");
                    current = current.right;
                }
            }
        }
    }
}
