package challenege_implementation.datastructures;

public class LinkedList<T> {

   private Node<T>head;
   private int size=0;

    public class Node<T>{
       private  T value;
       private  Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

    }

    public LinkedList() {
        this.head=null;
    }

    public void addFirst(T value){
        Node<T> node = new Node<>(value);
        if (this.head==null){
            this.head=node;
            incrementSize();
        }
        node.next=head.next;
        head=node;
        incrementSize();
    }


    public void addLast(T value){
        Node<T> pointer =head;
        while (pointer.next!=null){
            pointer=pointer.next;
        }
        pointer.next= new Node<>(value);
        incrementSize();
    }

    public boolean contain(T value){
        Node<T> pointer =head;
        while (pointer!=null){
            if (pointer.value==value)return true;
            pointer=pointer.next;
        }
        return false;
    }

    public void addAfter(T value,T after){
        Node<T> pointer =head;
        Node<T>node = new Node<>(value);
        if (!contain(after))return ;
        while (pointer!=null){
            if (pointer.value==after){
                Node<T>temp=pointer.next;
                pointer.next=node;
                node.next=temp;
                return;
            }
            pointer=pointer.next;
        }
    }

    public void remove(T value){
        Node<T> pointer =head;
        while (pointer!=null){
            if (pointer.next.value==value){
                pointer.next=pointer.next.next;
                return;
            }
            pointer=pointer.next;
        }
    }
    public void insertBefore(T value,T before){
        Node<T> pointer =head;
        Node<T> next=head.next;
        Node<T> node = new Node<>(value);
        if (value== head.value){
            node.next=head;
            head=node;
        }
        while (pointer!=null){
            if (pointer.next.value==before){
                pointer.next=node;
                node.next=next;
                return;
            }
            next=next.next;
            pointer=pointer.next;
        }
    }

    private void incrementSize() {
        size++;
    }
}
