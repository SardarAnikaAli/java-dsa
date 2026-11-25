# 1 Linear Search

## Problem
Find the target value in an array. Return its index if found; otherwise, return -1.

## Approach
- Traverse the array from left to right.
- Compare each element with the target.
- If a match is found, return the current index.
- If no match is found, return -1.

## Complexity
- Best-case time: O(1)
- Worst-case time: O(n)
- Auxiliary space: O(1)


# 2 Reverse an Array
## Problem
Given an integer array, reverse its elements in-place.
The first element becomes the last, the second becomes the second-last, and so on.

## Example
**Input:**
```text
[20, 10, 2, 15]
```
**Output:**
```text
[15, 2, 10, 20]
```
## Approach: Two-Pointer Technique
1. Initialize `left = 0` and `right = array.length - 1`.
2. Run a loop while `left < right`.
3. Store the left element in a temporary variable.
4. Swap the left and right elements.
5. Increment `left` and decrement `right`.
6. Stop when the pointers meet or cross.

## Complexity
- Time Complexity: O(n)
- Auxiliary Space Complexity: O(1)

## Key Learning
- Two-pointer technique
- Swapping array elements using a temporary variable
- Modifying an array in-place
- An array of odd length has a middle element that does not need to be swapped.

# 3 Move Zeroes

## Problem
Given an integer array, move all zeroes to the end while maintaining the relative order of non-zero elements.

The operation must be performed in-place without creating another array.

## Example
**Input:**
```text
[0, 5, 0, 2, 8]
```

**Output:**
```text
[5, 2, 8, 0, 0]
```

## Approach: Two-Pointer Technique
1. Initialize `position = 0`.
2. Traverse the array using `i`.
3. If `a[i]` is non-zero:
    - Copy `a[i]` to `a[position]`.
    - If `position != i`, set `a[i]` to zero.
    - Increment `position`.
4. After traversal, all non-zero elements are at the beginning and zeroes are at the end.

## Why the `position != i` Check?
When `position` and `i` are equal, the element is already in its correct position.
Setting `a[i] = 0` in this situation would erase the non-zero element.

## Complexity
- Time Complexity: O(n)
- Auxiliary Space Complexity: O(1)

## Key Learning
- Two-pointer technique
- In-place array modification
- Preserving the relative order of elements
- Avoiding accidental overwriting of array values