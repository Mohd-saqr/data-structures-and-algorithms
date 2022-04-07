# Trees
the tree is type of non-linear data structures it contain Node and each BTNode has Node left and BTNode right and each nod connect by other .

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



# challenege 17 

# Challenge Summary
we want to create a breadth first for binary tree.

## Whiteboard Process
![Whiteboard (2)](https://user-images.githubusercontent.com/97642724/161599692-8ff2c2e1-b0f6-4347-a8b5-2ff17fac1c09.png)


## Approach & Efficiency
Time = O(Log(n)) , Space = O(1)

## Solution
create a binary tree and just call the method breadthFirst()
````
BinarySearchTree<Integer> stringBinarySearchTree = new BinarySearchTree<>();
stringBinarySearchTree.Add(10);
stringBinarySearchTree.Add(20);
stringBinarySearchTree.Add(600);
stringBinarySearchTree.Add(500);
stringBinarySearchTree.Add(40);
stringBinarySearchTree.breadthFirst();
````

# CHALLENGE 18 
## Challenge Summary

we want create first K-array tree and create tree-fizz-buzz method it return new k-array tree
and If the value is divisible by 3, replace the value with “Fizz” or
If the value is divisible by 5, replace the value with “Buzz” or
If the value is divisible by 3 and 5, replace the value with “FizzBuzz” or
If the value is not divisible by 3 or 5, simply turn the number into a String.
## Whiteboard Process
![Whiteboard (3)](https://user-images.githubusercontent.com/97642724/162096392-8c070a3a-a341-476c-a118-72edff41e449.png)


## Approach & Efficiency
time O(n) and space O(n)

## Solution
```
first create object from NArray_tree and add some Node
NArray_tree tree = new NArray_tree<>();
tree.setRoot(new N_arrayNode<Integer>(30));
tree.getRoot().getChildren().add(new N_arrayNode<Integer>(9));
tree.getRoot().getChildren().add(new N_arrayNode<Integer>(25));
tree.getRoot().getChildren().add(new N_arrayNode<Integer>(2));
N_arrayNode o= (N_arrayNode) tree.getRoot().children.get(0);
o.children.add(new N_arrayNode<Integer>(40));
tree.treeFizzBuzz(tree).printData(); // this method i created for see the output
```

