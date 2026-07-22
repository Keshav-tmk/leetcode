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

        ListNode dummy=new ListNode(0);

        dummy.next=head;
        ListNode prevgrp=dummy;
        

        while(true){
            ListNode kth=prevgrp;

            for(int i=0;i<k&& kth!=null;i++){
                kth=kth.next;
            }
            if(kth==null)break;
            ListNode grpnext=kth.next;
            ListNode prev=grpnext;
            ListNode curr=prevgrp.next;
            while(curr!=grpnext){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            ListNode temp=prevgrp.next;
            prevgrp.next=prev;
            temp.next=curr;
            prevgrp=temp;

            
        }

        return dummy.next;











        // List<ListNode> ans = new ArrayList<>();
        // ListNode temp = head;
        // ListNode dummy = new ListNode(0);
        // ListNode curr = dummy;
        // dummy.next = head;
        // while (temp != null) {
        //     ans.add(temp);
        //     temp = temp.next;

        // }
        // for (int i = 0; i + k <= ans.size(); i = i + k) {
        //     int l = i;
        //     int r = i + k - 1;
        //     while (l < r) {
        //         ListNode t = ans.get(l);
        //         ans.set(l, ans.get(r));
        //         ans.set(r, t);
        //         l++;
        //         r--;
        //     }
        // }
        // temp = head;
        // for (ListNode i : ans) {
        //     curr.next = i;
        //     curr = curr.next;
        // }

        // curr.next = null;

        // return dummy.next;

    }
}