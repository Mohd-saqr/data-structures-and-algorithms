package graph;

public class Edges <V>{
  private   Node<V> from;
    private Node<V> to;
    private  int weight;

    public Edges(Node<V> from, Node<V> to, int white) {
        this.from = from;
        this.to = to;
        this.weight = white;
    }

    public Node<V> getFrom() {
        return from;
    }

    public void setFrom(Node<V> from) {
        this.from = from;
    }

    public Node<V> getTo() {
        return to;
    }

    public void setTo(Node<V> to) {
        this.to = to;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return from.getValue() +"  connected to " + to.getValue() + " weight: "+weight;
    }
}
