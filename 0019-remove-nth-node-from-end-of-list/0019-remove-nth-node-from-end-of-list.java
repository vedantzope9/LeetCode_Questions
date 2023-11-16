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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head==null)
        return head;

        if(head.next==null && n==1)
        return null;

        ListNode temp=head;
        int len=0;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        int x=len-n;

        if(x==0)    //head 
        {
            head=head.next; 
        }
        else if(x==(len-1))   //last
        {
            temp=head;
            for(int i=0;i<x-1;i++)
            temp=temp.next;

            temp.next=null;
        }
        else{
            temp=head;
            for(int i=0;i<x-1;i++)
                temp=temp.next;
            
            temp.next=temp.next.next;
        }
        return head;
    }
}