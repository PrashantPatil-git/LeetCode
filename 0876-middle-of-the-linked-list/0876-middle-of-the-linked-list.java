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
        
        if(head==null){
            return null;
        }

        ListNode slow_ptr=head;
        ListNode fast_ptr=head;

        while(fast_ptr != null && fast_ptr.next != null){
            slow_ptr=slow_ptr.next;
            fast_ptr=fast_ptr.next.next;
        }
        return slow_ptr;
    }
}