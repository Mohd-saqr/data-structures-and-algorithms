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


