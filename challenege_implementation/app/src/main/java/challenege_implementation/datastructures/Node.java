package challenege_implementation.datastructures;

public class StackNode<V> {
    private V value ;
    private StackNode<V> next;

    public StackNode(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public StackNode<V> getNext() {
        return next;
    }

    public void setNext(StackNode<V> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "StackNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
