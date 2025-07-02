# Reverse Integer Explanation

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes it to go outside the 32-bit signed integer range [-2³¹, 2³¹ - 1], return 0.

**Approach:**  
Convert the number to a string, strip the negative sign if present, reverse the characters using Python slicing ([::-1]), and convert it back to an integer. If the original number was negative, multiply the result by -1. Finally, check if it fits in the 32-bit signed integer range; if not, return 0.

We also did a math-only version using modulus and division to extract and build digits without using strings. While that version is closer to what you'd do in Java or C++, it's less readable in Python and more annoying to write unless you're avoiding string conversions for some reason.

**Key points:**  
- Converts number to string using `str(x)` and reverses with `[::-1]`.
- Sign handled separately using `abs(x)` and `-1 if x < 0 else 1`.
- Converts back with `int(...)`.
- Checks overflow:  
  - `INT_MAX = 2**31 - 1`  
  - `INT_MIN = -2**31`
- Math-only version (no strings): uses `% 10` and `// 10`, more verbose.
- Time complexity: **O(n)**  
- Space complexity: **O(n)**
