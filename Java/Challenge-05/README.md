# Challenge Summary

we want to create method insertBefeore adn insertAfter and Append ,

## Whiteboard Process
![insertBefore](https://user-images.githubusercontent.com/97642724/156894988-ff5134f9-2de9-4e8e-8bc3-ad04dfbc1ce9.png)
![append](https://user-images.githubusercontent.com/97642724/156895004-ec52ae41-f16d-449f-84e0-befd452ddbb5.png)
![insertAfter](https://user-images.githubusercontent.com/97642724/156895024-dae8b20d-ebc5-495e-b9b2-71dd4176434a.png)


## Approach & Efficiency
i use tail to make O(1) and write the code in the best way to get lesser time

## Solution
### insertBefeore

```
LinkedList newLinkedList = new LinkedList();
insertBefeore.append(10); // linkedList become 10 => null
newLinkedList.insertBefeore(10,5); // the LinkedList become 5 => 10 => NULL


```

### insertAfter

```
LinkedList newLinkedList = new LinkedList();
newLinkedList.append(10); // linkedList become 10 => null
newLinkedList.insertAfter(10,5); // the LinkedList become 5 => 10 => NULL
```

### append

```
LinkedList newLinkedList = new LinkedList();
newLinkedList.append(10); // linkedList become 10 => null
newLinkedList.append(5); // linkedList become 10 => 5 => NULL
```


### Delete 

```
LinkedList newLinkedList = new LinkedList();
newLinkedList.append(10); // linkedList become 10 => null
newLinkedList.append(5); // linkedList become 10 => 5 => NULL
newLinkedList.append(0); // linkedList become 10 => 5 => 0 =>NULL
newLinkedList.Delete(5) // linkedList become 10 =>  0 =>NULL

```

