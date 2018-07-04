package com.practice.ds.trees;

import com.practice.ds.stack.Stack;

import java.util.Iterator;

public class IterableTree implements Iterable {

    Node root = MakeTree.start();
    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator iterator() {
        return new Iterator() {
            Stack s = new Stack<Node>();
            boolean empty = true;
            @Override
            public boolean hasNext() {
                if(empty){
                        customPush(root);
                        empty =false;
                }
                return !s.isStackEmpty;
            }

            @Override
            public Object next() {
                if(((Node)s.top()).right!=null){
                    Node n = (Node) s.pop();
                    customPush(n.right);
                    return n;
                }
                return s.pop();
            }

            void customPush(Node root){
                if(!(root == null)){
                    s.push(root);
                    customPush(root.left);
                }
            }
        };
    }
}
