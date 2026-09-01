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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int min=Integer.MAX_VALUE;
        int max=-1;

        ListNode prev=head;
        ListNode curr=head.next;

        int pos=1;

        int fc=-1;
        int lc=-1;

        while(curr.next!=null){
            ListNode next=curr.next;

            boolean ismax=curr.val>prev.val && curr.val>next.val;
            boolean ismin=curr.val<prev.val && curr.val<next.val;

            if(ismax||ismin){

                if(fc==-1){
                    fc=pos;
                }

                if(lc!=-1){
                    min=Math.min(min,pos-lc);
                }

                lc=pos;
            }

            prev=curr;
            curr=curr.next;
            pos++;

        }

        if(fc==-1||fc==lc)return new int[]{-1,-1};

        max=lc-fc;
        return new int[]{min,max};

        
    }
}