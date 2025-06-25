# Longest Substring Without Repeating Characters – Explanation

Given a string, find the length of the longest substring without repeating characters.

**Approach:**  
Use a sliding window with two pointers to track the current substring. A hash map keeps count of characters. When a duplicate is found, move the left pointer to shrink the window and decrease its frequency until the substring is valid again. Update the max length during each step. It works because we want a Substring, meaning we want our solution to be in one window. That's why sliding a window will guarantee that we will find the solution

**Key points:**  
- Uses a hash map to track character frequency.  
- Can use set too, same thing
- Efficient single-pass, sliding window technique.  
- Handles all cases, including strings with all unique or all duplicate characters. 
- In Java using a set is easier than hashmap due its shitty syntax
- Instead of using set or hasmap we can use bool boolean[128];  // ASCII size faster
- Time complexity is O(n).  
- Space complexity is O(k), where k is the number of unique characters