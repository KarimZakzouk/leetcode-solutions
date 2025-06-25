# Add Two Numbers Problem Explanation

Given two non-empty linked lists representing two non-negative integers in reverse order, add the numbers and return the result as a linked list.

**Approach:**  
Start with an empty result node. Traverse both lists simultaneously, adding corresponding digits and a carry from the previous step. Store the digit part of the sum in the current node, and update the carry. Move to the next nodes, and create a new node if needed. Continue until both lists and the carry are processed.

**Key points:**  
- Only creates new nodes if there’s more input or a remaining carry.  
- Time complexity is O(n).  
- Space complexity is O(n).
- Java does not implicitly convert objects to boolean like Python or C++.
