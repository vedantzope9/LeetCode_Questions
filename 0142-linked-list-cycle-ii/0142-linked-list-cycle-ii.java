/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head)
    {
        ListNode fast=head,slow=head;
        int len=0;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow)
            {
               ListNode temp=head;

               while(temp!=slow)
               {
                   slow=slow.next;
                   temp=temp.next;
               }
               return temp;
            }
        }
        return null;
    }
}