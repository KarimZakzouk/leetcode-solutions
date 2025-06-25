# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        S = ListNode()
        solution = S
        rem = 0
        while l1 or l2 or rem:
            sum = rem
            if l1:
                sum += l1.val
                l1 = l1.next
            if l2:
                sum += l2.val
                l2 = l2.next
            S.val = sum % 10
            rem = sum //10

            if l1 or l2 or rem:
                S.next = ListNode()
                S = S.next
        return solution
            
