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
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow=head, fast=head;

       // find middle element
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;

        }
          // for odd nodes
          if(fast !=null ){
            slow=slow.next;
          }

          slow= reverseList(slow);
          fast=head;

          while(slow != null){ 
          if(fast.val != slow.val){
            return false;
          }

          slow=slow.next;
          fast=fast.next;
           

          }
          return true;

    }


    private ListNode reverseList(ListNode head){
        
        ListNode prev=null;
        ListNode curr=head;

        while(curr != null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
      

        return prev;
    }
}