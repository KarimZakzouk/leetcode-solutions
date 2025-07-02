# String to Integer (atoi) Explanation

Given a string `s`, convert it to a 32-bit signed integer, mimicking the behavior of C/C++'s `atoi`.  
The function should ignore leading whitespace, recognize an optional `+` or `-` sign, and read in as many numerical digits as possible.  
The result is clamped to the 32-bit signed integer range: **[-2³¹, 2³¹ - 1]**.

**Approach:**  
We implemented the solution using multiple techniques depending on the language:

- **Python (Regex-based):**
  - Trim leading spaces with `s.lstrip()`.
  - Use regex `^([+-]?)\d+` to extract a valid number prefix.
  - Convert the match to an integer using `int(...)`.
  - Clamp the value if it exceeds 32-bit bounds using:
    - `INT_MAX = 2**31 - 1`
    - `INT_MIN = -2**31`

- **C++ & Java Math-based:**
  - Iterate through characters of the string manually.
  - Skip leading spaces with a loop.
  - Check for optional sign (`+` or `-`).
  - Accumulate digits using math: `solution = solution * 10 + (s[i] - '0')`
  - Detect overflow before it happens using `long` or `double`, then clamp.
  - Return `INT_MAX` or `INT_MIN` if out of bounds.

**Key points:**  
- Regex version is compact and readable in Python.
- C++ and Java versions are lower-level but give more control over parsing.
- long is 32bits and double is 64bits
- Time complexity: **O(n)**  
- Space complexity: **O(1)**
