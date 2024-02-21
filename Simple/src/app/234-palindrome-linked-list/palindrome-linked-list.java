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
        
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast.next != null && fast.next.next != null) {
            
            slow = slow.next;
            fast = fast.next.next;
            
        }
        
        if (fast != null) slow = slow.next;
        
        ListNode revHead = reverse (slow);
        
        while (revHead != null) {
            
            if (head.val != revHead.val) return false;
            
            head = head.next;
            revHead = revHead.next;
            
        }
        
        return true;
        
        
    }
    
    public ListNode reverse(ListNode head) {
        
        ListNode prev = null;
        
        while(head != null) {
            
            ListNode next = head.next;
            
            head.next = prev;            
            prev = head;
            head = next;
            
        }
        
        return prev;
        
    }
}