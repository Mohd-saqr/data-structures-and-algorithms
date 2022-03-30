package Tree;

import NodeTree.Node;

import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>> {
    Node<T> root;
    int size;
    private ArrayList<T> arr = new ArrayList<>();

    public BinaryTree() {
    }

    public void preOrder() {
        Node<T> node = this.root;
        if (node == null) {
            return;
        }
        preOrderHelper(node);

    }

    private void preOrderHelper(Node<T> node) {
        if (node == null) {
            return;
        }
        PrintNodeData(node);
        preOrderHelper(node.getLeft());
        preOrderHelper(node.getRight());
    }



    public void inOrder() {
        Node<T> node = this.root;
        if (node == null) {
            return;
        }
        inOrderHelper(node);

    }

    private void inOrderHelper(Node<T> node) {
        if (node == null) {
            return;
        }

        inOrderHelper(node.getLeft());
        PrintNodeData(node);
        inOrderHelper(node.getRight());
    }



    public ArrayList<T> postOrder() {


        Node<T> node = this.root;
        if (node == null) {
            return null;
        }


        return postOrderHelper(node);
    }

    public ArrayList<T> postOrderHelper(Node<T> node) {

        if (node == null) {
            return arr;
        }
        postOrderHelper(node.getLeft());
        postOrderHelper(node.getRight());
        arr.add(((T) node.getData()));
        return arr;
    }


    public boolean isEmpty() {
        return this.root == null;
    }
    private void PrintNodeData(Node<T> node){
        System.out.print(node.getData() +" -> ");
    }
}
