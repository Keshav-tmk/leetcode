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
        ListNode slow=head,fast=head;
    while(fast.next!=null && fast.next.next!=null){
        slow=slow .next;
        fast=fast.next.next;
    }
    ListNode temp=head;
    ListNode mid=slow;
    
    ListNode curr=mid.next;
    mid.next=null;
    ListNode prev=null;
    while(curr!=null){
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }

    ListNode head2=prev;

    while(head2!=null){
        ListNode next1=temp.next;
        temp.next=head2;
        ListNode next2=head2.next;
        head2.next=next1;

        temp=next1;
        head2=next2;
    }








//         List<Integer> ans=new ArrayList<>();
        
//         ListNode temp=head;
//         while(temp!=null){
//             ans.add(temp.val);
//             temp=temp.next;
//         }
//         temp=head;
//         int l=0,r=ans.size()-1;
//         while(l<r){
//              temp.val=ans.get(l);
//              temp=temp.next;
//              temp.val=ans.get(r);
//              temp=temp.next;
//              l++;r--;
//         }
//         if (l == r) {
//     temp.val = ans.get(l);
// }

//        return ; 
    }
}