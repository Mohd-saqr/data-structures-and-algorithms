# Trees
the tree is type of non-linear data structures it contain Node and each node has Node left and node right and each nod connect by other .

## Challenge
we want to create binary tree and sum method of depth  traversal with type 

1- pre order .

2- post order 

4- in Order

## Approach & Efficiency
time o(Log(n)) and space o(1)

## API

first create object from bainary tree
```BinarySearchTree<Integer> stringBinarySearchTree = new BinarySearchTree<>();```

second add som value 

````
 stringBinarySearchTree.Add(10);
        stringBinarySearchTree.Add(2);
        stringBinarySearchTree.Add(50);
        stringBinarySearchTree.Add(4);
        stringBinarySearchTree.Add(0);
        
  `````
        

third use method of the depth first traversals

``stringBinarySearchTree.preOrder();``

``System.out.println(stringBinarySearchTree.postOrder());``   it return array as require .

``stringBinarySearchTree.inOrder();``




# code challenge 16

--------------------

##  Challenge Summary
we want to create Getmax method to get the max value in the binary tree

## Whiteboard Process
![Whiteboard](https://user-images.githubusercontent.com/97642724/161041772-86eed48c-7573-4f52-8dc8-f5459d49cce0.png)

## Approach & Efficiency
time O(log(n)) space O(1)

## Solution

after create object and added som data just call method 
`BinarySearchTree<Integer> stringBinarySearchTree = new BinarySearchTree<>();
    stringBinarySearchTree.Add(10);
    stringBinarySearchTree.Add(20);
    stringBinarySearchTree.Add(600);
    stringBinarySearchTree.Add(500);
   stringBinarySearchTree.Add(40);
    stringBinarySearchTree.getMax()`

