package com.practice.ds.trees;

public class MakeTree {

    public static Node start(){
        Node root = new Node(1);
        Node left = new Node(2);
        Node right  = new Node(3);
        Node anotherLeft = new Node(4);
        Node anotherRight = new Node(5);
        Node yetAnotherLeft = new Node(6);
        Node yetAnotherRight = new Node(7);

        root.left = left;
        root.right = right;
        root.left.left = anotherLeft;
        root.left.right = anotherRight;
        root.right.left = yetAnotherLeft;
        root.right.right = yetAnotherRight;

        return root;
    }

    public static Node diagnolTree(){
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);
        root.right.right = new Node(14);
        root.right.right.left = new Node(18);

        return root;
    }
}
