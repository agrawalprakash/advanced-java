package app;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLists {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        Set<ListNode> listNodesSet = new HashSet<>();
        
        if (headA == null || headB == null) {
            
            return null;
            
        }
        
        while (headA != null) {
            
            listNodesSet.add(headA);
            
            headA = headA.next;
            
        }
        
        while (headB != null) {
            
            if (listNodesSet.contains(headB)) {
                
                return headB;
                
            }
            
            headB = headB.next;
            
        }
        
        return null;
        
        
    }
    
}
