## Approach

The trick is given that row wise and column wise sorted matrix.
That means if we just ignore that its a matrix, then we can consider that its a sorted array 

For a sorted array, we can always use **binary search**. 
The low index == 0
The high index == (row*col) - 1

middle = low + high/2
The element at the middle index is
### TBR: *matrix[middle/m][middle%m]*

#### In question if its like ArrayList of ArrayList, instead of a normal matrix,
#### the elements would be found like
arr.get(i).get(j) -- https://www.geeksforgeeks.org/arraylist-of-arraylist-in-java/

