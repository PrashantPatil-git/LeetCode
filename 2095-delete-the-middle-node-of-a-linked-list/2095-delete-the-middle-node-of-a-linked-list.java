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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }

        ListNode slow_ptr=head,fast_ptr=head;
        ListNode prevs=null;

        while(fast_ptr != null && fast_ptr.next != null){
            prevs=slow_ptr;
            slow_ptr=slow_ptr.next;
            fast_ptr=fast_ptr.next.next;
        }
        fast_ptr=slow_ptr.next;
        prevs.next=fast_ptr;
        slow_ptr.next=null;
        return head;

    }
}