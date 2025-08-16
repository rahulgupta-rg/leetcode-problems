// Last updated: 8/16/2025, 7:13:41 PM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        ListNode head = new ListNode(0);
        ListNode tail=head;
        int carry = 0;

        while(l1!=null || l2!=null || carry!=0) {
            
            int digit1 = l1!=null ? l1.val : 0;
            int digit2 = l2!=null ? l2.val : 0;
            int sum = digit1+digit2+carry;
            int nodeVal=sum%10;
            ListNode newNode = new ListNode(nodeVal);
            tail.next=newNode;
            tail=tail.next;
            carry=sum/10;


            l1=l1!=null ? l1.next: null;
            l2=l2!=null ? l2.next: null;
        }
        return head.next;
    }

    //9,9,9,9,9,9,9
    //9,9,9,9
    
    //8,9,9,9,0,0,0,11
}