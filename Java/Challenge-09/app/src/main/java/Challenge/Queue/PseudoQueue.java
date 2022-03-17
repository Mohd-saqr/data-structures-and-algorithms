package Challenge.Queue;

import Challenge.Node.Node;
import Challenge.Stack.StackDs;

public class PseudoQueue {
    public StackDs stackDs1 = new StackDs<>();
    public StackDs stackDs2 = new StackDs<>();
    public Node front;
    public Node rear;


    public PseudoQueue() {

    }

    public StackDs enqueue(int value) {
        stackDs1.Push(value);
        Node pointer = stackDs1.top;
        stackDs2.top = null;
        while (pointer != null) {
            stackDs2.Push(pointer.value);
            pointer = pointer.next;
        }
        UpdateFrontAndRear();
        return stackDs2;
    }


    public Object dequeue() {
        Object out = stackDs2.pop();
        UpdateFrontAndRear();
        return out;
    }

    private void UpdateFrontAndRear() {
        front = stackDs2.top;
        rear = stackDs1.top;
    }

    @Override
    public String toString() {
        Node pointer = stackDs2.top;
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
