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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;

        if(head==null)
        return head;
    //Fast and slow pointer....
    ListNode fast=head, slow=head;

    while(fast!=null && fast.next!=null)
    {
        fast=fast.next.next;
        slow=slow.next;
    }
    return slow;

    //basic method
        // int len=0;
        // while(temp!=null)
        // {
        //     len++;
        //     temp=temp.next;
        // }
        // temp=head;
        // if(len%2==0)
        // {
        //     for(int i=0;i<len/2;i++)
        //     temp=temp.next;
        // }
        // else{
        //     for(int i=0;i<len/2;i++)
        //     temp=temp.next;
        // }
        // return temp;
    }
}