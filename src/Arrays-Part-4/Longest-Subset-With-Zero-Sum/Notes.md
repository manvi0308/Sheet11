1 3 -1 4 -4

Longest subarray with zero sum
[4, -4]

1 -1 2 -2
[1, -1],[2, -2], [1, -1, 2, -2]
maxLen = 4

## Approach
HM = <Key, Value>
The key would be equal to sum upto that index and Value would be the index
<1, 0>
<0, 1>
<2, 2>
<0, 3>
Sum would be zero, if the sum at a particular index is already present
in the HashMap

## Dry Run
cumSum = 1
hMap = <1, 0>

cumSum = 0
hMap = <1, 0>, <0, 1>

cumSum = 2
hMap = <1, 0>, <0, 1>, <2, 2>

cumSum = 0
hMap = <1, 0>, <0, 1>, <2, 2>, <0, 3>

16 1 13 -30 18 -18 14 11 6 3 -34 0 
