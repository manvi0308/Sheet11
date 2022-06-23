## Important Points

arr1 has a size large enough to add all the elements of arr1 and arr2<br>
Both the arrays are sorted<br>

arr1[] = 1 2 3 0 0 <br>
arr2[] = 4 5<br>

## Approach

1) Take 2 pointers one from the last of arr1 (m - n + 1) and another pointing to last of arr2.

2) Compare the last elements whichever is greater insert it to the correct position. Maintain a separate variable to maintain the index of the final sorted array
   
