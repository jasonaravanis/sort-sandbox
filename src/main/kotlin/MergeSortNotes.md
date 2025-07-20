# Time complexity

There are two steps to the algorithm:

1. Divide array into subarrays until each array contains a single element
2. At each subdivision, sort elements in each subarray

Step 1 requires log(n) operations as we divide n by 2 recursively until we have dissected the entire array.

Step 2 requires (n) operations as we have to look at each element and sort it.

So overall it is O(n * log(n))

# Space complexity

The implementation sorts the array in place, creating a `temp` array of the same size to handle updates

So the space complexity is O(n). The recursion stack also takes O(log(n)), but that is a lower order of magnitude so we ignore it.
