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
    public String ToString() {
        String out = "";
        if (this.head != null) {
            Node pointer = this.head;
            while (pointer != null) {
                out += "{" + pointer.value + "} " + "-> ";
                pointer = pointer.next;
            }
        }

        System.out.println(out+ "Null" );
        return out + "Null" ;
    }


    //////////////// CHALLENGE 6
    public int kthFromEnd(int k) {
        Node pointer = this.head;
        int place = (size - k) - 1;
        int steps = 0;
        if (k > size - 1 || k < 0) {
            System.out.println("the value of index is not exists");
            return -1;
        } else {
            while (steps != place) {
                steps++;
                pointer = pointer.next;
            }

        }
        return pointer.value;
    }

    public int MiddleValueNode() {
        Node pointer = this.head;
        int place = (size / 2);
        int steps = 0;
        if (head == null) {
            return -1;
        }
        while (steps != place) {
            steps++;
            pointer = pointer.next;
        }

        return pointer.value;

    }

    public LinkedList zipLists(LinkedList list1, LinkedList list2) {
        LinkedList zipLinkedList = new LinkedList();
        if (list1.size == 0 || list2.size == 0) {
            System.out.println("can't zip empty List");
            return zipLinkedList;
        }
        Node pointer1 = list1.head;
        Node pointer2 = list2.head;
        while (pointer1 != null || pointer2 != null) {
            if (pointer1 == null) {
                zipLinkedList.append(pointer2.value);
                pointer2 = pointer2.next;
                continue;

            } else if (pointer2 == null) {
                zipLinkedList.append(pointer1.value);
                pointer1 = pointer1.next;
                continue;
            }
            zipLinkedList.append(pointer1.value);
            zipLinkedList.append(pointer2.value);
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return zipLinkedList;
    }


}
