package Tree;

import NodeTree.BTNode;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree {
    private boolean contain = false;
   public int size;


    public void Add(T value) {
        if (isEmpty()) {
            this.root = new BTNode<>(value);
            size++;
        } else addHelper(value, this.root);

    }

    private void addHelper(T value, BTNode<T> BTNode) {

        if (value.compareTo((T) BTNode.getData()) > 0) {
            if (BTNode.getRight() != null) {
                addHelper(value, BTNode.getRight());
            } else {
                BTNode.setRight(new BTNode<>(value));
                size++;

            }
        } else if (value.compareTo(BTNode.getData()) < 0) {
            if (BTNode.getLeft() != null) {
                addHelper(value, BTNode.getLeft());
            } else {
                BTNode.setLeft(new BTNode<>(value));
                size++;
            }
        }
    }

    public boolean Contains(T value) {
        this.contain=false;
        BTNode<T> BTNode = this.root;
        if (isEmpty()) return false;

        return ContainsHelper(value, BTNode);
    }

    private boolean ContainsHelper(T value, BTNode<T> BTNode) {

        if (value.compareTo(BTNode.getData()) == 0) {
            contain = true;
        } else if (value.compareTo((T) BTNode.getData()) > 0) {
            if (BTNode.getRight() != null) {
                ContainsHelper(value, BTNode.getRight());
            }
        } else if (value.compareTo(BTNode.getData()) < 0) {
            if (BTNode.getLeft() != null) {
                ContainsHelper(value, BTNode.getLeft());
            }
        }
        return contain;
    }
}
