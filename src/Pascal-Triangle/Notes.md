## Points to be taken care of

1) Elements at edge positions should be 1.
2) No of elements at row i == i
   For example, n == 5
   [1, ---, ---, ---, 1]
    0,  1 ,  2 , 3  , 4
    1 in 0th index
    1 in ith index for ith row

3) **M[4][2] == M[4-1][2-1] + M[4 - 1][2]**
   For ith row and jth column, sum of i-1 th row, j - 1th col and i-1th row and j + 1th col
