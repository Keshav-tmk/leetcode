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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int cnt = 0;
        ListNode temp = head;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        // if(cnt==1)return null;
        int req = cnt - n;
        temp = head;
        
        if (cnt == n)
            return head.next;

        for (int i = 1; i < req; i++) {
            temp = temp.next;

        }
        // if (temp.next != null)
            temp.next = temp.next.next;
        return head;
    }
}