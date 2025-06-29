# Zigzag Conversion Explanation

Given a string `s` and an integer `numRows`, return the string formed by writing the characters in a zigzag pattern and reading them row by row.

**Approach:**  
Use a directional scan to simulate the zigzag pattern by appending characters to `numRows` separate strings (or rows). Each character is placed in the appropriate row based on whether we are moving down or up the zigzag. Once done, concatenate all the rows to get the final result.

We also explored a matrix simulation version, filling a 2D grid as the characters are placed in their zigzag positions, then reading row by row. While this version is visual and intuitive, it's shit because its slower and less memory-efficient.

**Key points:**  
- Uses a `StringBuilder[]` (in Java) or `vector<string>`/`list[str]` in other languages.
- String is immutable in Java: 
  - Each += operation creates a new string, copying the old content.
  - This leads to poor performance in loops (O(n²) time complexity).
- StringBuilder is mutable
  - It modifies characters in-place using .append().
  - Much more efficient for building strings inside loops (O(n) time).
- Using toCharArray in for (char c : s.toCharArray()) is similar to C++ for(auto c: s)
- Moves down until bottom row, then flips direction to move up.
- Two implementations:
  - Matrix-based: intuitive but uses more memory (O(n * numRows))
  - Optimized: clean, linear-time approach with minimal space.
- Avoids extra space using row-wise appending instead of building a grid.
- Time complexity is **O(n)** — each character is processed once.
- Space complexity is **O(n)** for the row buffers.
