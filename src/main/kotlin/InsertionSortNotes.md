# Time complexity

## Worst case: O(n^2)

Array is in reverse order

We need to loop over every element in the array

and within that loop, we need to loop over every preceding element

for nth element we need to do (n - 1) comparisons to find the spot to put it into the array

So total comparisons is 1 + 2 + ... + (n - 1) = n(n-1)/2

Which reduces to O(n^2)

## Best case: O(n) 

when array is already sorted, we loop over the array a single time

This sort algorithm might be a good choice if we expect the data is already mostly sorted

## Average case: O(n^2)

We need to loop over every element in the array

and within that loop, on average we will need to loop over half of the elements to find the spot to insert a given value.

for nth element we need to do (n - 1)/2 comparisons to find the spot to put it into the array

So total comparisons is 1/2 + 2/2 + 3/2 + ... + (n - 1)/2 = (1/2) * n(n-1)/2

Which reduces to O(n^2). Same as worst case but fewer operations in practice.


# Space complexity

O(1) - no need to create new data structures as the array is sorted in place
