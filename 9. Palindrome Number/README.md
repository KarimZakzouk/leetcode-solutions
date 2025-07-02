# Palindrome Number Explanation

Given an integer `x`, determine if it is a palindrome (reads the same forward and backward).

**Approach:**  

- **C++ (Half-Reverse Optimized):**
  - Reject negatives.
  - Reverse only half of the number (`reversed >= x`).
  - Avoids overflow and extra space.

- **Python (String-Based):**
  - Return `False` if `x < 0`.
  - Use `str(x)[::-1]` and compare to original.
  - One-liner, but uses extra space.

- **Java (Full-Reverse Math):**
  - Use `long` to build reversed digits.
  - Reverse with `rev = rev * 10 + digit`.
  - Compare to original number.

**Key Points:**
- Python is short and readable but not space-efficient.
- C++/Java use pure math to avoid string conversion.
- Half-reverse avoids overflow and is more efficient.
- Time complexity: **O(log₁₀n)**
- Space complexity: **O(1)** for math-based, **O(n)** for string-based