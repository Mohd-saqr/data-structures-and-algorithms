package DoublyLinkedList;

import Singly.Linked.Lists.Node;

public class DoublLinkedList {

  public   DoublNode head;
   public DoublNode tail;
    public int size =0;



    public DoublLinkedList() {
        this.head=null;
        this.tail=null;

    }


    public void add(int value ){
        DoublNode newDN= new DoublNode(value);
        if(size==0){
           newDN.next=head;
         this.head=newDN;
         this.tail=newDN;
         size++;
        }else {
    tail.next=newDN;
    newDN.previous=tail;
    this.tail=newDN;
    size++;
        }

    }

    public void ToString(){
        DoublNode pointer =this.head;
        String out = "";
        while (pointer !=null){

            out+="{" +pointer.value +"} " + "-> ";
            pointer=pointer.next;
        }
        System.out.println(out + "Null");
    }

    public boolean includes (int value){
        DoublNode pionter =this.head;
        while (pionter!=null){
            if (pionter.value==value){
                return true;
            }else{
                pionter = pionter.next;
            }
        }
        return false;
    }
}
