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
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null, present=head, next=head.next;

        while(present!=null)
        {
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null)
            next=next.next;
        }
        head=prev;
        return head;
    }

    public boolean isPalindrome(ListNode head)
    {
        if(head==null || head.next==null)
        return true;

        ListNode fast=head,slow=head;
      
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=reverse(slow);

        while(mid!=null && head!=null)
        {
            if(mid.val != head.val)
            return false;
            else{
            mid=mid.next;
            head=head.next;
            }
        }

        return true;
    }
}