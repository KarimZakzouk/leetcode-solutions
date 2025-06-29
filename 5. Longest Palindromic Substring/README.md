# Longest Palindromic Substring Explanation

Given a string `s`, find the longest substring which is a palindrome.

**Approach:**  
For each character in the string, try to expand around it to find the longest possible palindrome centered at that point. Two types of palindromes are checked:
- **Odd-length**, centered at a single character (e.g., `"aba"`)
- **Even-length**, centered between two characters (e.g., `"abba"`)
Another approach is going through each letter and check for an edge case where the previous and next letter aren't equal, and the current and next letters are.

This is done by expanding outward from the center while the characters on both sides match.

**Key points:**  
- Uses two-pointer expansion from each center.
- Updates the longest found palindrome based on window size.
- Checks both even- and odd-length palindromes.
- Returns the longest match found after scanning the entire string.
- Time complexity is **O(n²)** due to sorting.  
- Space complexity is **O(1)** for the merged array.  