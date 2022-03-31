package Tree;

import NodeTree.Node;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree {
    private boolean contain = false;
   public int size;


    public void Add(T value) {
        if (isEmpty()) {
            this.root = new Node<>(value);
            size++;
        } else addHelper(value, this.root);

    }

    private void addHelper(T value, Node<T> node) {

        if (value.compareTo((T) node.getData()) > 0) {
            if (node.getRight() != null) {
                addHelper(value, node.getRight());
            } else {
                node.setRight(new Node<>(value));
                size++;

            }
        } else if (value.compareTo(node.getData()) < 0) {
            if (node.getLeft() != null) {
                addHelper(value, node.getLeft());
            } else {
                node.setLeft(new Node<>(value));
                size++;
            }
        }
    }

    public boolean Contains(T value) {
        Node<T> node = this.root;
        if (isEmpty()) return false;

        return ContainsHelper(value, node);
    }

    private boolean ContainsHelper(T value, Node<T> node) {

        if (value.compareTo(node.getData()) == 0) {
            contain = true;
        } else if (value.compareTo((T) node.getData()) > 0) {
            if (node.getRight() != null) {
                ContainsHelper(value, node.getRight());
            }
        } else if (value.compareTo(node.getData()) < 0) {
            if (node.getLeft() != null) {
                ContainsHelper(value, node.getLeft());
            }
        }
        return contain;
    }
}
