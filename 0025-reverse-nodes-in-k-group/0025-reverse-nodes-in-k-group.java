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
    
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        if(k<=1 || head==null)
        return head;

        int count=0;
        ListNode temp=head;

        while(temp!=null && count<k)
        {
            temp=temp.next;
            count++;
        }
        
        if(count<k)
        return head;
        else
        {
            ListNode prev=null, pres=head, next=head.next;
            count=0;

            while(count<k)
            {
                pres.next=prev;
                prev=pres;
                pres=next;
                if(next!=null)
                next=next.next;
                count++;
            }
            head.next=reverseKGroup(pres,k);
            return prev;
        }

    }
}