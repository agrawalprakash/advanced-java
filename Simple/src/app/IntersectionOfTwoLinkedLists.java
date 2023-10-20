package app;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists {

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        Set<ListNode> hashSet = new HashSet<>();
                
        if (headA == null || headB == null) {
            return null;
        }
        
        while (headA != null) {
            hashSet.add(headA);
            headA = headA.next;
        }
    
        while (headB != null) {
            
            if (hashSet.contains(headB)) {
                return headB;
            }
            
            headB = headB.next;
            
        }
        
        return null;
    }
}