package com.practice.ds.trees;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {
//        App app = new App();
//        app.traverseInAllOrders();
//        app.iterateInInOrder();
//        app.morrisTraversal();

        //MorrisAlgo morrisAlgo = new MorrisAlgo();
        //morrisAlgo.inorder();

//        Node root = MakeTree.diagnolTree();
//        DiagnolTraversal diagnolTraversal = new DiagnolTraversal();
//
//        diagnolTraversal.traverseDiagnolly(root);

        DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();
        System.out.println("Diameter : "+diameterOfBinaryTree.diameter());
    }

    public void traverseInAllOrders(){
        Node root = MakeTree.start();

        System.out.println("PreOrder");
        Traversals.preOrder(root);

        System.out.println("\nInOrder");
        Traversals.inorderTraversal(root);

        System.out.println("\nPostOrder");
        Traversals.postOrder(root);

        System.out.println("\nLevelOrder");
        Traversals.levelOrder(root);
    }

    public void morrisTraversal(){
        Node n = MakeTree.start();
        Traversals.inorder(n);
    }

    public void iterateInInOrder(){
        IterableTree tree = new IterableTree();
        Iterator treeIterator = tree.iterator();
        System.out.println("\nIterative in Order: ");
        while (treeIterator.hasNext()){
            Node temp = (Node) treeIterator.next();
            System.out.print(temp.data + " ");
        }
    }

}
