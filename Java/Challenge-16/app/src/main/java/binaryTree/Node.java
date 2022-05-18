package binaryTree;

public class Node <V extends Comparable<V>> implements Comparable<V> {

    private V value;

    private  Node<V> left;
    private Node<V> right;

    public Node(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node<V> getLeft() {
        return left;
    }

    public void setLeft(Node<V> left) {
        this.left = left;
    }

    public Node<V> getRight() {
        return right;
    }

    public void setRight(Node<V> right) {
        this.right = right;
    }

    @Override
    public int compareTo(V o) {
        return 0;
    }
}
