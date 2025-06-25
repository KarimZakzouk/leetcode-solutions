# Two Sum Problem Explanation

Given an array of integers and a target sum, the goal is to find two numbers whose sum equals the target and return their indices.

**Approach :**  
Use a hash map to store each number index and its value as you iterate through the array. For each number, check if the complement (target minus the current number) exists in the hash. If it does, you've found the pair, if not then add it to the hashmap.

**Key points:**  
- Single-pass solution.  
- Efficient O(1) average lookup using the hash map.  
- Handles duplicates correctly by checking before inserting.  
- Time complexity is O(n).
- Space complexity is O(n).