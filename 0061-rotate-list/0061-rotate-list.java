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

        ListNode first=head;
        ListNode sec=head.next;
        int len=1;
        while(first.next!=null){
            len++;
            first=first.next;
        }
        k=k%len;
        first=head;
        while(k!=0){
            head=rotate(first,sec,head);
            first=head;
            sec=head.next;
            k--;
        }
        return head;

    }
    public ListNode rotate(ListNode first,ListNode sec,ListNode head){
        while(sec.next!=null){
            first=sec;
            sec=sec.next;
        }
        first.next=null;
        sec.next=head;
        return sec;
    }
}