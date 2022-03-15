# Stacks and Queues

the stack it's similar as box , the concept of the stack is FILO , and the queue it's similar than array ,the concept of
the queue is FIFO

## Challenge

we want to crate a queue class and method for that and stack class with method

## Approach & Efficiency

All method used O(1) time and performance

## API

first create StackDS

```
StackDs stackds = new StackDs(); create object from class
stackDs.IsEmpty() // will return true 
stackDs.Push(10); // add 10 element to the top
stackDs.Push(20); // add 20 element to the top
stackDs.IsEmpty() // will return false 
stackDs.size(); will return 2 
stackDs.peek(); will return 20
stackDs.pop() ; will retern 20 and delete 20 element 

Note : you can add multi type of value Int , string ,... 
stackDs.Push(10);
stackDs.Push("mohammed");
 
```

first create QueueDs

````
 queueDs = new QueueDs<>(); 
 queueDs.IsEmpty(); will return true
 queueDs.enqueue("mohammed"); will add "mohammed" to the rear and front 
 queueDs.enqueue("ahmad"); will add "mohammed" to the rear 
 queueDs.dequeue(); will return mohammed and remove mohammed value 
 queueDs.peek() will return for you after dequeue ahmad
````

