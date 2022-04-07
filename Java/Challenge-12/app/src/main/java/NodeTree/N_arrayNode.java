package NodeTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class N_arrayNode<T> {
   public T value;
   public List<N_arrayNode<T>> children = new LinkedList<>();

    public N_arrayNode(T value, List<N_arrayNode<T>> children) {
        this.value = value;
        this.children = children;
    }

    public N_arrayNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public List<N_arrayNode<T>> getChildren() {
        return children;
    }

    public void setChildren(List<N_arrayNode<T>> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "N_arrayNode{" +
                "value=" + value +
                ", children=" + children +
                '}';
    }
}
