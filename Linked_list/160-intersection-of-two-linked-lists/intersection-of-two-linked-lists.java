/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode help(ListNode l1,ListNode l2,int d){
        while(d-->0){
            l2=l2.next;
        }

        while(l1!=null && l2!=null){
            if(l1==l2)return l1;
            l1=l1.next;
            l2=l2.next;
        }
        return null;
    }
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        ListNode temp = head1;
        int n1 = 0;
        while (temp != null) {
            n1++;
            temp = temp.next;

        }

        int n2 = 0;
        temp = head2;
        while (temp != null) {
            n2++;
            temp = temp.next;
        }

        if(n1<n2){
            return help(head1,head2,n2-n1);
        }
        else return help(head2,head1,n1-n2);
      

        // ListNode temp = head1;
        // Map<ListNode, Integer> map = new HashMap<>();

        // while (temp != null) {
        //     map.put(temp, 1);
        //     temp = temp.next;
        // }
        // temp = head2;
        // while (temp != null) {
        //     if (map.containsKey(temp))
        //         return temp;
        //     temp = temp.next;
        // }
        // return null;
// return null;
    }
}