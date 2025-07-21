# Regular Expression Matching Explanation

Given a string `s` and a pattern `p`, implement regular expression matching with support for `'.'` (matches any single character) and `'*'` (matches zero or more of the preceding element). Return `True` if `s` matches the pattern `p`.

**Approach:**

  - Use a 2D `dp` table: `dp[i][j]` is `true` if `s[0:i]` matches `p[0:j]`.
  - Initialize `dp[0][0] = true` (empty string vs empty pattern).
  - For `'*'`:  
    - `dp[i][j] = dp[i][j-2]` (zero occurrence),  
    - Or `dp[i-1][j]` if preceding char matches (`one+ occurrence`).
  - Use `s[i - 1]` and `p[j - 1]` carefully to handle 1-based indexing in `dp`.

**Key Points:**
- `'.'` matches any single character.
- `'*'` applies to the character before it.
- Must handle edge cases like `"a"` vs `"a*"`, or empty strings.
- Typical mistake: off-by-one indexing or mishandling `'*'`.
- Dynamic programming ensures optimal substructure is reused.
- Time complexity: **O(m × n)** where `m = len(s)`, `n = len(p)`.
- Space complexity: **O(m × n)** for the `dp` table.
