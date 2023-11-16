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
    ListNode mergeLL(ListNode l1, ListNode l2)
    {
        if(l1==null)
        return l2;
        if(l2==null)
        return l1;

        ListNode ans=new ListNode();
        ListNode temp=ans;  //temp acting as a tail
        
        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                temp.next=l1;
                temp=temp.next;
                l1=l1.next;
            }
            else
            {
                temp.next=l2;
                temp=temp.next;
                l2=l2.next;
            }
        }
        while(l1!=null)
        {
            temp.next=l1;
            temp=temp.next;
            l1=l1.next;
        }
        
        while(l2!=null)
        {
            temp.next=l2;
            temp=temp.next;
            l2=l2.next;
        }
        
        return ans.next;
    }
     ListNode midNode(ListNode head)
    {
        ListNode midprev=null, fast=head;
      ListNode mid=null;
        while(head!=null && head.next!=null)
        {
            midprev=(midprev==null)?head:midprev.next;
            head=head.next.next;
        }
        mid=midprev.next;
        midprev.next=null;
        return mid;
    }
   
    public ListNode sortList(ListNode head)
    {
    
        if(head==null || head.next==null)
            return head;
        
        ListNode mid=midNode(head);
        
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        
        return mergeLL(left,right);
    
    }
}