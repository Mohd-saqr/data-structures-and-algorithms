package Challenge.Challenege;

import Challenge.HashTable.HashTable;
import binaryTree.BinaryTree;
import binaryTree.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonDataOnTrees <V extends Comparable<V>>{

    HashTable<V, V> hashMap = new HashTable<>(20);
    List<V> set = new ArrayList<>();

    public List<V> findMatcher(BinaryTree<V> b1, BinaryTree <V> b2) {

        pushValue(b1.getRoot());
        CheckValue(b2.getRoot());
        return set;

    }

    private void pushValue(Node<V> root) {
        if (root == null) {
            return;
        }
        hashMap.put(root.getValue(), root.getValue());
        pushValue(root.getLeft());
        pushValue(root.getRight());
    }

    private void CheckValue(Node<V> root) {
        if (root == null) {
            return;
        }
        if (hashMap.contains(root.getValue())) {
            set.add(root.getValue());
        }
        CheckValue(root.getLeft());
        CheckValue(root.getRight());
    }
}
