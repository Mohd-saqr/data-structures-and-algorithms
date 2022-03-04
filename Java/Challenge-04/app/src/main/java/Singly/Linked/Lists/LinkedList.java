package Singly.Linked.Lists;

public class LinkedList {
    Node head;
    Node tail;
    int size =0;

    public LinkedList() {
        this.head = null;
        this.tail=null;
    }

    // this method inset new value to head (add first) as i understand from requirement if we mean add new value at  last  i create this method in the bottom name of it insert 2

    public void insert(int value){
        Node newNode = new Node(value);
        newNode.next=this.head;
        this.head=newNode;

        size++;

    }

    // this method check if the value exists inside linked list
    public boolean includes (int value){
        Node pionter =this.head;
       while (pionter!=null){
           if (pionter.value==value){
               return true;
           }else{
               pionter = pionter.next;
           }
       }
        return false;
    }

    // this method extra for me to check my work
    // this method is print all value of each node
    public void printAllValue (){
        Node pointer =this.head;
        while (pointer!=null){
            System.out.println(pointer.value);
            pointer=pointer.next;
        }
    }

// this method Print all value inside linked list as a string
    public void ToString(){
        Node pointer =this.head;
        String out = "";
        while (pointer !=null){

           out+="{" +pointer.value +"} " + "-> ";
            pointer=pointer.next;
        }
        System.out.println(out + "Null");
    }

    public void insert2 (int value ){
        Node newNode = new Node(value);
        if(size==0){
            newNode.next=head;
            this.head=newNode;
            this.tail=newNode;
            size++;
        }else{
            tail.next=newNode;
            this.tail=newNode;
            size++;
        }
    }
}
