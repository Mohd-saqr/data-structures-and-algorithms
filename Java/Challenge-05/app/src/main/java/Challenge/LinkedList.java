package Challenge;

public class LinkedList {

    Node head;
    Node tail;
    int size = 0;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (size == 0) {
            newNode.next = head;
            this.head = newNode;
            this.tail = newNode;
            size++;
        } else {
            tail.next = newNode;
            this.tail = newNode;
            size++;
        }
    }

    public void insertBefore(int value, int newValue) {
        Node newNode = new Node(newValue);
        Node pointer = this.head;

        if (includes(value)) {
            while (pointer != null) {
                if (head.value == value) {
                    newNode.next = pointer;
                    this.head = newNode;
                    size++;
                    break;
                }
                if (pointer.next.value == value) {
                    newNode.next = pointer.next;
                    pointer.next = newNode;
                    size++;

                    break;
                }
                pointer = pointer.next;
            }

        } else {
            System.out.println("The value is not exists");
        }
    }

    public void insertAfter(int value, int newValue) {
        Node newNode = new Node(newValue);
        Node pointer = this.head;

        if (includes(value)) {
            while (pointer != null) {
                if (pointer.value == value) {
                    if (tail.value == pointer.value) {
                        tail.next = newNode;
                        this.tail = newNode;
                        size++;
                        break;
                    }
                    newNode.next = pointer.next;
                    pointer.next = newNode;
                    size++;
                    break;
                }
                pointer = pointer.next;
            }

        } else {
            System.out.println("The value is not exists");
        }

    }

    public void Delete(int value) {
        Node pointer = this.head;
        if (includes(value)) {

            while (pointer != null) {

                if (head.value == value) {
                    this.head = head.next;
                    size--;
                    break;
                } else if (tail.value == pointer.next.value) {
                    pointer.next = null;
                    this.tail = pointer;
                    size--;
                    break;
                }
                if (pointer.next.value == value) {
                    pointer.next = pointer.next.next;
                    size--;
                    break;
                }

                pointer = pointer.next;

            }


        } else {
            System.out.println(" given Value not exists");
        }

    }


    // this method check if the value exists inside linked list
    public boolean includes(int value) {
        Node pointer = this.head;
        while (pointer != null) {
            if (pointer.value == value) {
                return true;
            } else {
                pointer = pointer.next;
            }
        }
        return false;
    }


    // this method Print all value inside linked list as a string
    public void ToString() {
        Node pointer = this.head;
        String out = "";
        while (pointer != null) {

            out += "{" + pointer.value + "} " + "-> ";
            pointer = pointer.next;
        }
        System.out.println(out + "Null");
    }
}
