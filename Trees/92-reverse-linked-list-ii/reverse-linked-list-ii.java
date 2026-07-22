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
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if (head == null || head.next == null || l == r)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;

        for (int i = 1; i < l; i++) {
            temp = temp.next;
        }
        ListNode curr = temp.next;
        ListNode prev = null;

        for (int i = 0; i <= r - l; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode left = temp.next;
        left.next = curr;
        temp.next = prev;

        return dummy.next;

    }
}