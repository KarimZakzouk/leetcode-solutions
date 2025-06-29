/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode S = new ListNode();
        ListNode solution = S;
        int rem = 0;

        while(l1 != null || l2 != null || rem != 0){
            int sum = rem;
            if(l1 != null){
                sum +=l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum +=l2.val;
                l2 = l2.next;
            }
            rem = sum / 10;
            S.val = sum % 10;

            if (l1 != null || l2 != null || rem != 0) {
                S.next = new ListNode();
                S = S.next;
            }
        }
        return solution;
    }
}