package graph;

import java.util.*;

/**
 * I build undirected graph because in challenge them not specific the type to graph,
 * but I know  it's undirected because he wants the weight
 */
public class Graph<V> {

    /// this variable handle the size of graph
    private int size;

    // this hash map handel  all the node in graph and the value as key
    private HashMap<V, Node<V>> nodes = new HashMap<>();

    public Graph() {
    }


    public Node<V> addNode(V value) {
        // first create a new node
        Node<V> newNode = new Node<>(value);
        // put the node if not exist in hashmap
        nodes.putIfAbsent(value, newNode);
        //increment size
        size++;
        return newNode;
    }

    /// add edge with weight
    public void addEdge(Node<V> node1, Node<V> node2, int weight) {
        if (nodes.get(node2.getValue()) == null || nodes.get(node2.getValue()) == null)
            throw new IllegalArgumentException();
        nodes.get(node1.getValue()).addEdges(node2, weight);
        nodes.get(node2.getValue()).addEdges(node1, weight);

    }

    /// add edge without  weight

    public void addEdge(Node<V> node1, Node<V> node2) {
        if (nodes.get(node2.getValue()) == null || nodes.get(node2.getValue()) == null)
            throw new IllegalArgumentException();
        nodes.get(node1.getValue()).addEdges(node2);
        nodes.get(node2.getValue()).addEdges(node1);
    }

    // return all nodes in graph
    public Collection<Node<V>> getNodes() {
        return nodes.values();
    }

    // get connected on  Neighbors node
    public HashSet<Edges<V>> getNeighbors(Node<V> node) {
        if (nodes.containsKey(node.getValue()))
            return nodes.get(node.getValue()).getEdges();
        return null;
    }

    public int size() {
        return this.size;
    }

    /**
     * I create these methods to make testing easy
     */

    public boolean isContainNode(Node<V> node) {
        return nodes.containsKey(node.getValue());
    }

    public boolean isContainValue(V value) {
        return nodes.containsKey(value);
    }

    // get the Node and  Iterator for Edges and then check if and edges connected
    // to Node 2
    public boolean isConnected(Node<V> node, Node<V> connectedNode) {
        for (Iterator<Edges<V>> it = nodes.get(node.getValue()).getEdges().iterator(); it.hasNext(); ) {
            Edges<V> e = it.next();
            if (e.getTo().getValue().equals(connectedNode.getValue())) return true;
        }

        return false;
    }

    public List<V> breadthFirst(Node<V> root){
        List<V> out = new ArrayList<>();
        Set<Node<V>> visited = new HashSet<>();
        Queue<Node<V>> queue = new ArrayDeque<>();
        if(nodes.get(root.getValue())==null)
            return out;
        queue.add(nodes.get(root.getValue()));
        while (!queue.isEmpty()){
            Node<V> node = queue.remove();
            if (visited.contains(node)){
                continue;
            }
            out.add(node.getValue());
            visited.add(node);
            for(Edges<V> e: node.getEdges()){
                if (!visited.contains(e.getTo()))
                    queue.add(nodes.get(e.getTo().getValue()));
            }
        }

        return out;
    }


    /**
     *
     * @this method create for BusinessTrip
     */

    public Node<V> getNode(String value){
        return nodes.get(value);
    }


    @Override
    public String toString() {
        return "Graph{" +
                "size=" + size +
                ", nodes=" + nodes +
                '}';
    }
}
