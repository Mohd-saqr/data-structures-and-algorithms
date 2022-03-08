# Challenge Summary
we want to create a Method it take a int K and return value of node it's palce k

## Whiteboard Process
![linked-list-kth](https://user-images.githubusercontent.com/97642724/157206879-6ebf8298-dc55-4c11-9485-43326f2c4d00.png)

## Approach & Efficiency

previous i use the size of linked list that help me to use O(n)


## note 

The method create in LinkedList Class in previous task.

## Solution
```
 
        LinkedList test = new LinkedList();
        test.append(1); /// index 4  head
        test.append(2); /// index 3
        test.append(3); /// index 2
        test.append(4); /// index 1
        test.append(5); /// index 0 tail
        int result = test.kthFromEnd(2); 
        
        it will return 3
       

```



```
 
        LinkedList test = new LinkedList();
        test.append(1); /// index 4  head
        test.append(2); /// index 3
        test.append(3); /// index 2
        test.append(4); /// index 1
        test.append(5); /// index 0 tail
        int result = test.kthFromEnd(5); 
        
        it will return -1 becouse the index is equla the size
       

```


```
 
        LinkedList test = new LinkedList();
        test.append(1); /// index 4  head
        test.append(2); /// index 3
        test.append(3); /// index 2
        test.append(4); /// index 1
        test.append(5); /// index 0 tail
        int result = test.kthFromEnd(-2); 
        
        it will return -1
       

```

```
 
        LinkedList test = new LinkedList();
        test.append(1); /// index 0 head
        int result = test.kthFromEnd(0); 
        
        it will return 1
       

```