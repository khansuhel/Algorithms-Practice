package com.practice.ds.trees;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DiameterOfBinaryTree {

    Node root = MakeTree.start();
    int smallest = 0;
    int biggest = 0;

    private void findDiameter(Node root, int temp){
        if(root==null) return;
        if(temp<smallest)
            smallest = temp;
        else if(temp>biggest)
            biggest = temp;
        findDiameter(root.left, temp-1);
        findDiameter(root.right, temp +1);
    }

    public int diameter() {
        findDiameter(root, 0);
        return biggest - smallest;
    }

}
