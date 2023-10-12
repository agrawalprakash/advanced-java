package app;

public class MiddleOfALinkedList {

    class ListNode {

        int val;
        ListNode next;

        ListNode (int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public ListNode middleNode(ListNode head) {

        if (head == null) {
            return null;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null) {
            
            fast = fast.next.next;
            slow = slow.next;
            
        }
        
        return slow;
        
    }
    
}
