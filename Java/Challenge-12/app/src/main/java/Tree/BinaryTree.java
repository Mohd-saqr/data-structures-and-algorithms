package Tree;

import NodeTree.BTNode;
import QueueDs.QueueDs;


import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T extends Comparable<T>> {
    BTNode<T> root;
    private List<T> arr = new ArrayList<>();
    private List<T> breadthFirst = new ArrayList<>();
    String helper="";


    public BinaryTree() {
    }

    public String preOrder() {
        helper="";
        BTNode<T> BTNode = this.root;
        if (BTNode == null) {
            return "";
        }
       return preOrderHelper(BTNode);

    }

    private String preOrderHelper(BTNode<T> BTNode) {

        if (BTNode == null) {
            return "";
        }
        helper+= BTNode.getData() +" -> ";
         PrintNodeData(BTNode);
        preOrderHelper(BTNode.getLeft());
        preOrderHelper(BTNode.getRight());
        return helper;
    }


    public String inOrder() {
        helper="";
        BTNode<T> BTNode = this.root;
        if (BTNode == null) {
            return "";
        }
       return inOrderHelper(BTNode);

    }

    private String inOrderHelper(BTNode<T> BTNode) {
        if (BTNode == null) {
            return "";
        }

        inOrderHelper(BTNode.getLeft());
        helper+=BTNode.getData() +" -> ";
        PrintNodeData(BTNode);
        inOrderHelper(BTNode.getRight());
        return helper;
    }


    public List<T> postOrder() {
        helper="";
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
        helper+=BTNode.getData() +" -> ";
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
