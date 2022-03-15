package Challenge.Stack;

import Challenge.Node.Node;

import java.util.EmptyStackException;

public class StackDs<T> {
    public Node top;
    public int size = 0;


    public StackDs() {
        this.top = null;
    }

    public T Push(T value) {
        Node NewNode = new Node<>(value);
        if (!IsEmpty()) {
            NewNode.next = top;
        }
        this.top = NewNode;
        size++;
        return value;
    }

    public boolean IsEmpty() {
        return size == 0;
    }


    public T pop() {
        Node temp = top;
        if (IsEmpty()) {
            throw new EmptyStackException();
        } else {
            this.top = top.next;
            size--;
            return (T) temp.value;
        }
    }


    public T peek() {
        if (IsEmpty()) {
            throw new EmptyStackException();
        } else {
            return (T) top.value;
        }
    }


    @Override
    public String toString() {
        return "StackDs{" +
                "top=" + top +
                ", size=" + size +
                '}';
    }
}
