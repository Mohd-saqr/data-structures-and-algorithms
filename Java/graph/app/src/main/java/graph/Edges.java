package graph;

public class Edges <V>{
  private   Node<V> from;
    private Node<V> to;
    private  int white;

    public Edges(Node<V> from, Node<V> to, int white) {
        this.from = from;
        this.to = to;
        this.white = white;
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

    public int getWhite() {
        return white;
    }

    public void setWhite(int white) {
        this.white = white;
    }
}
