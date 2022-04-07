package Tree;

import NodeTree.N_arrayNode;
import QueueDs.QueueDs;

import java.util.EmptyStackException;

public class NArray_tree<T> {
    private N_arrayNode<T> root;

    public N_arrayNode getRoot() {
        return root;
    }

    public void setRoot(N_arrayNode root) {
        this.root = root;
    }

    public NArray_tree() {

    }

    public NArray_tree treeFizzBuzz(NArray_tree tree) {
        NArray_tree tree1 = tree;
        if (tree.getRoot() == null) throw new EmptyStackException();
        QueueDs<N_arrayNode<T>> queue = new QueueDs();
        queue.enqueue(root);
        while (!queue.IsEmpty()) {
            int len = queue.size;
            for (int i = 0; i < len; i++) {
                N_arrayNode node = queue.dequeue();
                if ((Integer) (node.getValue()) % 3 == 0 && (Integer) (node.getValue()) % 5 == 0)
                    node.setValue("FizzBuzz");
                else if ((Integer) (node.getValue()) % 3 == 0) {
                    node.setValue("Fizz");
                } else if ((Integer) (node.getValue()) % 5 == 0) node.setValue("Buzz");
                else node.setValue(String.valueOf(node.getValue()));
                for (Object node1 : node.getChildren()
                ) {
                    queue.enqueue((N_arrayNode<T>) node1);
                }
            }
            System.out.println();
        }
        return tree1;
    }

    public String printData() {
        String helper = "";
        QueueDs<N_arrayNode<T>> queue = new QueueDs();
        queue.enqueue(root);
        while (!queue.IsEmpty()) {
            int len = queue.size;
            for (int i = 0; i < len; i++) {
                N_arrayNode node = queue.dequeue();
                helper += node.getValue() + " --> ";
                System.out.print(node.value + " --> ");
                for (Object node1 : node.getChildren()
                ) {
                    queue.enqueue((N_arrayNode<T>) node1);
                }
            }

        }
        return helper;
    }

    @Override
    public String toString() {
        return "NArray_tree{" +
                "root=" + root +
                '}';
    }
}
