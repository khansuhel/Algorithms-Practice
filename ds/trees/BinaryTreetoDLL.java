package com.practice.ds.trees;


public class BinaryTreetoDLL {

    void convertToDll(Node root){
        Node leftNode = root.left;
        Node rightNode = root.right;
        leftNode = convertToDLL(leftNode, "left");
        rightNode = convertToDLL(rightNode,"right");

        leftNode.right = root;
        root.left = leftNode;
        rightNode.left = root;
        root.right = rightNode;

        while (leftNode.left!=null)
            leftNode = leftNode.left;
        while (rightNode.right!=null)
            rightNode = rightNode.right;
        leftNode.left = rightNode;
        rightNode.right = leftNode;
    }

    Node convertToDLL(Node root, String direction){

        if(root!=null){
        Node leftNode = root.left;
        Node rightNode = root.right;
        convertToDLL(leftNode, direction);
        convertToDLL(rightNode, direction);
        if(leftNode!=null)
            leftNode.right = root;
        if(rightNode!=null)
            rightNode.left = root;
        if(direction.equalsIgnoreCase("left")){
            root = rightNode;
        }
        else{
            root = leftNode;
        }
        return root;
        }
        return null;
    }

    public static void main(String[] args) {
        BinaryTreetoDLL bt = new BinaryTreetoDLL();
        bt.convertToDll(MakeTree.start());
    }
}
