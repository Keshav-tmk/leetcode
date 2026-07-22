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
    public void reorderList(ListNode head) {
        List<Integer> ans=new ArrayList<>();
        
        ListNode temp=head;
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        int l=0,r=ans.size()-1;
        while(l<r){
             temp.val=ans.get(l);
             temp=temp.next;
             temp.val=ans.get(r);
             temp=temp.next;
             l++;r--;
        }
        if (l == r) {
    temp.val = ans.get(l);
}

       return ; 
        
    }
}