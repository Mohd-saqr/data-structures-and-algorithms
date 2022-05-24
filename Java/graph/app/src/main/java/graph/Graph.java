package graph;

import java.util.*;

public class Graph<V> {
    private int size;
    private HashMap<Node<V>, List<Node<V>>> adjacency = new HashMap<>();

    public Graph() {
    }

    public Node<V> addNode(V value) {
        Node<V> newNode = new Node<>(value);
        adjacency.putIfAbsent(newNode, new ArrayList<>());
        size++;
        return newNode;
    }

    public void addEdge(Node<V> node1, Node<V> node2, int weight) {
        if (adjacency.get(node2) == null || adjacency.get(node2) == null)
            throw new IllegalArgumentException();
        node1.addEdges(node2, weight);
        node2.addEdges(node1, weight);

    }

    public void addEdge(Node<V> from, Node<V> to) {
        if (adjacency.get(to) == null || adjacency.get(to) == null)
            throw new IllegalArgumentException();
        from.addEdges(to);
        to.addEdges(from);
    }

    public  Set<Node<V>> getNodes(){
        return adjacency.keySet();
    }

    public HashSet<Edges<V>> getNeighbors(Node<V> node){
        return node.getEdges();
    }

}
