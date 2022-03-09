# Challenge Summary

we want to create new method to zip tow Linked List . in this method we can use append method to add each value of
linked list

i think my code is not short because i replace while loop by use if statement

## Whiteboard Process

![zipLists](https://user-images.githubusercontent.com/97642724/157530345-8e60de5c-bb5a-4f53-bb33-251fb38e0171.png)

## Approach & Efficiency

i replace while loop by use if statement to get best efficiency

## Solution

````
 
 LinkedList list1 = new LinkedList(); create new linkedList
  list1.append(0);
        
        list1.append(5);
        list2.append(9);
        list2.append(4);
 LinkedList list2= new LinkedList();create new linkedList 
  LinkedList out = new LinkedList(); create new linkedList
   out=out.zipLists(list1,list2); make out linked list list 1 and list 2 (ziped)
   
   out linked list become {5,9,4}
   

````

```
 LinkedList list1 = new LinkedList();
        list1.append(0);
        list1.append(3);
        list1.append(-9);
        list1.append(2);
        list1.ToString();
        LinkedList list2= new LinkedList();
        list2.append(10);
        LinkedList out = new LinkedList();
        out=out.zipLists(list1,list2);
        out linked list become {{0} -> {10} -> {3} -> {-9} -> {2} -> Null}

```
