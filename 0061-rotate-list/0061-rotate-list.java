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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null) return head;

        ListNode tail=head;
        ListNode sec=head.next;
        int len=1;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        tail.next=head;
        k=k%len;
        int steps=len-k;
        for(int i=0;i<steps-1;i++){
            head=head.next;
        }
        ListNode newHead=head.next;
        head.next=null;
        return newHead;
        
    }
}