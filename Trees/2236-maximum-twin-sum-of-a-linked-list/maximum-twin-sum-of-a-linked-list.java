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


    public int pairSum(ListNode head) {
        int max=0;
        
        ListNode s=head,f=head;
        while(f!=null&&f.next!=null  ){
            s=s.next;
            f=f.next.next;
        }
        ListNode curr=s;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        while(prev!=null){
             max=Math.max(max,prev.val+head.val);
            prev=prev.next;
            head=head.next;
        }
        return max;
        
    }
}