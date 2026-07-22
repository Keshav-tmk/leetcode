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
    public ListNode reverseKGroup(ListNode head, int k) {

        List<ListNode> ans = new ArrayList<>();
        ListNode temp = head;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        dummy.next = head;
        while (temp != null) {
            ans.add(temp);
            temp = temp.next;

        }
        for (int i = 0; i + k <= ans.size(); i = i + k) {
            int l = i;
            int r = i + k - 1;
            while (l < r) {
                ListNode t = ans.get(l);
                ans.set(l, ans.get(r));
                ans.set(r, t);
                l++;
                r--;
            }
        }
        temp = head;
        for (ListNode i : ans) {
            curr.next = i;
            curr = curr.next;
        }

        curr.next = null;

        return dummy.next;

    }
}