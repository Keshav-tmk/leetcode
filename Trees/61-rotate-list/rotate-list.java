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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null||head.next==null || k == 0)
            return head;

        int n = 0;
        ListNode temp = head;

        while (temp != null) {
            n++;
            temp = temp.next;
        }
        
        temp = head;
        k = k % n;
        if (k == 0)
            return head;

        for (int i = 1; i < n - k; i++) {
            temp = temp.next;

        }
        ListNode curr = temp.next;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;
        head = temp.next;
        temp.next = null;
        return head;

    }
}