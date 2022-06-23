Step 1: Linearly traverse array from backward such that ith index value of the array is less than (i+1)th index value. Store that index in a variable. -- **While traversing from backwards, find the First element that is lesser than element from its right side**

Step 2: If the index value received from step 1 is less than 0. This means the given input array is the largest lexicographical permutation. Hence, we will reverse the input array to get the minimum or starting permutation. 

Otherwise, Linearly traverse array from backward. Find an index that has a value greater than the previously found index. Store index another variable. **Finding the element that is greater than the first smallest element from right side**

Step 3: Swap values present in indices found in the above two steps.

Step 4: Reverse array from index+1 where the index is found at step 1 till the end of the array.

## Dry Run
[2, 3, 1, 4, 5]
Step 1: Find the first element that is lesser than element at its immediate right position
temp = 4
index1 = 3 (index of temp)

Step 2: Find the first element that is greater than the temp element.
temp2 = 4
index2 = 4 (index of temp2)

Swap elements at index1 and index2
[2, 3, 1, 5, 4]

Reverse array from index1 + 1= 3 + 1 = 4 till index2 = 4
[2, 3, 1, 5, 4]