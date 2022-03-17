package Challenge.Queue;

import Challenge.Node.Node;

import java.util.NoSuchElementException;

public class QueueDs<T> {

    public Node front;
    public Node rear;
    public int size = 0;


    public QueueDs() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(T value) {
        Node newNode = new Node<>(value);
        if (IsEmpty()) {
            this.front = newNode;
        } else {
            rear.next = newNode;
        }
        this.rear = newNode;
        size++;
    }

    public T dequeue() {
        Node temp = this.front;
        if (IsEmpty()) {
            throw new NoSuchElementException();
        } else {
            this.front = front.next;
            size--;
            return (T) temp.value;
        }

    }

    public T peek() {
        if (IsEmpty()) {
            throw new NoSuchElementException();
        } else {
            return (T) front.value;
        }
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        Node pointer = this.front;
        String out = "[";
        while (pointer != null) {
            if (pointer.next==null){
                out+=pointer.value;
                break;
            }
            out +=  pointer.value  +", ";
            pointer = pointer.next;
        }
        return out +"]";
    }
}
