package com.practice.ds.trees;


public class ConvertBT2SLL {

        private Node last = null;
        public void flatten(Node root) {
            if (root == null) {
                return;
            }
            if (last != null) {
                last.left = null;
                last.right = root;
            }
            last = root;

            Node right = root.right;
            flatten(root.left);
            flatten(right);
        }
}