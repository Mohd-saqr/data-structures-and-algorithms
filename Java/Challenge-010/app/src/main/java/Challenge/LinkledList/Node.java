package Challenge.LinkledList;

public class Node<T> {
    T value;
    Node next;

    public Node(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
