# Graphs
 the graph is non leaner datastructures to use solve a lot of problem
the graph is use i real word in GPS and social media 

## Challenge 35
we want to implement the graph from scratch

## Approach & Efficiency
### Average cases:

 1 - Space O(V+E)

2-  Method and time complicity

 - addEdge -> O(k)
 - addNode - > O(1)
 - find Neighbors - > O (K)

### worst case if we have dense graph 
1 - Space O(V^2)

2-  Method and time complicity

- addEdge -> O(V)
- addNode - > O(1)
- find Neighbors - > O(V)

## API
```

just create i grap class and call all method suvh as :

Graph<String> stringGraph = new Graph<>();
stringGraph.addNode(value)
.
.
.


```


# code Challenge 36 
# Challenge Summary
we want to create breadth first Traversal for graph

## Whiteboard Process
![](./secreenshot/breadth%20first.png)

## Approach & Efficiency
Time = O(n^2)

Space = O(n)

## Solution

````
just create i grap class and call all method suvh as :

Graph<String> stringGraph = new Graph<>();
stringGraph.addNode(value)

then call the method breadthFirst 

stringGraph.breadthFirst(node).

````


# code Challenge 37 
# Challenge Summary

we want to create business trip to Determine whether the trip is possible with direct flights, and how much it would cost.

## Whiteboard Process
![](./secreenshot/business%20trip.png)

## Approach & Efficiency
Time = O(n^2)

Space = O(1)

## Solution

```
call the method in class 
the method is static so you can call it Without create instance 
from BusinessTrip class .
BusinessTrip.businessTrip(graph,array)


```


-------------------------------------

# code Challenge 38
# Challenge Summary

# Depth First Traversal
algorithm traverses a graph in a depth ward motion

## Challenge
we want to create Depth first for graph

## Approach & Efficiency

time  complexity O(N)
Space complexity O(N)

## Solution

![](./secreenshot/Depth%20first.png)

```
just create i grap class and call all method suvh as :

Graph<String> stringGraph = new Graph<>();
stringGraph.addNode(value)

then call the method breadthFirst 

stringGraph.breadthFirst(node).

```



