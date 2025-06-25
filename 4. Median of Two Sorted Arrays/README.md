# Median of Two Sorted Arrays Explanation

Given two sorted arrays `nums1` and `nums2`, find the median of the merged sorted array.

**Approach:**  
Merge both arrays by appending `nums2` to `nums1` and sorting the result. Then compute the median based on whether the combined length is even or odd. IDK how is this a hard problem.

**Key points:**  
- Sorts the merged array to ensure elements are in order.  
- If size is even, returns average of two middle elements.  
- If size is odd, returns the middle element directly.  
- Binary search in `O(log(min(m, n)))` is could be used.
- Time complexity is **O((m + n) log(m + n))** due to sorting.  
- Space complexity is **O(m + n)** for the merged array.  
