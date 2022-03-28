package Challenge.Queue;

import Challenge.Node.Node;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

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



    public  String DuckDuckGoose(String s, int k) {
        int count =1;
        int index=k-1;
        String [] names =s.split(",");

        while (this.size>1){
            if (index>=names.length){
                index=0;
            }
            for (int i=0;i<names.length;i++) {
                if (count == k) {
                    this.(names[index]);
                    count = 0;
                    index++;
                }
                count++;
            }

            index++;

        }
        System.out.println(queue.toString());
        return queue.peek();
    }



    @Override
    public String toString() {
        return "QueueDs{" +
                "front=" + front +
                ", rear=" + rear +
                ", size=" + size +
                '}';
    }
}
