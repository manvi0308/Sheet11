# Iterative Pre Order
Root Left Right
To convert recursive to iterative, we need to make use of additional Data Structure called as Stack
Stack follows LIFO Principle

### Algorithm
1) Push the root node to the stack
a) Pop an item from the stack and print it. 
b) Push right child of a popped item to stack 
c) Push left child of a popped item to stack
**The right child is pushed before the left child to make sure that the left subtree is processed first.**
## Dry Run
![](https://cdn.programiz.com/sites/tutorial2program/files/nodes-edges_0.png)
Stack == [1, .......]
Pop 1 from stack, push its right child and then left child on to the stack
Stack = [3, 2]
Output = 1
Item to be popped 2, push its right child and then left child on to the stack
Stack = [3, 5, 4]
Output = 1, 2
Item to be popped 4, it does not have any left or right child
Stack = [3, 5]
Output = 1, 2, 4
Item to be popped 5, it does not have any left or right child
Stack = [3]
Output = 1, 2, 4, 5
Item to be popped 3, it does not have any left or right child
Stack = [] -- **Empty Stack**
Output = 1, 2, 4, 5, 3





