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
        ListNode ansList = null; 
        ListNode digit = ansList; // current digit

        int rem = 0; // remainder

        for (; l1 != null || l2 != null || rem != 0; l1 = l1 != null ? l1.next : null, l2 = l2 != null ? l2.next : null) {
            int d1 = l1 != null ? l1.val : 0;
            int d2 = l2 != null ? l2.val : 0;

            int sum = d1 + d2 + rem;
            rem = sum > 9 ? 1 : 0;

            // Create a new node only if there are more digits or if there's a remainder
            if (ansList == null) {
                ansList = new ListNode(0);
                digit = ansList;
            } else {
                digit.next = new ListNode(0);
                digit = digit.next;
            }

            digit.val = sum % 10;
        }

        return ansList;
    }
}