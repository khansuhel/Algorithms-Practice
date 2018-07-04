package com.practice.ds.trees;

public class MorrisAlgo {

    Node root = MakeTree.start();

    public void inorder(){
        Node current = root;

        while (current!=null){
            if(current.left==null){
                System.out.println(current.data);
                current = current.right;
            }else{
                Node predecessor = current.left;

                while (predecessor.right!=null && predecessor.right!=current ){
                    predecessor = predecessor.right;
                }

                if(predecessor.right==null){
                    predecessor.right = current;
                    current = current.left;
                }else{
                    predecessor.right = null;
                    System.out.println(current.data);
                    current = current.right;
                }
            }
        }
    }

}
