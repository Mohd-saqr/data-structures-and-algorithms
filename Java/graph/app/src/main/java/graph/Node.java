package graph;

import java.util.HashSet;

public class Node <V>{
    private  V value ;
    private HashSet<Edges<V>> edges = new HashSet<>();
    private  int weight;


    public Node(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void addEdges(Node<V> to ,int white){
        edges.add(new Edges<>(this,to,white));
    }

    public void addEdges(Node<V> to ){
        edges.add(new Edges<>(this,to, 0));
    }

    @Override
    public String toString() {
        return value.toString() + " -> " + edges;
    }

    public HashSet<Edges<V>> getEdges() {
        return edges;
    }

    public void setEdges(HashSet<Edges<V>> edges) {
        this.edges = edges;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
