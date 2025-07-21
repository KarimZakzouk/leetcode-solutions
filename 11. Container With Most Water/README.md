# Container With Most Water Explanation

Given an array `height` of non-negative integers where each element represents the height of a vertical line at that index, find two lines that together with the x-axis form a container such that the container contains the most water.

**Approach:**

- Use the **two-pointer technique** to optimize the search.
- Initialize two pointers: `l = 0` (left) and `r = height.length - 1` (right).
- Calculate initial area as `min(height[l], height[r]) * (r - l)`.
- In each iteration:
  - Move the pointer pointing to the **shorter** height inward (to try finding a taller line).
  - Update the `area` as the maximum of the current and newly calculated area.
- Stop when `l == r`.

**Key Points:**
- Water contained is limited by the shorter line: `min(height[l], height[r])`.
- Move the shorter line pointer because the area can only improve by increasing the shorter side.
- This avoids brute-force O(n²) and achieves linear performance.

**Time Complexity:** `O(n)` — each element is visited once by either `l` or `r`.
**Space Complexity:** `O(1)` — uses only a few integer variables.
