package Tree;

import NodeTree.BTNode;
import QueueDs.QueueDs;


import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T extends Comparable<T>> {
    BTNode<T> root;
    private List<T> arr = new ArrayList<>();
    private List<T> breadthFirst = new ArrayList<>();


    public BinaryTree() {
    }

    public void preOrder() {
        BTNode<T> BTNode = this.root;
        if (BTNode == null) {
            return;
        }
        preOrderHelper(BTNode);

    }

    private void preOrderHelper(BTNode<T> BTNode) {
        if (BTNode == null) {
            return;
        }
        PrintNodeData(BTNode);
        preOrderHelper(BTNode.getLeft());
        preOrderHelper(BTNode.getRight());
    }


    public void inOrder() {
        BTNode<T> BTNode = this.root;
        if (BTNode == null) {
            return;
        }
        inOrderHelper(BTNode);

    }

    private void inOrderHelper(BTNode<T> BTNode) {
        if (BTNode == null) {
            return;
        }

        inOrderHelper(BTNode.getLeft());
        PrintNodeData(BTNode);
        inOrderHelper(BTNode.getRight());
    }


    public List<T> postOrder() {


        BTNode<T> BTNode = this.root;
        if (BTNode == null) {
            return null;
        }


        return postOrderHelper(BTNode);
    }

    public List<T> postOrderHelper(BTNode<T> BTNode) {

        if (BTNode == null) {
            return arr;
        }
        postOrderHelper(BTNode.getLeft());
        postOrderHelper(BTNode.getRight());
        arr.add(((T) BTNode.getData()));
        return arr;
    }

    public int getMax() {
        BTNode<T> BTNode = root;

        if (BTNode != null) return getMax(BTNode);
        else return 0;
    }



    private int getMax(BTNode<T> BTNode) {

        int max = (Integer) BTNode.getData();
        if(BTNode.getLeft() != null) {
            max = Math.max(max, getMax(BTNode.getLeft()));
        }
        if(BTNode.getRight() != null) {
            max = Math.max(max, getMax(BTNode.getRight()));
        }
        return max;


    }

    public List<T> breadthFirst() throws InterruptedException {
        if (root != null) {
            QueueDs<BTNode<T>> queue = new QueueDs<BTNode<T>>();
            queue.enqueue(root);
            BTNode BTNode;
            while (!queue.IsEmpty()) {
                BTNode = queue.dequeue();
                breadthFirst.add((T) BTNode.getData());
                if (BTNode.getLeft() != null) {
                    queue.enqueue(BTNode.getLeft());
                }

                if (BTNode.getRight() != null) {
                    queue.enqueue(BTNode.getRight());
                }
            }
        } else {
            System.out.println("Tree empty");
        }
        return breadthFirst;
    }


    public boolean isEmpty() {
        return this.root == null;
    }

    private void PrintNodeData(BTNode<T> BTNode) {
        System.out.print(BTNode.getData() + " -> ");
    }


}
