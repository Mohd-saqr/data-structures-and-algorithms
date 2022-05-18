package binaryTree;

public class BinaryTree<V extends Comparable<V>> implements Comparable<V> {
  private   Node<V> root;


    public BinaryTree() {
    }

    public void Add(V value) {
        if (root==null) {
            this.root = new Node<>(value);

        } else addHelper(value, this.root);

    }

    private void addHelper(V value, Node<V> BTNode) {

        if (value.compareTo((V) BTNode.getValue()) > 0) {
            if (BTNode.getRight() != null) {
                addHelper(value, BTNode.getRight());
            } else {
                BTNode.setRight(new Node<>(value));


            }
        } else if (value.compareTo(BTNode.getValue()) < 0) {
            if (BTNode.getLeft() != null) {
                addHelper(value, BTNode.getLeft());
            } else {
                BTNode.setLeft(new Node<>(value));

            }
        }
    }

    public Node<V> getRoot() {
        return root;
    }

    public void setRoot(Node<V> root) {
        this.root = root;
    }

    @Override
    public int compareTo(V o) {
        return 0;
    }
}
